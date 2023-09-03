package com.infnet.projeto.model;

import java.util.Set;

public class Solicitante {

    private String nome;
    private String cpf;
    private String email;
    private Set<Pedido> pedidos;

    public Solicitante(String nome, String cpf, String email, Set<Pedido> pedidos) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.pedidos = pedidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Solicitante{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", pedidos=" + pedidos +
                '}';
    }
}
