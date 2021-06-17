package com.example.petsy.services;

import com.example.petsy.dto.UsersDTO;
import com.example.petsy.models.User;

import java.util.List;

public interface IUserService {
    List<UsersDTO> findAll();
    UsersDTO findById(String id);
    //UsersDTO save(UsersDTO usersDTO);
    User save(User user);
    void deleteById(String id);
}