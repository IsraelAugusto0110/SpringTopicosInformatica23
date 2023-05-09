package com.example.springTopicosEspeciais2301.service;

import com.example.springTopicosEspeciais2301.dto.AnotacaoUsuarioDTO;
import com.example.springTopicosEspeciais2301.entity.Anotacao;

import java.util.List;

public interface IAnotacaoService {
    public Anotacao novaAnotacao(Anotacao anotacao);
    public List<Anotacao> buscarTodas();
    public List<AnotacaoUsuarioDTO> quantidadeAnotacoesPorUsuario();

}
