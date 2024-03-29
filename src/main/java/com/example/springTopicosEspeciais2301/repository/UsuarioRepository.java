package com.example.springTopicosEspeciais2301.repository;


import com.example.springTopicosEspeciais2301.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public List<Usuario> findByAutorizacoesNome(String nomeAutorizacao);

    public Usuario findByNome(String nome);

    @Query("select u from Usuario u where u.nome = ?1")
    public Usuario buscarPeloNome(String nome);

    public List<Usuario> findByNomeContains(String nome);

    @Query("select u from Usuario u where u.nome like %?1%")
    public List<Usuario> buscarPeloNomeContendo(String nome);

    public Usuario findByNomeAndSenha(String nome, String senha);

    @Query("select u from Usuario u where u.nome = ?1 and u.senha = ?2")
    public Usuario buscarPeloNomeESenha(String nome, String senha);

}
