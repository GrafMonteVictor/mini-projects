package com.example.spring_postgre_app.exception;

public class ProfileNotFoundException extends RuntimeException {
    private final int personId;

    public ProfileNotFoundException(int personId) {
        this.personId = personId;
    }

    @Override
    public String getMessage() {
        return "Profile with id = " + personId + " not found";
    }

}
