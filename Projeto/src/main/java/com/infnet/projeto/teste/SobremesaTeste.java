package com.infnet.projeto.teste;

import com.infnet.projeto.exceptions.QuantidadeException;
import com.infnet.projeto.model.Sobremesa;

import java.util.ArrayList;
import java.util.List;

public class SobremesaTeste {

    public static void main(String[] args) {
        Sobremesa pudim = new Sobremesa();
        pudim.setNome("Pudim caseiro");
        pudim.setCodigo(6);
        pudim.setValor(12.90f);
        pudim.setDoce(true);
        pudim.setInformacao("Pudim de leite");
        pudim.setQuantidade(2);

        if (pudim.getQuantidade() < 0) {
            throw new QuantidadeException("A quantidade deve ser maior que zero");
        }

        Sobremesa tortaHolandesa = new Sobremesa();
        tortaHolandesa.setNome("Pudim caseiro");
        tortaHolandesa.setCodigo(7);
        tortaHolandesa.setValor(12.90f);
        tortaHolandesa.setDoce(true);
        tortaHolandesa.setInformacao("Pudim de leite");
        tortaHolandesa.setQuantidade(2);
        tortaHolandesa.setInformacao("Pudim de leite condensado");

        if (tortaHolandesa.getQuantidade() < 0) {
            throw new QuantidadeException("A quantidade deve ser maior que zero");
        }

        Sobremesa brigadeiro = new Sobremesa();
        brigadeiro.setNome("Pudim caseiro");
        brigadeiro.setCodigo(8);
        brigadeiro.setValor(12.90f);
        brigadeiro.setDoce(true);
        brigadeiro.setInformacao("Pudim de leite");
        brigadeiro.setQuantidade(2);
        brigadeiro.setInformacao("Pudim de leite condensado");

        if (brigadeiro.getQuantidade() < 0) {
            throw new QuantidadeException("A quantidade deve ser maior que zero");
        }

        List<Sobremesa> sobremesas = new ArrayList<>();
        sobremesas.add(brigadeiro);
        sobremesas.add(tortaHolandesa);
        sobremesas.add(pudim);

    }

}
