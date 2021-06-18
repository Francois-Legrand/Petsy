package com.example.petsy.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.petsy.models.Pet;

public interface IPetRepository extends MongoRepository<Pet, String> {
	/**
	 * @author loose morgan
	 */
}
