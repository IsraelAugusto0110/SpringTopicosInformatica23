package com.example.springTopicosEspeciais2301.service;

import com.example.springTopicosEspeciais2301.entity.Usuario;
import com.example.springTopicosEspeciais2301.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    public UsuarioRepository usuarioRepository;

    public void createUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }
}
