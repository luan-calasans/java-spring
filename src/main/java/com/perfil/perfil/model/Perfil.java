package com.perfil.perfil.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Perfil implements Serializable {
    private Long id;
    private String nome;
    private String email;
    private String biografia;
    private String fotoPerfil;
    private LocalDateTime dataCriacao;

    public Perfil() {
        this.dataCriacao = LocalDateTime.now(); // Inicializa com a data atual
    }

    public Perfil(Long id) {
        this.id = id;
        this.dataCriacao = LocalDateTime.now(); // Inicializa com a data atual
    }

    // Adicione este método
    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    // Resto dos métodos...

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBiografia() {
        return this.biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getFotoPerfil() {
        return this.fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public LocalDateTime getDataCriacao() {
        return this.dataCriacao;
    }
}
