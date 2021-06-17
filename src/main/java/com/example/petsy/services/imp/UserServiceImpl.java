package com.example.petsy.services.imp;

import com.example.petsy.dto.UsersDTO;
import com.example.petsy.models.User;
import com.example.petsy.repositories.IUserRepository;
import com.example.petsy.services.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
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
        users.forEach(user -> {
            getUsersDTOS.add(
                    this.mapper.convertValue(user, UsersDTO.class)
            );
        });
        return getUsersDTOS;
    }

    @Override
    public UsersDTO findById(String id) {
        return mapper.convertValue(this.repository.findById(id).get(), UsersDTO.class);
    }

    @Override
    public UsersDTO save(UsersDTO usersDTO) {
        User user = mapper.convertValue(usersDTO, User.class);
        return mapper.convertValue(this.repository.save(user), UsersDTO.class);
    }

    @Override
    public void deleteById(String id) {
        this.repository.deleteById(id);
    }
}
