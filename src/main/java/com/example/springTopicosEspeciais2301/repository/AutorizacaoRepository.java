package com.example.springTopicosEspeciais2301.repository;

import com.example.springTopicosEspeciais2301.entity.Autorizacao;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import java.util.Optional;

public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long> {
    public Optional<Autorizacao> findByNome(String nome);
=======
public interface AutorizacaoRepository extends JpaRepository<Autorizacao, Long> {
>>>>>>> 5c18c87fc9711f11a26e305574a56b1896180de5
}
