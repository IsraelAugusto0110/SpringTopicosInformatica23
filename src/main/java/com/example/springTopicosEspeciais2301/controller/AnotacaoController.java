package com.example.springTopicosEspeciais2301.controller;

import com.example.springTopicosEspeciais2301.dto.AnotacaoUsuarioDTO;
import com.example.springTopicosEspeciais2301.entity.Anotacao;
import com.example.springTopicosEspeciais2301.service.IAnotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin
@RequestMapping(value = "/anotacao")
public class AnotacaoController {

    @Autowired
    private IAnotacaoService service;

    @GetMapping
    public List<Anotacao> buscarTodas() {
        return service.buscarTodas();
    }

    @GetMapping(value = "/quantidadePorUsuario")
    public List<AnotacaoUsuarioDTO> quantidadePorUsuario() {
        return service.quantidadeAnotacoesPorUsuario();
    }

    @PostMapping
    public Anotacao novaAnotacao(@RequestBody Anotacao anotacao) {
        return service.novaAnotacao(anotacao);
    }

}
