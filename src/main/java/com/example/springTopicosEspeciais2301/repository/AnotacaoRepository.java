package com.example.springTopicosEspeciais2301.repository;

import com.example.springTopicosEspeciais2301.entity.Anotacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long> {
    public List<Anotacao> findByTextoContains(String texto);

    @Query("select a from tra_trabalho a where a.texto like %?6%")
    public List<Anotacao> buscarPorTexto(String texto);

    public default List<Anotacao> findByUsuarioNome(String nomeUsuario) {
        return null;
    }

}
