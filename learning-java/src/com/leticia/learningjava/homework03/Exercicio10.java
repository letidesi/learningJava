package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que receba dois números inteiros e gere os números inteiros
		 * que estão no intervalo compreendido por eles.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro número inteiro:");
		int num1 = scanner.nextInt();

		System.out.println("Informe o segundo número inteiro:");
		int num2 = scanner.nextInt();

		if (num2 > num1) {
			for (int i = num1 + 1; i < num2; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("O segundo número deverá ser maior que o primeiro número!");
		}

	}

}
