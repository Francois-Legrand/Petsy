package com.example.petsy.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class PetsyController {
	@RestController
	@CrossOrigin
	@RequestMapping("petsy's")
	public class PetsyController {

	    @Autowired
	    PetsyService service;

	    @GetMapping
	    public List<GetPetsyDTO> findAll() {
	        return service.findAll();
	    }

	    @GetMapping("/{id}")
	    public PetsyService recupPetsyServiceId(@PathVariable String id) {
	        return service.findById(id);
	    }

	    @GetMapping("{id}")
	    public GetUsersDTO findById(@PathVariable String id) {
	        return service.findById(id);
	    }

	    @GetMapping("/name/{name}")
	    public Optional<User> findByNom(@PathVariable String name) {
	        Optional<User> user = service.findByNom(name);
	        return user;
	    }

	    @PostMapping
	    public User save(@RequestBody User user) {
	        return service.save(user);
	    }

	    @PutMapping
	    public User edit(@RequestBody User user) {
	        return service.save(user);
	    }

	    @DeleteMapping
	    public void delete(@RequestBody User user) {
	        service.delete(user);
	    }
	}


}
