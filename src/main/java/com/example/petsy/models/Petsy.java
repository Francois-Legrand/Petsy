package com.example.petsy.models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Petsy {
	@Id
	private String id;
	private String contenu;
	@DBRef
	private Personne personne;
	// constructor / getter /setter
	private List<PetsyLikesComments> petsyLikesComments = new ArrayList<PetsyLikesComments>(); 
	
	public Petsy() {
		super();
	}
	
	public Petsy(String id, String contenu, Personne personne) {
		super();
		this.id = id;
		this.contenu = contenu;
		this.personne = personne;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	

}
