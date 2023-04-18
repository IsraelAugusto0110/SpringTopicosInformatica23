package com.example.springTopicosEspeciais2301.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="tra_trabalho")
public class Anotacao {
    @Column(name = "trab_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tra_titulo")
    private String texto;
    @Column(name = "tra_data_hora_entrega")
    private LocalDateTime dataHora;
    @Column(name = "tra_descricao")
    private String texStringto;
    @Column(name = "tra_grupo")
    private String getTexStringto;
    @Column(name = "tra_justificativa")
    private String string;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }


    }


