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

import com.example.petsy.dto.PetDescriptionDTO;
import com.example.petsy.dto.PetFullDescriptionDTO;
import com.example.petsy.models.Pet;
import com.example.petsy.services.imp.PetServiceImpl;

@RestController
@RequestMapping("pets")
@CrossOrigin
public class PetController {

	@Autowired
	private PetServiceImpl service;

	@GetMapping("")
	public List<PetDescriptionDTO> findAllPartialDescription() {
		return service.findAllPartialDescription();
	}

	@GetMapping("/description")
	public List<PetFullDescriptionDTO> findAll() {
		return service.findAll();
	}

	@GetMapping("{id}")
	public Pet findById(@PathVariable String id) {
		return service.findById(id);
	}

	@PutMapping("")
	public Pet update(@RequestBody Pet pet) {
		return service.save(pet);
	}

	@PostMapping("")
	public Pet save(@RequestBody Pet pet) {
		return service.save(pet);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
