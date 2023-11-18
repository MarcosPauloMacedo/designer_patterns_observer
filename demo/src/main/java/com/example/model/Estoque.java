package com.example.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.example.observer.Observer;

public class Estoque {
    private String produto;
    private BigDecimal valor;
    private BigDecimal desconto;
    private List<Observer> observers = new ArrayList<Observer>();

    public Estoque(String produto, BigDecimal valor, BigDecimal desconto) {
        this.produto = produto;
        this.valor = valor;
        this.desconto = desconto;
    }

    public Estoque() {}

    //crie os getters e setters
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this);
        }
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
        this.notifyObservers();
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
        this.notifyObservers();
    }

    public String getProduto() {
        return produto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }
}
