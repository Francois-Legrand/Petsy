package com.example.petsy.controllers;

import com.example.petsy.dto.PhotoDto;
import com.example.petsy.services.imp.PhotoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("photos")
@CrossOrigin
public class PhotoController {
    @Autowired
    private PhotoServiceImpl service;

    @GetMapping
    public List<PhotoDto> findAll(){
        return this.service.findAll();
    }
    @GetMapping("{id}")
    public PhotoDto findById(@PathVariable String id){
        return this.service.findById(id);
    }
    @PutMapping
    public PhotoDto edit(@RequestBody PhotoDto photoDto){
        return this.service.save(photoDto);
    }
    @PostMapping
    public PhotoDto save(@RequestBody PhotoDto photoDto){
        return this.service.save(photoDto);
    }
    @DeleteMapping("{id}")
    public void DeleteById(@PathVariable String id){
        this.service.deleteById(id);
    }

}
