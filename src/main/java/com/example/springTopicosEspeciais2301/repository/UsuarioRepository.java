package com.example.springTopicosEspeciais2301.repository;


import com.example.springTopicosEspeciais2301.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Usuario findByNome(String nome);
}
