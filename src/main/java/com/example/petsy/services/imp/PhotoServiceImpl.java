package com.example.petsy.services.imp;

import com.example.petsy.dto.PhotoDto;
import com.example.petsy.models.Photo;
import com.example.petsy.repositories.IPhotoRepository;
import com.example.petsy.services.IPhotoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PhotoServiceImpl implements IPhotoService {
    private final IPhotoRepository repository;
    private ObjectMapper mapper;

    public PhotoServiceImpl(IPhotoRepository repository,ObjectMapper mapper ) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<PhotoDto> findAll() {
        List<Photo> photos = this.repository.findAll();
        List<PhotoDto> photoDto = new ArrayList<>();
        photos.forEach(photo -> {
            photoDto.add(
                    this.mapper.convertValue(photo, PhotoDto.class)
            );
        });
        return photoDto;
    }

    @Override
    public PhotoDto findById(String id) {
        return mapper.convertValue(this.repository.findById(id).get(), PhotoDto.class);
    }

    @Override
    public PhotoDto save(PhotoDto photoDto) {
        Photo photo = mapper.convertValue(photoDto, Photo.class);
        return mapper.convertValue(this.repository.save(photo), PhotoDto.class);
    }
    @Override
    public void deleteById(String id) {
        this.repository.deleteById(id);
    }

    @Override
    public PhotoDto saveImage(MultipartFile imageFile) throws Exception {
        Photo photo = new Photo();
        String folder = "./src/main/resources/images/";
        byte[] bytes = imageFile.getBytes();
        Path path = Paths.get(folder + imageFile.getOriginalFilename());
        photo.setUrl(path.toString());
        Files.write(path, bytes);
        return mapper.convertValue(this.repository.save(photo), PhotoDto.class);
    }
}
