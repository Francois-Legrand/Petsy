package com.example.petsy.repositories;

import com.example.petsy.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserRepository extends MongoRepository<User, String> {
}
