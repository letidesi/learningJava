package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros
		 * que est�o no intervalo compreendido por eles.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro n�mero inteiro:");
		int num1 = scanner.nextInt();

		System.out.println("Informe o segundo n�mero inteiro:");
		int num2 = scanner.nextInt();

		if (num2 > num1) {
			for (int i = num1 + 1; i < num2; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("O segundo n�mero dever� ser maior que o primeiro n�mero!");
		}

	}

}
