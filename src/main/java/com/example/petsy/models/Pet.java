package com.example.petsy.models;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
/**
 * @author loose morgan
 */
@Data
@Document(collection = "personnes")
public class Pet extends Personne {

	private String nom;
	private String race;
	private int age;
	private String sexe;
	private String description;
	@DBRef
	private User User;
}
