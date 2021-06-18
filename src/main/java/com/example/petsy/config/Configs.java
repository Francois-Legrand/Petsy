package com.example.petsy.config;

import com.example.petsy.models.Pet;
import com.example.petsy.repositories.*;
import com.example.petsy.services.IEventService;
import com.example.petsy.services.imp.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configs {
	@Bean
	public PhotoServiceImpl photoService(IPhotoRepository photoRepository, ObjectMapper mapper) {
		return new PhotoServiceImpl(photoRepository, mapper);
	}

	@Bean
	UserServiceImpl userService(IUserRepository userRepository, ObjectMapper mapper) {
		return new UserServiceImpl(userRepository, mapper);
	}

	@Bean
	PetServiceImpl petService(IPetRepository PetRepository, ObjectMapper mapper) {
		return new PetServiceImpl(PetRepository, mapper);
	}

	@Bean
	PetsyServiceImpl petsyService(PetsyRepository petsyRepository, ObjectMapper mapper){
		return new PetsyServiceImpl(petsyRepository, mapper);
	}
	@Bean
	PetsyLikesCommentsServiceImpl petsyLikesCommentsService(IPetsyLikesCommentsRepository petsyLikesCommentsRepository, ObjectMapper mapper){
		return new PetsyLikesCommentsServiceImpl(petsyLikesCommentsRepository, mapper);
	}
	@Bean
	EventServiceImpl eventService(IEventRepository eventRepository, ObjectMapper mapper){
		return new EventServiceImpl(eventRepository, mapper);
	}
}
