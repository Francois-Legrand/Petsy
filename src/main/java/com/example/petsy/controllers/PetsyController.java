package com.example.petsy.controllers;

import java.util.List;


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

import com.example.petsy.dto.PetFullDescriptionDTO;
import com.example.petsy.dto.PetsyDto;
import com.example.petsy.services.imp.PetsyServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("petsys")
public class PetsyController {

	@Autowired
	PetsyServiceImpl service;

	@GetMapping
	public List<PetsyDto> findAll() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public PetsyDto recupPetsyServiceId(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PutMapping("")
	public PetsyDto update(@RequestBody PetsyDto petsyDto) {
		return service.update(petsyDto);
	}

	@PostMapping
	public PetsyDto create(@RequestBody PetsyDto petsyDto) {
		return service.create(petsyDto);
	}
	

	@DeleteMapping
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
