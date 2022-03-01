package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que peça os três lados de um triângulo. O programa deverá
		 * informar se os valores podem ser um triângulo. Indique, caso os lados formem
		 * um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
		 * 
		 * Dicas: - Três lados formam um triângulo quando a soma de quaisquer dois lados
		 * for maior que o terceiro; - Triângulo Equilátero: Três lados iguais; -
		 * Triângulo Isósceles: quaisquer dois lados iguais; - Triângulo Escaleno: Três
		 * lados diferentes.
		 * 
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o número do primeiro lado do triângulo: ");
		double primeiroLado = scanner.nextDouble();

		System.out.println("Informe o número do segundo lado do triângulo: ");
		double segundoLado = scanner.nextDouble();

		System.out.println("Informe o número do terceiro lado do triângulo: ");
		double terceiroLado = scanner.nextDouble();

		if ((primeiroLado + segundoLado) > terceiroLado || (segundoLado + terceiroLado) > primeiroLado
				|| (primeiroLado + terceiroLado) > segundoLado) {

			if (primeiroLado == segundoLado && primeiroLado == terceiroLado && segundoLado == terceiroLado) {
				System.out.println("Triângulo Equilátero.");
			} else if (primeiroLado != segundoLado && primeiroLado != terceiroLado && terceiroLado != segundoLado) {
				System.out.println("Triângulo Escaleno.");
			} else if (primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado) {
				System.out.println("Triângulo Isósceles.");
			}
		} else {
			System.out.println("Não forma um triângulo.");
		}

	}

}
