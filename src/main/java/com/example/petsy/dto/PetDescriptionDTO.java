package com.example.petsy.dto;

import com.example.petsy.models.User;

/**
 * @author loose morgan
 */
public class PetDescriptionDTO {
	private String nom;
	private String race;
	private User user;

	public PetDescriptionDTO() {
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
