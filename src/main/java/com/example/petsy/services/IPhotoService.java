package com.example.petsy.services;

import com.example.petsy.dto.PhotoDto;
import com.example.petsy.models.Photo;
import com.example.petsy.repositories.IPhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IPhotoService {
    List<PhotoDto> findAll();
    PhotoDto findById(String id);
    PhotoDto save(PhotoDto photoDto);
    void deleteById(String id);
    PhotoDto saveImage(MultipartFile imageFile) throws Exception;
}
