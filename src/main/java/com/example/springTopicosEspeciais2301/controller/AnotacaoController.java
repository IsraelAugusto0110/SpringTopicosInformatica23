package com.example.springTopicosEspeciais2301.controller;

import java.util.List;

import com.example.springTopicosEspeciais2301.entity.Anotacao;
import com.example.springTopicosEspeciais2301.service.AnotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/anotacao")
public class AnotacaoController {

    @Autowired
    private AnotacaoService AnotacaoService;

    @PostMapping
    public Anotacao cadastrarFuncionario(@RequestBody Anotacao funcionario){
        return AnotacaoService.cadastrarTrabalho(funcionario);
    }

    @GetMapping("/buscar")
    public List<Anotacao> buscarTodos() {
        return AnotacaoService.listarRegistros();
    }

    @GetMapping(value = "/id/{trabalho}")
    public Anotacao buscarPorId(@PathVariable("anotacao") Long id) {
        return AnotacaoService.buscarPorId(id);
    }

}
