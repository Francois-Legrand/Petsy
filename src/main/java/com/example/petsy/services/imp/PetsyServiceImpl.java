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
	public PetsyDto create(PetsyDto petsyDto) {
		Petsy petsy = mapper.convertValue(petsyDto, Petsy.class);
        return mapper.convertValue(this.repository.save(petsy), PetsyDto.class);
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

	public PetsyDto update(PetsyDto petsyDto) {
		Petsy petsy = mapper.convertValue(petsyDto, Petsy.class);
        return mapper.convertValue(this.repository.save(petsy), PetsyDto.class);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
		
	}

	@Override
	public PetsyDto update(String id, Petsy petsy) {
		// TODO Auto-generated method stub
		return null;
	}

}
