package com.example;

import java.math.BigDecimal;

import com.example.model.Estoque;
import com.example.model.Gerente;

public class Main {
    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("100");
        BigDecimal desconto = new BigDecimal("0.1");
        Estoque estoque = new Estoque("Produto 1", valor, desconto);
        Gerente gerente = new Gerente("Gerente 1");
        estoque.attach(gerente);
        estoque.setValor(new BigDecimal("200"));
    }
}