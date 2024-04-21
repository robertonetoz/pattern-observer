package com.pattern.observer.observer;

import com.pattern.observer.model.Estoque;
import com.pattern.observer.model.Gerente;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valorInicial = new BigDecimal("1080.0");
        BigDecimal desconto = new BigDecimal("20.0");
        Gerente gerente = new Gerente("João");
        Estoque estoque = new Estoque("Camiseta", valorInicial, desconto);
        estoque.attach(gerente);
        estoque.setValor(valorInicial);
    }
}