package com.example.spring_postgre_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*
обрабатывает http-запросы
*/

@RequestMapping(value = "/profiles")
public class ProfileController {
    @Autowired
    ProfileService profileService;

    @GetMapping(value = "/{id:\\d+}")
    public Profile getProfile(@PathVariable int id) {
        return profileService.getProfile(id);
    }
}
