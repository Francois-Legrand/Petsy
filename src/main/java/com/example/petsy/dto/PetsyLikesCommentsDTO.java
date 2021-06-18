package com.example.petsy.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.petsy.models.Personne;
import com.example.petsy.models.Petsy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class PetsyLikesCommentsDTO {
	
	private boolean like;
	private String comment;
	
	private Personne personne;
	private Petsy petsy;
}
