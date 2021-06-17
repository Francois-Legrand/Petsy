package com.example.petsy.controllers;

import com.example.petsy.dto.UsersDTO;
import com.example.petsy.models.User;
import com.example.petsy.services.imp.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("users")
public class UsersController {

    @Autowired
    UserServiceImpl service;

    @GetMapping
    public List<UsersDTO> findAll(){ return service.findAll();}
    @GetMapping("/{id}")
    public UsersDTO getUsername(@PathVariable String id){ return service.findById(id);}
    @GetMapping("/name/{name}")

    public UsersDTO findByUsername(@PathVariable String name){
        return findByUsername(name);
    }

    @PostMapping
    public User save(@RequestBody User user){ return service.save(user);}

    @PutMapping
    public User edit(@RequestBody User user){ return service.save(user);}
}
