package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		/*
		 * Altere o programa anterior para mostrar no final a soma dos n�meros.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro n�mero inteiro:");
		int num1 = scanner.nextInt();

		System.out.println("Informe o segundo n�mero inteiro:");
		int num2 = scanner.nextInt();

		double soma = 0;

		if (num2 > num1) {
			for (int i = num1 + 1; i < num2; i++) {
				soma += i;
				System.out.println(i);
			}
			System.out.println("O valor da soma dos n�meros �: " + soma);
		} else {
			System.out.println("O segundo n�mero dever� ser maior que o primeiro n�mero!");
		}

	}

}
