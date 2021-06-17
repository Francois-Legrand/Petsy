package com.example.petsy.config;

import com.example.petsy.repositories.IPhotoRepository;
import com.example.petsy.repositories.IUserRepository;
import com.example.petsy.repositories.PetRepository;
import com.example.petsy.services.imp.PetServiceImpl;
import com.example.petsy.services.imp.PhotoServiceImpl;
import com.example.petsy.services.imp.UserServiceImpl;
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
	PetServiceImpl petService(PetRepository PetRepository, ObjectMapper mapper) {
		return new PetServiceImpl(PetRepository, mapper);
	}
}
