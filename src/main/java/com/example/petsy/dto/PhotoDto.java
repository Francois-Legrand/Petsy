package com.example.petsy.dto;

import com.example.petsy.models.Personne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class PhotoDto {
    private String id;
    private String chemin;
    private Personne personne;
}
