package com.example.petsy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User extends Personne{

    String username;
    String password;

    /*
    ManyToMany avec la classe personne. Doit-on vraiment la faire?
     */
    @DBRef
    private List<Personne> personnes_ids;
}
