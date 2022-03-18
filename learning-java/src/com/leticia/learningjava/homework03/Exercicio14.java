package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre a quantidade
		 * de n�meros pares e a quantidade de n�meros impares.
		 */

		Scanner scanner = new Scanner(System.in);

		int somarPar = 0;
		int somarImpar = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("Informe um n�mero inteiro: ");
			int numero = scanner.nextInt();

			if (numero % 2 == 0) {
				somarPar += 1;
			} else if (numero % 2 == 1) {
				somarImpar += 1;
			}
		}

		System.out.println(
				"Quantidade de n�meros pares: " + somarPar + "\n" + "Quantidade de n�meros �mpares: " + somarImpar);
	}

}
