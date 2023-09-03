package com.infnet.projeto.teste;

import com.infnet.projeto.exceptions.ProdutoException;
import com.infnet.projeto.model.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoTeste {

    public static void main(String[] args) {
        String[] ingredientesPizza = {"frango", "catupiry", "queijo"};
        Comida pizza = new Comida();
        pizza.setCodigo(5);
        pizza.setNome("Pizza frango");
        pizza.setValor(59.90f);
        pizza.setPeso(500.00f);
        pizza.setVegano(false);
        pizza.setIngredientes(ingredientesPizza);

        Bebida fanta = new Bebida();
        fanta.setGelada(true);
        fanta.setMarca("Fanta");
        fanta.setTamanho(500.00f);
        fanta.setCodigo(2);
        fanta.setNome("Fanta");
        fanta.setValor(4.95f);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(pizza);
        produtos.add(fanta);

        if (produtos.isEmpty()) {
            throw new ProdutoException("A lista de produtos não pode estar vazia");
        }

        Pedido pedido1 = new Pedido();
        pedido1.setData(LocalDateTime.now());
        pedido1.setDescricao("pizza e fanta");
        pedido1.setWeb(false);
        pedido1.setProdutos(produtos);

        String[] ingredientesMacarronada = {"macarrão", "queijo", "molho branco"};
        Comida macarronada = new Comida();
        macarronada.setCodigo(4);
        macarronada.setNome("Macarronda da Casa");
        macarronada.setValor(39.90f);
        macarronada.setPeso(400.00f);
        macarronada.setVegano(false);
        macarronada.setIngredientes(ingredientesMacarronada);

        Bebida sucoDeUva = new Bebida();
        sucoDeUva.setGelada(true);
        sucoDeUva.setMarca("Del Vale");
        sucoDeUva.setTamanho(300.00f);
        sucoDeUva.setCodigo(4);
        sucoDeUva.setNome("Suco de Uva");
        sucoDeUva.setValor(5.99f);

        Sobremesa pudim = new Sobremesa();
        pudim.setNome("Pudim caseiro");
        pudim.setCodigo(6);
        pudim.setValor(12.90f);
        pudim.setDoce(true);
        pudim.setInformacao("Pudim de leite");
        pudim.setQuantidade(2);

        List<Produto> produtos2 = new ArrayList<>();
        produtos2.add(macarronada);
        produtos2.add(sucoDeUva);
        produtos2.add(pudim);

        if (produtos2.isEmpty()) {
            throw new ProdutoException("A lista de produtos não pode estar vazia");
        }

        Pedido pedido2 = new Pedido();
        pedido2.setData(LocalDateTime.now());
        pedido2.setDescricao("macarronada, suco de uva e pudim");
        pedido2.setWeb(true);
        pedido2.setProdutos(produtos2);

        String[] ingredientesLasanha = {"carne", "queijo", "presunto"};
        Comida lasanha = new Comida();
        lasanha.setCodigo(5);
        lasanha.setNome("Lasanha Carne");
        lasanha.setValor(19.90f);
        lasanha.setPeso(50.00f);
        lasanha.setVegano(false);
        lasanha.setIngredientes(ingredientesLasanha);

        Bebida agua = new Bebida();
        agua.setGelada(false);
        agua.setMarca("Nova Agua");
        agua.setTamanho(250.00f);
        agua.setCodigo(3);
        agua.setNome("Agua");
        agua.setValor(3.50f);

        Sobremesa tortaHolandesa = new Sobremesa();
        tortaHolandesa.setNome("Pudim caseiro");
        tortaHolandesa.setCodigo(4);
        tortaHolandesa.setValor(12.90f);
        tortaHolandesa.setDoce(true);
        tortaHolandesa.setInformacao("Pudim de leite");
        tortaHolandesa.setQuantidade(2);
        tortaHolandesa.setInformacao("Pudim de leite condensado");

        List<Produto> produtos3 = new ArrayList<>();
        produtos3.add(lasanha);
        produtos3.add(agua);
        produtos3.add(tortaHolandesa);

        if (produtos3.isEmpty()) {
            throw new ProdutoException("A lista de produtos não pode estar vazia");
        }

        Pedido pedido3 = new Pedido();
        pedido3.setData(LocalDateTime.now());
        pedido3.setDescricao("lasanha, agua e torta holandesa");
        pedido3.setWeb(true);
        pedido3.setProdutos(produtos3);



    }

}
