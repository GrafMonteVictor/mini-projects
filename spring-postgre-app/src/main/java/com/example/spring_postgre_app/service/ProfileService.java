package com.example.spring_postgre_app.service;

import com.example.spring_postgre_app.model.Profile;

public interface ProfileService {
    Profile getProfile(int personId);
}
