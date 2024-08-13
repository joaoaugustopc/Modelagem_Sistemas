package com.modelagem.entities;

public class Ingresso {

    private int numeroIngresso;
    private int assentoIgresso;
    private String tipoIngresso;
    private float valorIngresso;
    private String dataHoraCompra;
    private static int idxIngresso = 0;


    public Ingresso(int assentoIgresso, String tipoIngresso, float valorIngresso, String dataHoraCompra) {
        this.assentoIgresso = assentoIgresso;
        this.tipoIngresso = tipoIngresso;
        this.valorIngresso = valorIngresso;
        this.dataHoraCompra = dataHoraCompra;
        this.numeroIngresso = idxIngresso++;
    }


    public int getNumeroIngresso() {
        return numeroIngresso;
    }


    public void setNumeroIngresso(int numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
    }


    public int getAssentoIgresso() {
        return assentoIgresso;
    }


    public void setAssentoIgresso(int assentoIgresso) {
        this.assentoIgresso = assentoIgresso;
    }


    public String getTipoIngresso() {
        return tipoIngresso;
    }


    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }


    public float getValorIngresso() {
        return valorIngresso;
    }


    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }


    public String getDataHoraCompra() {
        return dataHoraCompra;
    }


    public void setDataHoraCompra(String dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }

    public void imprimirIngresso() {
        System.out.println("Ingresso: " + numeroIngresso);
        System.out.println("Assento: " + assentoIgresso);
        System.out.println("Tipo: " + tipoIngresso);
        System.out.println("Valor: " + valorIngresso);
        System.out.println("Data e hora da compra: " + dataHoraCompra);
    }

    




    


}
