package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e mostre o
		 * primeiro n�mero elevado ao segundo n�mero. N�o utilize a fun��o de pot�ncia
		 * da linguagem.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o n�mero da base:");
		double base = scanner.nextDouble();

		System.out.println("Informe o n�mero do expoente:");
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
