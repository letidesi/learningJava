package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
		 * caso o valor seja inválido e continue pedindo até que o usuário informe um
		 * valor válido.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe uma nota entre [0-10]:");
		double nota = scanner.nextDouble();

		if (nota < 0 || nota > 10) {
			System.out.println("Valor inválido.\n");

			for (int i = 0;; i++) {
				System.out.println("Informe uma nota entre [0-10]:");
				double nota2 = scanner.nextDouble();

				if (nota2 >= 0 && nota2 <= 10) {
					System.out.println(nota2);
					break;

				} else {
					continue;
				}
			}

		}

	}

}
