package com.example.petsy.repositories;

import com.example.petsy.models.Personne;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.petsy.models.Petsy;

import java.util.List;

public interface PetsyRepository extends MongoRepository<Petsy, String> {
	List<Petsy> findByContenu(String contenu);
	List<Petsy> findByPersonne(Personne personne);
}

