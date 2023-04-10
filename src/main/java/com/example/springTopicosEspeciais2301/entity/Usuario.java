package com.example.springTopicosEspeciais2301.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usr_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usr_id")
    private Long id;

    @Column(name = "usr_nome")
    private String nome;

    @Column(name = "usr_senha")
    @JsonIgnore
    private String senha;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Anotacao> anotacoes;

    @ManyToMany
    @JoinTable(name = "uau_usuario_autorizacao",
            joinColumns = {@JoinColumn(name = "usr_id")},
            inverseJoinColumns = {@JoinColumn(name = "aut_id")})
    private List<Autorizacao> autorizacoes;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario() {
        // Faz nada
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Anotacao> getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(List<Anotacao> anotacoes) {
        this.anotacoes = anotacoes;
    }

    public List<Autorizacao> getAutorizacoes() {
        return autorizacoes;
    }

    public void setAutorizacoes(List<Autorizacao> autorizacoes) {
        this.autorizacoes = autorizacoes;
    }
}
