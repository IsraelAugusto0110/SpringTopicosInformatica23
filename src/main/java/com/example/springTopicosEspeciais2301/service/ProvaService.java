package com.example.springTopicosEspeciais2301.service;

import com.example.springTopicosEspeciais2301.entity.Prova;
import com.example.springTopicosEspeciais2301.repository.ProvaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvaService implements IProvaService {
    @Autowired
    private ProvaRepository provaRepo;

    public List<Prova> todasProvas() {
        return provaRepo.findAll();
    }

    public Prova novaProva(Prova prova) {
        return provaRepo.save(prova);
    }
}
