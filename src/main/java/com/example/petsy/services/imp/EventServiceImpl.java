package com.example.petsy.services.imp;

import com.example.petsy.dto.EventDTO;
import com.example.petsy.models.Event;
import com.example.petsy.repositories.IEventRepository;
import com.example.petsy.services.IEventService;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class EventServiceImpl implements IEventService {

    private final IEventRepository repository;
    private final ObjectMapper mapper;

    public EventServiceImpl(IEventRepository repository, ObjectMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<EventDTO> findAll() {
        List<Event> events = this.repository.findAll();
        List<EventDTO> getEventsDTOs = new ArrayList<>();
        events.forEach(event -> getEventsDTOs.add(this.mapper.convertValue(event, EventDTO.class)));
        return getEventsDTOs;
    }

    @Override
    public EventDTO findById(String id) {
        return mapper.convertValue(this.repository.findById(id).get(), EventDTO.class); //Warning:(32, 65) 'Optional.get()' without 'isPresent()' check
    }

    @Override
    public EventDTO save(EventDTO eventDTO) {
        Event event = mapper.convertValue(eventDTO, Event.class);
        return mapper.convertValue(this.repository.save(event), EventDTO.class);
    }

    @Override
    public void deleteById(String id) {
        this.repository.deleteById(id);
    }
}
