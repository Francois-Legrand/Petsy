package com.example.petsy.dto;

import com.example.petsy.models.User;

import lombok.AllArgsConstructor;
import lombok.Data;
/**
 * @author loose morgan
 */
@Data
@AllArgsConstructor
public class PetDescriptionDTO {
	private String nom;
	private String race;
	private User user;
}
