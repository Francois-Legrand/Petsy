package com.example.petsy.controllers;

import com.example.petsy.dto.EventDTO;
import com.example.petsy.services.imp.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("evenements")
public class EventController {
    @Autowired
    EventServiceImpl service;

    @GetMapping
    public List<EventDTO> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public EventDTO getTitle(@PathVariable String id){
        return service.findById(id);
    }

    @GetMapping("/title/{title}")
    public EventDTO getDescription(@PathVariable String title)
    {
        return service.findByTitle(title);
    }

    @PostMapping
    public EventDTO save(@RequestBody EventDTO eventDTO){
        return service.save(eventDTO);
    }

    @PutMapping
    public EventDTO edit(@RequestBody EventDTO eventDTO){
        return service.save(eventDTO);
    }
}
