package com.example.petsy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petsy.dto.PetsyLikesCommentsDTO;
import com.example.petsy.services.imp.PetsyLikesCommentsServiceImpl;

@RestController
@RequestMapping("petsylikescomments")
@CrossOrigin
public class PetsyLikesCommentsController {
	@Autowired
	private PetsyLikesCommentsServiceImpl service;
	
	@GetMapping("")
	public List<PetsyLikesCommentsDTO> findAll(){
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public PetsyLikesCommentsDTO findById(@PathVariable String id) {
		return this.service.findById(id);
	}
	
	@PutMapping("")
	public PetsyLikesCommentsDTO edit(@RequestBody PetsyLikesCommentsDTO petsyLikesCommentsDTO) {
		return this.service.save(petsyLikesCommentsDTO);
	}
	
	@PostMapping("")
	public PetsyLikesCommentsDTO save(@RequestBody PetsyLikesCommentsDTO petsyLikesCommentsDTO) {
		return this.service.save(petsyLikesCommentsDTO);
	}
	
	@DeleteMapping("{id}")
	public void deleteById(@PathVariable String id) {
		this.service.deleteById(id);
	}
}
