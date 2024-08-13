package com.modelagem.entities;

import java.util.List;

public class Filme {
    private String titulo;
    private int ano;
    private String produtora;
    private String paisOrigem;
    private String duracao;

    private Genero genero;

    private List<Ator> atores;
    private List<Direcao> diretores;
    private List<Producao> producoes;

    public Filme(String titulo, int ano, String produtora, String paisOrigem, String duracao, Genero genero, List<Ator> atores, List<Direcao> diretores, List<Producao> producoes) {
        this.titulo = titulo;
        this.ano = ano;
        this.produtora = produtora;
        this.paisOrigem = paisOrigem;
        this.duracao = duracao;
        this.genero = genero;
        this.atores = atores;
        this.diretores = diretores;
        this.producoes = producoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void addAtor(Ator ator) {
        this.atores.add(ator);
    }

    public List<Direcao> getDirecao() {
        return diretores;
    }

    public void addDirecao(Direcao direção) {
        this.diretores.add(direção);
    }

    public List<Producao> getProducao() {
        return producoes;
    }

    public void addProducao(Producao producao) {
        this.producoes.add(producao);
    }

    
    

}
