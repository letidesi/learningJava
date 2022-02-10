package com.leticia.learningjava.aula11;

public class VariaveisPontoFlutuante {

	public static void main(String[] args) {
		
		double totalDinheiro = 10.00;
		
		double valorDaPassagemOnibus = 2.70;
		
		float valorDaPassagemTrem = 3.00f;
		
		double valorFinal = totalDinheiro - valorDaPassagemOnibus - valorDaPassagemTrem;
		
		System.out.println("Restou para o Bryan somente: " + valorFinal + " reais.");

	}

}
