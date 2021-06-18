package com.example.petsy.models;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
public class PetsyLikesComments {

	private boolean like;
	private String comment;

	@DBRef
	private Personne personne;
	@DBRef
	private Petsy petsy;

	public PetsyLikesComments(boolean like, String comment, Personne personne, Petsy petsy) {
		this.like = like;
		this.comment = comment;
		this.personne = personne;
		this.petsy = petsy;
	}

	public PetsyLikesComments() {
	}

	public boolean isLike() {
		return like;
	}

	public void setLike(boolean like) {
		this.like = like;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public Petsy getPetsy() {
		return petsy;
	}

	public void setPetsy(Petsy petsy) {
		this.petsy = petsy;
	}

}
