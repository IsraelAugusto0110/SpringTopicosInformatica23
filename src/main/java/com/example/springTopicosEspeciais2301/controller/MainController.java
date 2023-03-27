package com.example.springTopicosEspeciais2301.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MainController {
    @GetMapping
    public String Hello(){
        return "<h1>Bem vindo!</h1>";
    }
}
