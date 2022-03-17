package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Altere o programa anterior permitindo ao usu�rio informar as popula��es e as
		 * taxas de crescimento iniciais. Valide a entrada e permita repetir a opera��o.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a popula��o A: ");
		double A = scanner.nextDouble();

		System.out.println("Informe a taxa anual da popula��o A: ");
		double taxaAnualA = scanner.nextDouble();

		System.out.println("Informe a popula��o B: ");
		double B = scanner.nextDouble();

		System.out.println("Informe a taxa anual da popula��o B: ");
		double taxaAnualB = scanner.nextDouble();

		double anos = 0;

		for (int i = 0; A < B; i++) {
			A += (A * taxaAnualA ) / 100;
			B += (B * taxaAnualB) / 100;
			anos += 1;
		}

		System.out.println("Pa�s A: " + A + "% \nPa�s B: " + B + "% \nO n�meros de anos necess�rios para a populu��o"
				+ " A ultrapassar ou igualar a popula��o B � de " + anos + " anos.");
	}
}
