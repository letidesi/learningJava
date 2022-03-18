package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		/*
		 * Altere o programa anterior para mostrar no final a soma dos números.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro número inteiro:");
		int num1 = scanner.nextInt();

		System.out.println("Informe o segundo número inteiro:");
		int num2 = scanner.nextInt();

		double soma = 0;

		if (num2 > num1) {
			for (int i = num1 + 1; i < num2; i++) {
				soma += i;
				System.out.println(i);
			}
			System.out.println("O valor da soma dos números é: " + soma);
		} else {
			System.out.println("O segundo número deverá ser maior que o primeiro número!");
		}

	}

}
