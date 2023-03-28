package com.example.springTopicosEspeciais2301.repository;

import com.example.springTopicosEspeciais2301.entity.Anotacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long> {
    public List<Anotacao> findByTextoContains(String texto);

    @Query("select a from Anotacao a where a.texto like %?1%")
    public List<Anotacao> buscarPorTexto(String texto);

    public List<Anotacao> findByUsuarioNome(String nomeUsuario);

    @Query("select a from Anotacao a join a.usuario u where u.nome = ?1")
    public List<Anotacao> buscarPorNomeUsuario(String nomeUsuario);
}
