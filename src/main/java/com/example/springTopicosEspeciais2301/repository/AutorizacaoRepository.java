package com.example.springTopicosEspeciais2301.repository;

import com.example.springTopicosEspeciais2301.entity.Autorizacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long> {
    public Optional<Autorizacao> findByNome(String nome);


}
