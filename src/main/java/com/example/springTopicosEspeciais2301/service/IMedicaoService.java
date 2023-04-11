package com.example.springTopicosEspeciais2301.service;

import com.example.springTopicosEspeciais2301.entity.Medicao;

import java.util.List;

public interface IMedicaoService {
    // post cria nova medicao
    public Medicao novaMedicao(Medicao medicao);
    // get busca todas as medições
    public List<Medicao> buscarTodas();
    // get busca por id
    public Medicao buscarPorId(Long id);

}
