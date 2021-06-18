package com.example.petsy.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.petsy.models.PetsyLikesComments;

public interface IPetsyLikesCommentsRepository extends MongoRepository<PetsyLikesComments, String>{

}
