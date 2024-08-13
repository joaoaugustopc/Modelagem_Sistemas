package com.modelagem.entities;

import java.sql.Date;
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



    public Sessao(Date data, String horaSessao, Sala sala) {
        this.data = data;
        this.horaSessao = horaSessao;
        this.estadoSessao = estadoSessao;
        this.ingressosSessao = sala.getCapacidade();
        this.ingressosComprados = 0;
        this.ingressosRestantes = this.ingressosSessao;
        this.sala = sala;
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


    
}
