package com.example.petsy.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "messages")
public class Message {
    @Id
    private String id;
    private String message;
    @DBRef
    private User userId1;
    @DBRef
    private User userId2;
    public Message(){

    }

    public Message(String id, String message, User userId1, User userId2) {
        this.id = id;
        this.message = message;
        this.userId1 = userId1;
        this.userId2 = userId2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUserId1() {
        return userId1;
    }

    public void setUserId1(User userId1) {
        this.userId1 = userId1;
    }

    public User getUserId2() {
        return userId2;
    }

    public void setUserId2(User userId2) {
        this.userId2 = userId2;
    }
}
