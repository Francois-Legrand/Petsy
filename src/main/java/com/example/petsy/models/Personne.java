package com.example.petsy.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "personnes")
public abstract class Personne {
	@Id
	private String id;

	public Personne(String id) {
		this.id = id;
	}

	public Personne() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
