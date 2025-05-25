package com.example.spring_postgre_app.model;

import lombok.Getter;

@Getter
public class Profile {
    private int id;
    private String firstName;
    private String lastName;

    public Profile(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
