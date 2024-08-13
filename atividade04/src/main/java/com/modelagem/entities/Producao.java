package com.modelagem.entities;

public class Producao extends Papel {
    private String papelProdução;

    public Producao(String nomePessoa, String papelProdução) {
        super(nomePessoa, "Produção");
        this.papelProdução = papelProdução;
    }

    public String getPapelProdução() {
        return papelProdução;
    }

    public void setPapelProdução(String papelProdução) {
        this.papelProdução = papelProdução;
    }
}
