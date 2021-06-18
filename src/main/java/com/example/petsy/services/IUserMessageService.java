package com.example.petsy.services;

import com.example.petsy.dto.UserMessageDto;

import java.util.List;

public interface IUserMessageService {
    public List<UserMessageDto> findAll();
    public UserMessageDto findById(String id);
    public UserMessageDto save(UserMessageDto userMessageDto);
    public void deleteById(String id);

}
