package com.example.petsy.services.imp;

import java.util.ArrayList;
import java.util.List;

import com.example.petsy.dto.PetsyDto;
import com.example.petsy.models.Petsy;
import com.example.petsy.repositories.PetsyRepository;
import com.example.petsy.services.IPetsyService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PetsyServiceImpl implements IPetsyService {

	PetsyRepository repository;
	ObjectMapper mapper;
	
	public PetsyServiceImpl(PetsyRepository repository, ObjectMapper mapper) {
		super();
		this.repository = repository;
		this.mapper = mapper;
	}

	@Override
	public Petsy create(Petsy petsy) {
		return this.repository.save(petsy);
	}
	
	@Override
	public List<PetsyDto> findAll(){
		List<Petsy> petsies = this.repository.findAll();
		List<PetsyDto> petsyDto = new ArrayList<PetsyDto>();
		petsies.forEach(petsy -> {
				petsyDto.add(
					this.mapper.convertValue(petsy, PetsyDto.class)
				);
		});
		return petsyDto;
	}

	@Override
	public PetsyDto findById(String id) {
		Petsy petsy = this.repository.findById(id).get();
		return mapper.convertValue(petsy, PetsyDto.class);
	}

	@Override
	public Petsy update(String id, Petsy petsy) {
		return this.repository.save(petsy);	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
		
	}

}
