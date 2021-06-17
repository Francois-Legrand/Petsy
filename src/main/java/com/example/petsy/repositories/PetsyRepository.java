package com.example.petsy.repositories;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.petsy.models.Petsy;

public interface PetsyRepository extends MongoRepository<Petsy, String> {
	   
}
