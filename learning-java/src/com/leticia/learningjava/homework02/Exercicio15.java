package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que pe�a os tr�s lados de um tri�ngulo. O programa dever�
		 * informar se os valores podem ser um tri�ngulo. Indique, caso os lados formem
		 * um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
		 * 
		 * Dicas: - Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados
		 * for maior que o terceiro; - Tri�ngulo Equil�tero: Tr�s lados iguais; -
		 * Tri�ngulo Is�sceles: quaisquer dois lados iguais; - Tri�ngulo Escaleno: Tr�s
		 * lados diferentes.
		 * 
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o n�mero do primeiro lado do tri�ngulo: ");
		double primeiroLado = scanner.nextDouble();

		System.out.println("Informe o n�mero do segundo lado do tri�ngulo: ");
		double segundoLado = scanner.nextDouble();

		System.out.println("Informe o n�mero do terceiro lado do tri�ngulo: ");
		double terceiroLado = scanner.nextDouble();

		if ((primeiroLado + segundoLado) > terceiroLado || (segundoLado + terceiroLado) > primeiroLado
				|| (primeiroLado + terceiroLado) > segundoLado) {

			if (primeiroLado == segundoLado && primeiroLado == terceiroLado && segundoLado == terceiroLado) {
				System.out.println("Tri�ngulo Equil�tero.");
			} else if (primeiroLado != segundoLado && primeiroLado != terceiroLado && terceiroLado != segundoLado) {
				System.out.println("Tri�ngulo Escaleno.");
			} else if (primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado) {
				System.out.println("Tri�ngulo Is�sceles.");
			}
		} else {
			System.out.println("N�o forma um tri�ngulo.");
		}

	}

}
