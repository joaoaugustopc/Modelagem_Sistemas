package com.modelagem.entities;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class Sessao {
    private Date data;
    private String horaSessao;
    private String estadoSessao;
    private int ingressosSessao;
    private int ingressosComprados;
    private int ingressosRestantes;
    private Sala sala;
    private List<Ingresso> ingressos;
    private Filme filme;



    public Sessao(Date data, String horaSessao, Sala sala, Filme filme) {
        this.data = data;
        this.horaSessao = horaSessao;
        this.ingressosSessao = sala.getCapacidade();
        this.ingressosComprados = 0;
        this.ingressosRestantes = this.ingressosSessao;
        this.sala = sala;
        this.estadoSessao = "Aberta";
        this.ingressos = new ArrayList<Ingresso>();
        this.filme = filme;
    }

    public void venderIngresso(Ingresso ingresso) {

        if (this.ingressosRestantes == 0) {
            System.out.println("Ingressos esgotados");
            return;
        }

        this.ingressosComprados++;
        this.ingressosRestantes--;

        this.ingressos.add(ingresso);
    }

    public void exibirSessao() {
        System.out.println("SESSÃO - " + this.filme.getTitulo() + " - " + this.data + " - " + this.horaSessao);
        System.out.println("Estado: " + this.estadoSessao);
        System.out.println("Ingressos: " + this.ingressosSessao);
        System.out.println("Ingressos comprados: " + this.ingressosComprados);
        System.out.println("Ingressos restantes: " + this.ingressosRestantes);
        System.out.println("Sala: " + this.sala.getNumeroSala());
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHoraSessao() {
        return horaSessao;
    }

    public void setHoraSessao(String horaSessao) {
        this.horaSessao = horaSessao;
    }

    public String getEstadoSessao() {
        return estadoSessao;
    }

    public void setEstadoSessao(String estadoSessao) {
        this.estadoSessao = estadoSessao;
    }

    public int getIngressosSessao() {
        return ingressosSessao;
    }

    public int getIngressosComprados() {
        return ingressosComprados;
    }

    public int getIngressosRestantes() {
        return ingressosRestantes;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

}
