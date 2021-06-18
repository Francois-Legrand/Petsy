package com.example.petsy.repositories;

import com.example.petsy.models.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IUserMessageRepository extends MongoRepository<Message, String> {
}
