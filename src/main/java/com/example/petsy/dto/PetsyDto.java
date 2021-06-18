package com.example.petsy.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.petsy.models.PetsyLikesComments;

public class PetsyDto {
	private String contenu;
	private List<PetsyLikesComments> petsyLikesComments = new ArrayList<PetsyLikesComments>();
	
	
	public PetsyDto() {
		super();
	}
	public List<PetsyLikesComments> getPetsyLikesComments() {
		return petsyLikesComments;
	}

	public void setPetsyLikesComments(List<PetsyLikesComments> petsyLikesComments) {
		this.petsyLikesComments = petsyLikesComments;
	}

	

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

}
