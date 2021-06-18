package com.example.petsy.services;

import java.util.List;

import com.example.petsy.dto.PetDescriptionDTO;
import com.example.petsy.dto.PetFullDescriptionDTO;

public interface IPetService {
	/**
	 * @author loose morgan
	 */
	public List<PetDescriptionDTO> findAllPartialDescription();
	
	public List<PetFullDescriptionDTO> findAll();

	public PetFullDescriptionDTO findById(String id);

	public PetFullDescriptionDTO save(PetFullDescriptionDTO pet);

	public PetFullDescriptionDTO update(String id, PetFullDescriptionDTO pet);

	public void delete(String id);

}
