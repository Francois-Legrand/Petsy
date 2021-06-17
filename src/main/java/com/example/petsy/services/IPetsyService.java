package com.example.petsy.services;

import com.example.petsy.models.Petsy;

public interface IPetsyService {
	public Petsy create(Petsy petsy);
	
	
	public Petsy findById(String id);
	
	
	public Petsy update(String id, Petsy petsy); 
	
	
	public void delete(String id);
}
