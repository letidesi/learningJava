package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que pe�a um n�mero inteiro e determine se ele � par ou
		 * �mpar.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um n�mero inteiro: ");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println("� par.");
		} else {
			System.out.println("� �mpar.");
		}

	}

}
