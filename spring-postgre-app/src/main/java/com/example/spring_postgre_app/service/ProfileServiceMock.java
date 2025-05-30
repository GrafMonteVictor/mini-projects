package com.example.spring_postgre_app.service;

import com.example.spring_postgre_app.exception.ProfileNotFoundException;
import com.example.spring_postgre_app.model.Profile;
import org.springframework.stereotype.Service;

@Service
/*
spring создаст один экземпляр,
сервис не содержит внутренних состояний
*/
public class ProfileServiceMock implements ProfileService {
    @Override
    public Profile getProfile(int personId) {
        if (personId == 123) {
            Profile profile = new Profile(personId, "Данила", "Крэйзи");
            return profile;
        } else {
            throw new ProfileNotFoundException(personId);
        }
    }
}
