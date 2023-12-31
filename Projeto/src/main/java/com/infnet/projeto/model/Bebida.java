package com.infnet.projeto.model;

public class Bebida extends Produto {

    private boolean gelada;
    private float tamanho;
    private String marca;

    public boolean isGelada() {
        return gelada;
    }

    public void setGelada(boolean gelada) {
        this.gelada = gelada;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public float calcularPrecoTotal(int quantidade) {
        if (gelada) {
            return this.getValor() * quantidade * 1.10f;
        }
        return quantidade * this.getValor();
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "gelada=" + gelada +
                ", tamanho=" + tamanho +
                ", marca='" + marca + '\'' +
                '}';
    }
}
