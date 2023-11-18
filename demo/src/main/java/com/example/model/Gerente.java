package com.example.model;

import com.example.observer.Observer;

public class Gerente implements Observer {
    private String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    public Gerente() {}

    //crie os getters e setters
    @Override
    public void update(Estoque estoque) {
        System.out.println("Gerente " + this.nome + " foi notificado de que o produto " + estoque.getProduto() + " teve seu valor alterado para " + estoque.getValor() + " e seu desconto alterado para " + estoque.getDesconto());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
