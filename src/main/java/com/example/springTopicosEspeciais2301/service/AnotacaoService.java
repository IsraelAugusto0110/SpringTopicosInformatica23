package com.example.springTopicosEspeciais2301.service;

import com.example.springTopicosEspeciais2301.entity.Anotacao;
import com.example.springTopicosEspeciais2301.entity.Usuario;
import com.example.springTopicosEspeciais2301.exception.UsuarioNaoEncontradoException;
import com.example.springTopicosEspeciais2301.repository.AnotacaoRepository;
import com.example.springTopicosEspeciais2301.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Service
public class AnotacaoService {

    @Autowired
    private AnotacaoRepository anotacaoRepository;

    public List<Anotacao> listarRegistros(){
        return anotacaoRepository.findAll();
    }

    public Anotacao cadastrarTrabalho(Anotacao trabalho){
        return anotacaoRepository.save(trabalho);
    }

    public Anotacao buscarPorId(Long id) {
        Optional<Anotacao> anotacaoOp = anotacaoRepository.findById(id);
        if(anotacaoOp.isPresent()) {
            return anotacaoOp.get();
        }
        throw new UsuarioNaoEncontradoException("Id inválido!");
    }

}
