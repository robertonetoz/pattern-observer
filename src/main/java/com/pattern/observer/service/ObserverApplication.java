package com.pattern.observer.service;

import com.pattern.observer.model.Estoque;
import com.pattern.observer.model.Gerente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ObserverApplication {
	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);
		BigDecimal valorInicial = new BigDecimal("1080.0");
		BigDecimal desconto = new BigDecimal("20.0");
		Gerente gerente = new Gerente("João");
		Estoque estoque = new Estoque("Camiseta", valorInicial, desconto);
		estoque.attach(gerente);
		estoque.setValor(valorInicial);
	}
}

