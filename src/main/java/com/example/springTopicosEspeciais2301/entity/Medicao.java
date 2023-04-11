package com.example.springTopicosEspeciais2301.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mdc_medicao")
public class Medicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mdc_id")
    private Long id;

    @Column(name = "mdc_data_hora")

    private LocalDateTime dataHora;

    @Column(name = "mdc_temperatura")
    private float temperatura;

    @Column(name = "mdc_umidade")
    private float umidade;

    @Column(name = "mdc_particulas")
    private float particulas;

    @Column(name = "mdc_status")
    private String status;

    @Column(name = "mdc_data_processamento")
    private LocalDateTime dataProcessamento;

    public Medicao() {
    }

    public Medicao(Long id, LocalDateTime dataHora, float temperatura, float umidade, float particulas, String status, LocalDateTime dataProcessamento) {
        this.id = id;
        this.dataHora = dataHora;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.particulas = particulas;
        this.status = status;
        this.dataProcessamento = dataProcessamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getUmidade() {
        return umidade;
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
    }

    public float getParticulas() {
        return particulas;
    }

    public void setParticulas(float particulas) {
        this.particulas = particulas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataProcessamento() {
        return dataProcessamento;
    }

    public void setDataProcessamento(LocalDateTime dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
    }
}
