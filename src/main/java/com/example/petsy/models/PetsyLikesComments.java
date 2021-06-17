package com.example.petsy.models;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class PetsyLikesComments {
	
	private boolean like;
	private String comment;
	
	@DBRef
	private Personne personne;
	@DBRef
	private Petsy petsy;
}
