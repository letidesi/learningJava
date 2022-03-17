package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Altere o programa anterior permitindo ao usuário informar as populações e as
		 * taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a população A: ");
		double A = scanner.nextDouble();

		System.out.println("Informe a taxa anual da população A: ");
		double taxaAnualA = scanner.nextDouble();

		System.out.println("Informe a população B: ");
		double B = scanner.nextDouble();

		System.out.println("Informe a taxa anual da população B: ");
		double taxaAnualB = scanner.nextDouble();

		double anos = 0;

		for (int i = 0; A < B; i++) {
			A += (A * taxaAnualA ) / 100;
			B += (B * taxaAnualB) / 100;
			anos += 1;
		}

		System.out.println("País A: " + A + "% \nPaís B: " + B + "% \nO números de anos necessários para a populução"
				+ " A ultrapassar ou igualar a população B é de " + anos + " anos.");
	}
}
