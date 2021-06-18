package com.example.petsy.services;

import com.example.petsy.dto.EventDTO;

import java.util.List;

public interface IEventService {
    List<EventDTO> findAll();
    EventDTO findById(String id);
    EventDTO save(EventDTO eventDTO);
    void deleteById(String id);
}
