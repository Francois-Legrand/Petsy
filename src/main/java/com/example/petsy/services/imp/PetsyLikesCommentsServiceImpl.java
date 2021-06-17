package com.example.petsy.services.imp;

import java.util.ArrayList;
import java.util.List;

import com.example.petsy.dto.PetsyLikesCommentsDTO;
import com.example.petsy.models.PetsyLikesComments;
import com.example.petsy.repositories.IPetsyLikesCommentsRepository;
import com.example.petsy.services.IPetsyLikesCommentsService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PetsyLikesCommentsServiceImpl implements IPetsyLikesCommentsService {
	
	private final IPetsyLikesCommentsRepository repository;
	private ObjectMapper mapper;
	
	public PetsyLikesCommentsServiceImpl(IPetsyLikesCommentsRepository repository, ObjectMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	@Override
	public List<PetsyLikesCommentsDTO> findAll() {
		List<PetsyLikesComments> plc = this.repository.findAll();
		List<PetsyLikesCommentsDTO> plcDTO = new ArrayList<>();
		plc.forEach(petsylc -> {
			plcDTO.add(this.mapper.convertValue(petsylc, PetsyLikesCommentsDTO.class));
		});
		
		return plcDTO;
	}
	
	@Override
	public PetsyLikesCommentsDTO findById(String id) {
		return mapper.convertValue(this.repository.findById(id).get(), PetsyLikesCommentsDTO.class);
	}
	
	@Override
	public PetsyLikesCommentsDTO save(PetsyLikesCommentsDTO petsyLikesCommentsDTO) {
		return mapper.convertValue(
					this.repository.save(mapper.convertValue(petsyLikesCommentsDTO, PetsyLikesComments.class)), PetsyLikesCommentsDTO.class
				);
	}
	
	@Override
	public void deleteById(String id) {
		this.repository.deleteById(id);
	}
}
