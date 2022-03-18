package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que peça dois números, base e expoente, calcule e mostre o
		 * primeiro número elevado ao segundo número. Não utilize a função de potência
		 * da linguagem.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o número da base:");
		double base = scanner.nextDouble();

		System.out.println("Informe o número do expoente:");
		double expoente = scanner.nextDouble();

		double potencia = 1;
		double calcular = 0;

		for (int i = 0; i < expoente; i++) {

			potencia *= base;
			i += 1;

			calcular = potencia * potencia;

		}

		System.out.println(+base + " ^ " + expoente + " = " + calcular);
	}

}
