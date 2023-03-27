package com.example.springTopicosEspeciais2301.controller;

import com.example.springTopicosEspeciais2301.entity.Anotacao;
import com.example.springTopicosEspeciais2301.service.IAnotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/anotacao")
public class AnotacaoController {
    @Autowired
    public IAnotacaoService iAnotacaoService;
    @GetMapping
    public List<Anotacao> buscarTodas(){
        return iAnotacaoService.buscarTodas();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Anotacao novaAnotacao(@RequestBody Anotacao anotacao){
        return iAnotacaoService.novaAnotacao(anotacao);
    }
}
