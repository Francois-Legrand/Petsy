package com.example.petsy.services;

import com.example.petsy.dto.UsersDTO;
import com.example.petsy.models.User;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

public interface IUserService {
    List<UsersDTO> findAll();
    UsersDTO findById(String id);
    UsersDTO findByUsername(String name);
    UsersDTO save(UsersDTO usersDTO) throws NoSuchAlgorithmException, InvalidKeySpecException;
    //User save(User user) throws NoSuchAlgorithmException, InvalidKeySpecException;
    void deleteById(String id);
}