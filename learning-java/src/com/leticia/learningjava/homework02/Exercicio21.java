package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		/*
		 * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		 * 
		 * 
		 * Álcool: até 20 litros, desconto de 3% por litro acima de 20 litros, desconto
		 * de 5% por litro
		 * 
		 * Gasolina: até 20 litros, desconto de 4% por litro acima de 20 litros,
		 * desconto de 6% por litro
		 * 
		 * Escreva um algoritmo que leia o número de litros vendidos, o tipo de
		 * combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e
		 * imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da
		 * gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe quantos litros você deseja:");
		double litros = scanner.nextDouble();

		System.out.println("Informe o tipo de combustível que você deseja: \n" + "[A] - Álcool  " + "[G] - Gasolina");

		String combustivel = scanner.next();

		double precoAlcool = 1.90;
		double precoGasolina = 2.50;

		double total = 0;
		double totalDesconto = 0;

		int percentualDesconto = 0;

		boolean valido = true;

		if (combustivel.equalsIgnoreCase("a")) {

			if (litros <= 20) {
				percentualDesconto = 3;
			} else {
				percentualDesconto = 5;
			}

			total = litros * precoAlcool;

		} else if (combustivel.equalsIgnoreCase("g")) {

			if (litros <= 20) {
				percentualDesconto = 4;
			} else {
				percentualDesconto = 6;
			}

			total = litros * precoGasolina;

		} else {
			System.out.println("Valor inválido.");
			valido = false;
		}

		if (valido) {
			totalDesconto = (total / 100) * percentualDesconto;

			double precoASerPago = total - totalDesconto;

			System.out.println("Valor a ser pago: " + precoASerPago);
			System.out.println("Total Desconto: " + totalDesconto);
			System.out.println("Percentual Desconto: " + percentualDesconto + "%");
		}

	}

}
