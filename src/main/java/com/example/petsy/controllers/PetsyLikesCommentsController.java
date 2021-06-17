package com.example.petsy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
}
