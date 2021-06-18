package com.example.petsy.controllers;

import com.example.petsy.dto.UsersDTO;
import com.example.petsy.models.User;
import com.example.petsy.services.imp.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

/**
 *
 */
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

    @GetMapping("/name/{name}")         //Warning:(26, 21) Method 'findByUsername()' recurses infinitely, and can only end by throwing an exception
    public UsersDTO findByUsername(@PathVariable String name){
        return findByUsername(name);
    }

    @PostMapping
    public UsersDTO save(@RequestBody UsersDTO usersDTO) throws NoSuchAlgorithmException, InvalidKeySpecException { return service.save(usersDTO);}

    @PutMapping
    public UsersDTO edit(@RequestBody UsersDTO usersDTO) throws NoSuchAlgorithmException, InvalidKeySpecException {return service.save(usersDTO);}

    /*@PostMapping
    public User save(@RequestBody User user) throws NoSuchAlgorithmException, InvalidKeySpecException { return service.save(user);}

     */

    /*@PutMapping
    public User edit(@RequestBody User user) throws NoSuchAlgorithmException, InvalidKeySpecException { return service.save(user);}

     */
}
