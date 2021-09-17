package br.com.arieltintel.restapi;

import br.com.arieltintel.restapi.controller.Calculo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
		/*
		Calculo calculo = new Calculo();

		BigDecimal calculoDivisaoResultado = calculo.calculoDivisao(new BigDecimal("5"), new BigDecimal("2"));
		System.out.println("Resultado da divisão: " + calculoDivisaoResultado);*/

		SpringApplication.run(RestApiApplication.class, args);
	}


}
