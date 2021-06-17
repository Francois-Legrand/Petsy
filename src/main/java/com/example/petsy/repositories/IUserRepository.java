package com.example.petsy.repositories;

import com.example.petsy.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Map;
import java.util.Optional;

public interface IUserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String name);
}