package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		/*
		 * Uma fruteira está vendendo frutas com a seguinte tabela de preços:
		 * 
		 * Até 5 Kg Acima de 5 Kg Morango R$ 2,50 por Kg R$ 2,20 por Kg Maçã R$ 1,80 por
		 * Kg R$ 1,50 por Kg
		 * 
		 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
		 * ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
		 * Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade
		 * (em Kg) de maçãs adquiridas e escreva o valor a ser pago pelo cliente.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a quantidade de morangos em kg:");
		double quantidadeMorangosKg = scanner.nextDouble();

		System.out.println("Informe a quantidade de maças em kg: ");
		double quantidadeMacasKg = scanner.nextDouble();

		double precoMorangosKg = 0;

		if (quantidadeMorangosKg <= 5) {
			precoMorangosKg = 2.50;
		} else {
			precoMorangosKg = 2.20;
		}

		double precoMacasKg = 0;

		if (quantidadeMacasKg <= 5) {
			precoMacasKg = 1.80;
		} else {
			precoMacasKg = 1.50;
		}

		double precoTotalDosMorangos = quantidadeMorangosKg * precoMorangosKg;
		double precoTotalDasMacas = quantidadeMacasKg * precoMacasKg;

		double precoParcial = precoMorangosKg + precoMacasKg;
		double precoTotal = precoParcial;

		if ((quantidadeMorangosKg + quantidadeMacasKg > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}

		System.out.println("Preço Total: " + precoTotal);
	}
}
