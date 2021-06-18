package com.example.petsy.models;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Document(collection = "users")
public class User extends Personne {

	String username;
	String password;

	/*
	 * Reference a personne
	 */
	@DBRef(lazy = true) // Permet d'eviter la recursivite
	private List<Personne> personnes;

	@DBRef
	private List<Event> events;

	public User(String id, String username, String password, List<Personne> personnes, List<Event> events) {
		super(id);
		this.username = username;
		this.password = password;
		this.personnes = personnes;
		this.events = events;
	}

	public User() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

}