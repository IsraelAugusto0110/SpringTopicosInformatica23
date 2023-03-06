package com.example.springTopicosEspeciais2301.service;

import com.example.springTopicosEspeciais2301.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    public Usuario buscarPorId(Long id);
    public Usuario novoUsuario(Usuario usuario);
    public List<Usuario> buscarTodos();
}
