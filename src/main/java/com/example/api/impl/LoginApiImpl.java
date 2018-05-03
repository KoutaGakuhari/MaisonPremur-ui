package com.example.api.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.example.Entity.UserEntity;
import com.example.other.MaisonCommonException;

public class LoginApiImpl {
    @Autowired
    RestTemplate restTemplate;


    public UserEntity getUserEntity() throws MaisonCommonException {
        UserEntity userEntity = new UserEntity();


        return userEntity;
    }
}
