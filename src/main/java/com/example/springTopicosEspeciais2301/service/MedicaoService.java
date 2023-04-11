package com.example.springTopicosEspeciais2301.service;

import com.example.springTopicosEspeciais2301.entity.Medicao;
import com.example.springTopicosEspeciais2301.exception.UsuarioNaoEncontradoException;
import com.example.springTopicosEspeciais2301.repository.MedicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicaoService implements IMedicaoService{

    @Autowired
    public MedicaoRepository medicaoRepository;


    public Medicao novaMedicao(Medicao medicao){
        if(medicao == null ||
           medicao.getDataHora() == null){
            throw new IllegalArgumentException("Por favor preencha os campos necessarios");
        }
        return  medicaoRepository.save(medicao);
    }

    public List<Medicao> buscarTodas(){
        return medicaoRepository.findAll();
    }

    @Override
    public Medicao buscarPorId(Long id) {
        Optional<Medicao> medicaoOp = medicaoRepository.findById(id);
        if(medicaoOp.isEmpty()){
            throw new UsuarioNaoEncontradoException("Não foram encontrados registros");
        }
        return medicaoOp.get();
    }


}
