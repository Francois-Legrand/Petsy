package com.example.petsy.repositories;

import com.example.petsy.models.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface IEventRepository extends MongoRepository<Event, String> {
    Optional<Event> findByTitle(String title);
}
