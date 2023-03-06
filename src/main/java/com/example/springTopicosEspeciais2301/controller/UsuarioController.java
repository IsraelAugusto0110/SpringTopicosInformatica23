package com.example.springTopicosEspeciais2301.controller;

import com.example.springTopicosEspeciais2301.entity.Usuario;
import com.example.springTopicosEspeciais2301.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario novoUsuario(@RequestBody Usuario usuario){
        return usuarioService.novoUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> buscarTodos(){
        return usuarioService.buscarTodos();
    }

    @GetMapping(value = "/id/{usuario}")
    public Usuario buscarPorId(@PathVariable("usuario") Long id){
        return usuarioService.buscarPorId(id);
    }
}
