package com.example.petsy.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.petsy.models.Personne;
import com.example.petsy.models.Petsy;

public interface PetsyRepository extends MongoRepository<Petsy, String> {
	    List<Petsy> findByContenu(String contenu);
	    List<Petsy> findByPersonne(Personne personne);
	}

