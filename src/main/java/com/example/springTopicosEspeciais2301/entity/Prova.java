package com.example.springTopicosEspeciais2301.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "prv_prova")
public class Prova {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prv_id")
    private Long id;

    @Column(name = "prv_descricao")
    private String descricao;

    @Column(name = "prv_data_hora")
    private LocalDateTime dataHora;

    @Column(name = "prv_peso")
    private Float peso;

    public Prova() {}

    public Prova(String descricao, LocalDateTime dataHora, Float peso) {
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.peso = peso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
}
