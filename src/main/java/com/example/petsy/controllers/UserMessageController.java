package com.example.petsy.controllers;

import com.example.petsy.dto.UserMessageDto;
import com.example.petsy.dto.UsersDTO;
import com.example.petsy.services.imp.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("")
public class UserMessageController {
    @Autowired
    UserServiceImpl service;

    @GetMapping
    public List<UserMessageDto> findAll(){
        return this.service.findAll();
    }
    @GetMapping("{id}")
    public UserMessageDto findById(@PathVariable String id){
        return this.service.findById(id);
    }
    @PutMapping
    public UserMessageDto edit(@RequestBody UserMessageDto userMessageDto){
        return this.service.save(userMessageDto);

    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id){
        this.service.deleteById(id);
    }
    @PostMapping
    public void save(@RequestBody UserMessageDto userMessageDto){
        return this.service.save(userMessageDto);
    }

}
