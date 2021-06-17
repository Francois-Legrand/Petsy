package com.example.petsy.repositories;

import com.example.petsy.models.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPhotoRepository extends MongoRepository<Photo, String> {
}
