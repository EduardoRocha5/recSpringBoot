package com.recuperacao.recuperacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecuperacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecuperacaoApplication.class, args);
		System.out.println("Sistema Iniciado...");
		System.out.println("http://localhost:8080/pedidos");
		

	}

}
