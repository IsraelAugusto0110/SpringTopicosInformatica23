package com.example.springTopicosEspeciais2301.service;

import com.example.springTopicosEspeciais2301.entity.Anotacao;
import com.example.springTopicosEspeciais2301.entity.Usuario;
import com.example.springTopicosEspeciais2301.exception.UsuarioNaoEncontradoException;
import com.example.springTopicosEspeciais2301.repository.AnotacaoRepository;
import com.example.springTopicosEspeciais2301.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AnotacaoService implements IAnotacaoService {
    @Autowired
    public UsuarioRepository usuarioRepository;
    @Autowired
    public AnotacaoRepository anotacaoRepository;
    @Transactional
    public Anotacao novaAnotacao(Anotacao anotacao){
        Long idUsuario = anotacao.getUsuario().getId();
        Optional <Usuario> usuario = usuarioRepository.findById(idUsuario);
        if(usuario.isEmpty()){
            throw new UsuarioNaoEncontradoException("Usuário não encontrado");
        }
        return anotacaoRepository.save(anotacao);
    }

    public List<Anotacao> buscarTodas(){
        return anotacaoRepository.findAll();
    }
}
