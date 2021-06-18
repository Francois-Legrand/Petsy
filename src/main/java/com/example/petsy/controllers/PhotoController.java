package com.example.petsy.controllers;

import com.example.petsy.dto.PhotoDto;
import com.example.petsy.services.imp.PhotoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    @PutMapping("{id}")
    public PhotoDto edit(@RequestBody PhotoDto photoDto){
        if(photoDto == null){
        }
        return this.service.save(photoDto);
    }

    /*@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PhotoDto save(@RequestBody PhotoDto photoDto){
        return this.service.save(photoDto);
    }

     */
    @DeleteMapping("{id}")
    public void DeleteById(@PathVariable String id){
        this.service.deleteById(id);
    }
    @PostMapping("/uploadImage")
    public String uploadImage(@RequestBody @PathVariable MultipartFile imageFile, PhotoDto photoDto) {
        String returnValue = "start";
        try {
            this.service.saveImage(imageFile);
            this.service.save(photoDto);
        } catch (Exception e) {
            e.printStackTrace();
            returnValue = "Error";
        }

        return returnValue;
    }
}
