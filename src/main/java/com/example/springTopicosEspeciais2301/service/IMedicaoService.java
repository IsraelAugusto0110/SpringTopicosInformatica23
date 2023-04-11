package com.example.springTopicosEspeciais2301.service;

import com.example.springTopicosEspeciais2301.entity.Medicao;

import java.util.List;

public interface IMedicaoService {
    public Medicao novaMedicao(Medicao medicao);
    public List<Medicao> buscarTodas();

}
