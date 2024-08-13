package com.modelagem.entities;

public class Direcao extends Papel {
    private String papelDirecao;

    public Direcao(String nomePessoa, String papelDirecao) {
        super(nomePessoa, "Direção");
        this.papelDirecao = papelDirecao;
    }

    public String getPapelDirecao() {
        return papelDirecao;
    }

    public void setPapelDirecao(String papelDirecao) {
        this.papelDirecao = papelDirecao;
    }

}
