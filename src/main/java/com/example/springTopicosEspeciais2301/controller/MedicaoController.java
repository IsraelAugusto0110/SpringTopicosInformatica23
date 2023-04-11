package com.example.springTopicosEspeciais2301.controller;

import com.example.springTopicosEspeciais2301.entity.Medicao;
import com.example.springTopicosEspeciais2301.service.IMedicaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/medicao")
public class MedicaoController {
    @Autowired
    private IMedicaoService iMedicaoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Medicao novamedicao(@RequestBody Medicao medicao){
        return iMedicaoService.novaMedicao(medicao);
    }

    @GetMapping
    public List<Medicao> buscarTodas(){
        return iMedicaoService.buscarTodas();
    }
}
