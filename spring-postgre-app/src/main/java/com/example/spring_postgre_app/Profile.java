package com.example.spring_postgre_app;

import lombok.Getter;

@Getter
public class Profile {
    int id;
    String firstName;
    String lastName;

    public Profile(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
