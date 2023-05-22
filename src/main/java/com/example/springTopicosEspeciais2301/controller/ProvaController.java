package com.example.springTopicosEspeciais2301.controller;

import com.example.springTopicosEspeciais2301.entity.Prova;
import com.example.springTopicosEspeciais2301.service.ProvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/prova")
public class ProvaController {
    @Autowired
    private ProvaService service;

    @GetMapping
    public List<Prova> todas() {
        return service.todasProvas();
    }

    @PostMapping
    public Prova nova(@RequestBody Prova prova) {
        return service.novaProva(prova);
    }
}
