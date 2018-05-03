package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UiControllerImpl {


    @RequestMapping(value = {"/", "/top"})
    public String top(){
        return null;
    }

    @RequestMapping(value="/{userId}/{passWord}", method = RequestMethod.POST)
    public String login(@PathVariable String userId, @PathVariable String passWord){


        return null;
    }
}
