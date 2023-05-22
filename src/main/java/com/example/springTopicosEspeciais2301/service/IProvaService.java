package com.example.springTopicosEspeciais2301.service;

import com.example.springTopicosEspeciais2301.entity.Prova;

import java.util.List;

public interface IProvaService {
    public List<Prova> todasProvas();

    public Prova novaProva(Prova prova);
}
