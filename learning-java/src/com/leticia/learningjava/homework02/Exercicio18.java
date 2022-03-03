package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que peça um número inteiro e determine se ele é par ou
		 * ímpar.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println("É par.");
		} else {
			System.out.println("É ímpar.");
		}

	}

}
