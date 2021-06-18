package com.example.petsy.services;

import java.util.List;

import com.example.petsy.dto.PetsyLikesCommentsDTO;

public interface IPetsyLikesCommentsService {
	List<PetsyLikesCommentsDTO> findAll();
	PetsyLikesCommentsDTO findById(String id);
	PetsyLikesCommentsDTO save(PetsyLikesCommentsDTO prestyLikesCommentsDto);
	void deleteById(String id);
}
