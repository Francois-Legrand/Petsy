package com.example.petsy.dto;

import com.example.petsy.models.User;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class PetFullDescriptionDTO {
	
	private String nom;
	private String race;
	private int age;
	private String sexe;
	private String description;
	private User User;
}
