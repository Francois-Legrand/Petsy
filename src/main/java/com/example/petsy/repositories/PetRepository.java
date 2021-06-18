package com.example.petsy.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.petsy.models.Pet;

public interface PetRepository extends MongoRepository<Pet, String> {

}