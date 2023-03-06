package com.example.springTopicosEspeciais2301.service;

import com.example.springTopicosEspeciais2301.entity.Usuario;
import com.example.springTopicosEspeciais2301.exception.UsuarioNaoEncontradoException;
import com.example.springTopicosEspeciais2301.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {
    @Autowired
    public UsuarioRepository usuarioRepository;

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

    public Usuario buscarPorId(Long id){
        Optional <Usuario> usuarioOp = usuarioRepository.findById(id);
        if(usuarioOp.isEmpty()){
            throw new UsuarioNaoEncontradoException("Usuário não encontrado");
        }
        return usuarioOp.get();

    }
}
