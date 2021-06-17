package com.example.petsy.services.imp;

import com.example.petsy.models.Petsy;
import com.example.petsy.repositories.PetsyRepository;
import com.example.petsy.services.IPetsyService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PetsyServiceImpl implements IPetsyService {

	PetsyRepository repository;
	ObjectMapper mapper;
	
	
	
	@Override
	public Petsy create(Petsy petsy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Petsy findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Petsy update(String id, Petsy petsy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
