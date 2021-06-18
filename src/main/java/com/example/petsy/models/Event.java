package com.example.petsy.models;


import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "evenements")
public class Event {

    String id;
    String title;
    String description;

    @DBRef
    private List<User> users;

	public Event(String id, String title, String description, List<User> users) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.users = users;
	}

	public Event() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
