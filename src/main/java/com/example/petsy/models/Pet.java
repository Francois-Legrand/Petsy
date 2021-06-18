package com.example.petsy.models;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author loose morgan
 */
@Document(collection = "personnes")
public class Pet extends Personne {

	private String nom;
	private String race;
	private int age;
	private String sexe;
	private String description;
	@DBRef
	private User User;

	public Pet(String id, String nom, String race, int age, String sexe, String description, User user) {
		super(id);
		this.nom = nom;
		this.race = race;
		this.age = age;
		this.sexe = sexe;
		this.description = description;
		User = user;
	}

	public Pet() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}

}
