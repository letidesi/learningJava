package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem
		 * caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um
		 * valor v�lido.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe uma nota entre [0-10]:");
		double nota = scanner.nextDouble();

		if (nota < 0 || nota > 10) {
			System.out.println("Valor inv�lido.\n");

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
