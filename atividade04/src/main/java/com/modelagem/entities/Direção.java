package com.modelagem.entities;

public class Direção extends Papel {
    private String papelDirecao;

    public Direção(String papelDirecao, String nomePessoa) {
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
