package com.recuperacao.recuperacao.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private Boolean status;
    private LocalDate dataCriacao;
    private int quantidadePedidos;

public Pedido(){

    this.dataCriacao = LocalDate.now();
    this.status = false ;
    
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

public Boolean getStatus() {
    return status;
}

public void setStatus(Boolean status) {
    this.status = status;
}

public LocalDate getDataCriacao() {
    return dataCriacao;
}

public void setDataCriacao(LocalDate dataCriacao) {
    this.dataCriacao = dataCriacao;
}

public int getQuantidadePedidos() {
    return quantidadePedidos;
}

public void setQuantidadePedidos(int quantidadePedidos) {
    this.quantidadePedidos = quantidadePedidos;
 }
 
}