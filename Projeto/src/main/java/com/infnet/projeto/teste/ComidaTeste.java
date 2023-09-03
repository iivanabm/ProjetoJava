package com.infnet.projeto.teste;

import com.infnet.projeto.model.Comida;

public class ComidaTeste {

    public static void main(String[] args) {
        Comida macarronada = new Comida();
        macarronada.setCodigo(4);
        macarronada.setNome("Macarronda da Casa");
        macarronada.setValor(39.90f);
        macarronada.setPeso(400.00f);
        macarronada.setVegano(false);
        macarronada.setIngredientes("macarrão, queijo, molho branco");

        Comida pizza = new Comida();
        pizza.setCodigo(5);
        pizza.setNome("Pizza frango");
        pizza.setValor(59.90f);
        pizza.setPeso(500.00f);
        pizza.setVegano(false);
        pizza.setIngredientes("frango, catupiry, queijo");

        Comida lasanha = new Comida();
        lasanha.setCodigo(5);
        lasanha.setNome("Lasanha Carne");
        lasanha.setValor(19.90f);
        lasanha.setPeso(50.00f);
        lasanha.setVegano(false);
        lasanha.setIngredientes("carne, queijo, presunto");


    }

}
