package com.example.petsy.services;

import com.example.petsy.dto.UsersDTO;

import java.util.List;

public interface IUserService {
    List<UsersDTO> findAll();
    UsersDTO findById(Long id);
    UsersDTO save(UsersDTO usersDTO);
    void deleteById(Long id);
}