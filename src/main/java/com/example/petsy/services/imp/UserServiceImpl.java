package com.example.petsy.services.imp;

import com.example.petsy.dto.UsersDTO;
import com.example.petsy.models.User;
import com.example.petsy.repositories.IUserRepository;
import com.example.petsy.services.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements IUserService {

    private final IUserRepository repository;
    private ObjectMapper mapper;

    public UserServiceImpl(IUserRepository repository, ObjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<UsersDTO> findAll() {
        List<User> users = this.repository.findAll();
        List<UsersDTO> getUsersDTOS = new ArrayList<>();
        users.forEach(user -> getUsersDTOS.add(
                this.mapper.convertValue(user, UsersDTO.class)
        ));
        return getUsersDTOS;
    }

    @Override
    public UsersDTO findById(String id) {
        return mapper.convertValue(this.repository.findById(id).get(), UsersDTO.class); //Warning:(36, 65) 'Optional.get()' without 'isPresent()' check
    }

    @Override
    public UsersDTO save(UsersDTO usersDTO) throws NoSuchAlgorithmException, InvalidKeySpecException {
        User user = mapper.convertValue(usersDTO, User.class);
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        KeySpec spec = new PBEKeySpec(user.getPassword().toCharArray(), salt, 655536, 128);
        SecretKeyFactory factory;
        {
            try {
                factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            } catch (NoSuchAlgorithmException e) {
                throw new NoSuchAlgorithmException( e.getMessage() );
            }
        }

        byte[] hash;

        {
            try {
                hash = factory.generateSecret(spec).getEncoded();
            } catch (InvalidKeySpecException e) {
                throw new InvalidKeySpecException( e.getMessage() );
            }
        }
        user.setPassword(Arrays.toString(hash));
        return mapper.convertValue(this.repository.save(user), UsersDTO.class);
    }
/*
    Version save sur User
    @Override
    public User save(User user) throws NoSuchAlgorithmException, InvalidKeySpecException {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        KeySpec spec = new PBEKeySpec(user.getPassword().toCharArray(), salt, 655536, 128);
        SecretKeyFactory factory;
        {
            try {
                factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            } catch (NoSuchAlgorithmException e) {
                throw new NoSuchAlgorithmException( e.getMessage() );
            }
        }

        byte[] hash;

        {
            try {
                hash = factory.generateSecret(spec).getEncoded();
            } catch (InvalidKeySpecException e) {
                throw new InvalidKeySpecException( e.getMessage() );
            }
        }
        user.setPassword(Arrays.toString(hash));
        return this.repository.save(user);
    }
*/

    @Override
    public void deleteById(String id) {
        this.repository.deleteById(id);
    }
}
