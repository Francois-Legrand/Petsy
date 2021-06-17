package com.example.petsy.services.imp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.petsy.dto.PetDescriptionDTO;
import com.example.petsy.dto.PetFullDescriptionDTO;
import com.example.petsy.models.Pet;
import com.example.petsy.services.PetService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PetServiceImpl implements PetService {

	private MongoRepository<Pet, String> repository;
	private ObjectMapper mapper;

	public PetServiceImpl(MongoRepository<Pet, String> repository, ObjectMapper mapper) {
		this.mapper = mapper;
		this.repository = repository;
	}

	@Override
	public List<PetDescriptionDTO> findAllPartialDescription() {
		List<Pet> pets = this.repository.findAll();
		List<PetDescriptionDTO> petsDto = new ArrayList<>();
		pets.forEach(pet -> {
			petsDto.add(this.mapper.convertValue(pet, PetDescriptionDTO.class));
		});
		return petsDto;
	}

	@Override
	public List<PetFullDescriptionDTO> findAll() {
		List<Pet> pets = this.repository.findAll();
		List<PetFullDescriptionDTO> petsDto = new ArrayList<>();
		pets.forEach(pet -> {
			petsDto.add(this.mapper.convertValue(pet, PetFullDescriptionDTO.class));
		});
		return petsDto;
	}

	@Override
	public Pet findById(String id) {
		return this.repository.findById(id).get();
	}

	@Override
	public Pet save(Pet pet) {
		return this.repository.save(pet);
	}

	@Override
	public Pet update(String id, Pet entity) {
		return this.repository.save(entity);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

}
