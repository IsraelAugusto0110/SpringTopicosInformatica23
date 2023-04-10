package com.example.springTopicosEspeciais2301.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "aut_autorizacao")
public class Autorizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aut_id")
    private Long id;

    @Column(name = "aut_nome")
    private String nome;

    @ManyToMany(mappedBy = "autorizacoes")
    @JsonIgnore
    private List<Usuario> usuarios;


    public Autorizacao() {
        // Do nothing
    }

    public Autorizacao(String nome) {
        setNome(nome);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
