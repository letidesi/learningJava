package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		/*
		 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
		 * inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a
		 * tabuada.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um número:");
		int numero = scanner.nextInt();

		for (int i = 1; i < 11; i++) {

			int num = i * numero;

			System.out.println(i + " x " + numero + " = " + num);
		}

	}

}
