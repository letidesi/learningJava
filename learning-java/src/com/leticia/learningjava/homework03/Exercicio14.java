package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade
		 * de números pares e a quantidade de números impares.
		 */

		Scanner scanner = new Scanner(System.in);

		int somarPar = 0;
		int somarImpar = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("Informe um número inteiro: ");
			int numero = scanner.nextInt();

			if (numero % 2 == 0) {
				somarPar += 1;
			} else if (numero % 2 == 1) {
				somarImpar += 1;
			}
		}

		System.out.println(
				"Quantidade de números pares: " + somarPar + "\n" + "Quantidade de números ímpares: " + somarImpar);
	}

}
