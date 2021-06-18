package com.example.petsy.services.imp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.petsy.dto.PetDescriptionDTO;
import com.example.petsy.dto.PetFullDescriptionDTO;
import com.example.petsy.models.Pet;
import com.example.petsy.services.IPetService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PetServiceImpl implements IPetService {
	/**
	 * @author loose morgan
	 */
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
	public PetFullDescriptionDTO findById(String id) {
		Pet pet = this.repository.findById(id).get();
		return this.mapper.convertValue(pet, PetFullDescriptionDTO.class);
	}

	@Override
	public PetFullDescriptionDTO save(PetFullDescriptionDTO petFullDescriptionDTO) {
		Pet pet = this.mapper.convertValue(petFullDescriptionDTO, Pet.class);
		return this.mapper.convertValue(this.repository.save(pet), PetFullDescriptionDTO.class);
	}

	@Override
	public PetFullDescriptionDTO update(String id, PetFullDescriptionDTO petFullDescriptionDTO) {
		Pet pet = this.mapper.convertValue(petFullDescriptionDTO, Pet.class);
		return this.mapper.convertValue(this.repository.save(pet), PetFullDescriptionDTO.class);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}

}
