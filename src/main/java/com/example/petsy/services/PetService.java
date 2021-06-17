package com.example.petsy.services;

import java.util.List;

import com.example.petsy.dto.PetDescriptionDTO;
import com.example.petsy.dto.PetFullDescriptionDTO;
import com.example.petsy.models.Pet;

public interface PetService {

	public List<PetDescriptionDTO> findAllPartialDescription();
	
	public List<PetFullDescriptionDTO> findAll();

	public Pet findById(String id);

	public Pet save(Pet pet);

	public Pet update(String id, Pet entity);

	public void delete(String id);

}
