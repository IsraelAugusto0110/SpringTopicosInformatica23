package com.example.springTopicosEspeciais2301.service;

import com.example.springTopicosEspeciais2301.entity.Autorizacao;
import com.example.springTopicosEspeciais2301.entity.Usuario;
import com.example.springTopicosEspeciais2301.exception.UsuarioNaoEncontradoException;
import com.example.springTopicosEspeciais2301.repository.AutorizacaoRepository;
import com.example.springTopicosEspeciais2301.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    public UsuarioRepository usuarioRepository;
    @Autowired
    private AutorizacaoRepository autRepo;


    public Usuario novoUsuario(Usuario usuario) {
        if(usuario == null
                || usuario.getNome() == null
                || usuario.getSenha() == null) {
            throw new IllegalArgumentException("Nome e senha inválidos!");
        }
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }

    @Transactional
    public Usuario novoUsuarioAutorizacao(String nome, String senha, String nomeAutorizacao) {
        Usuario usuario = new Usuario(nome, senha);
        Optional<Autorizacao> autOp = autRepo.findByNome(nomeAutorizacao);
        Autorizacao autorizacao;
        if(autOp.isEmpty()) {
            autorizacao = new Autorizacao();
            autorizacao.setNome(nomeAutorizacao);
            autRepo.save(autorizacao);
        }
        else {
            autorizacao = autOp.get();
        }
        usuario.setAutorizacoes(new ArrayList<Autorizacao>());
        usuario.getAutorizacoes().add(autorizacao);
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarPorId(Long id){
        Optional <Usuario> usuarioOp = usuarioRepository.findById(id);
        if(usuarioOp.isEmpty()){
            throw new UsuarioNaoEncontradoException("Usuário não encontrado");
        }
        return usuarioOp.get();

    }
}
