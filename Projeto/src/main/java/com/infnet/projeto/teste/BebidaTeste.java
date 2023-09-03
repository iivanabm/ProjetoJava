package com.infnet.projeto.teste;

import com.infnet.projeto.model.Bebida;

public class BebidaTeste {

    public static void main(String[] args) {
        Bebida sucoDeUva = new Bebida();
        sucoDeUva.setGelada(true);
        sucoDeUva.setMarca("Del Vale");
        sucoDeUva.setTamanho(300.00f);
        sucoDeUva.setCodigo(1);
        sucoDeUva.setNome("Suco de Uva");
        sucoDeUva.setValor(5.99f);

        Bebida fanta = new Bebida();
        fanta.setGelada(true);
        fanta.setMarca("Fanta");
        fanta.setTamanho(500.00f);
        fanta.setCodigo(2);
        fanta.setNome("Fanta");
        fanta.setValor(4.95f);

        Bebida agua = new Bebida();
        fanta.setGelada(false);
        fanta.setMarca("Nova Agua");
        fanta.setTamanho(250.00f);
        agua.setCodigo(3);
        agua.setNome("Agua");
        agua.setValor(3.50f);
    }

}
