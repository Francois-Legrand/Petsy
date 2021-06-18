package com.example.petsy.services;

import java.util.List;

import com.example.petsy.dto.PetsyDto;
import com.example.petsy.models.Petsy;

public interface IPetsyService {
	public PetsyDto create(Petsy petsy);
	
	
	public PetsyDto findById(String id);
	
	
	public List<PetsyDto> findAll();
	
	
	public PetsyDto update(String id, Petsy petsy); 
	
	
	public void delete(String id);
}
