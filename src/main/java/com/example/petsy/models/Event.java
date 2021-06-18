package com.example.petsy.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "evenements")
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    String id;
    String title;
    String description;

    @DBRef
    private List<User> users;
}
