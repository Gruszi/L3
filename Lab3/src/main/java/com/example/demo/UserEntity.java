package com.example.demo;

public class UserEntity {
    private int id;
    private String name;
    private String email;

    public UserEntity() {
    }

    public UserEntity(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;

    }
    public int getId(){
        return this.id;
    }
}