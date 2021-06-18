package com.example.petsy.services.imp;

import com.example.petsy.dto.UserMessageDto;
import com.example.petsy.dto.UsersDTO;
import com.example.petsy.models.Message;
import com.example.petsy.models.User;
import com.example.petsy.repositories.IUserMessageRepository;
import com.example.petsy.repositories.IUserRepository;
import com.example.petsy.services.IUserMessageService;
import com.example.petsy.services.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class UserMessageServiceImpl implements IUserMessageService {
    private final IUserMessageRepository repository;
    private ObjectMapper mapper;

    public UserMessageServiceImpl(IUserMessageRepository repository, ObjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public List<UserMessageDto> findAll() {
        List<Message> userMessages = this.repository.findAll();
        List<UserMessageDto> userMessageDto = new ArrayList<>();
        userMessages.forEach(userMessage -> {
            userMessageDto.add(
                    this.mapper.convertValue(userMessage, UserMessageDto.class)
            );
        });
        return userMessageDto;
    }

    @Override
    public UserMessageDto findById(String id) {

        return mapper.convertValue(this.repository.findById(id).get(), UserMessageDto.class);
    }

    @Override
    public UserMessageDto save(UserMessageDto userMessageDto) {

        Message userMessage = mapper.convertValue(userMessageDto, Message.class);

        return mapper.convertValue(this.repository.save(userMessage), UserMessageDto.class);
    }

    @Override
    public void deleteById(String id) {
        this.repository.deleteById(id);
    }
}
