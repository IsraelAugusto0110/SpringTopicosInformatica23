package com.example.springTopicosEspeciais2301.controller;

import com.example.springTopicosEspeciais2301.entity.Anotacao;
import com.example.springTopicosEspeciais2301.service.AnotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin
@RequestMapping(value = "/anotacao")
public class AnotacaoController {

    @Autowired
    private AnotacaoService AnotacaoService;

    @PostMapping
    public Anotacao novaAnotacao(@RequestBody Anotacao anotacao) {
        return AnotacaoService.novaAnotacao(anotacao);
    }

    @GetMapping("/buscar")
    public List<Anotacao> buscarTodos() {
        return AnotacaoService.listarRegistros();
    }


}
