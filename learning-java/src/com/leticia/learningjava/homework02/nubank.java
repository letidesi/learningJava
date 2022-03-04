package com.leticia.learningjava.homework02;

public class nubank {

	public static void main(String[] args) {

		int n = 5;
		double[] duracoes = { 1.90, 1.04, 1.25, 2.5, 1.75 };

		double primeiroFilme = duracoes[0];
		double segundoFilme = duracoes[1];
		double terceiroFilme = duracoes[2];
		double quartoFilme = duracoes[3];
		double quintoFilme = duracoes[4];

		double primeiroDia = primeiroFilme + segundoFilme;
		double segundoDia = terceiroFilme + quintoFilme;
		double terceiroDia = quartoFilme;

		double terminaNoTerceiroDia = terceiroDia;

		terminaNoTerceiroDia = (int) Math.round(3);

		System.out.println(terminaNoTerceiroDia);

	}

}
