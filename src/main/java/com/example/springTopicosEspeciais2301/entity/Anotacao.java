package com.example.springTopicosEspeciais2301.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="ant_anotacao")
public class Anotacao {
    @Column(name = "ant_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ant_texto")
    private String texto;
    @Column(name = "ant_data_hora")
    private LocalDateTime dataHora;
    @JoinColumn(name="ant_usr_id")
    @ManyToOne
    private Usuario usuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
