package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, na
		 * forma ax2 + bx + c. O programa dever� pedir os valores de a, b e c e fazer
		 * consist�ncias, informando ao usu�rio nas seguintes situa��es:
		 * 
		 * - Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do segundo
		 * grau e o programa n�o dever� pedir os demais valores, sendo encerrado;
		 * 
		 * - Se o delta calculado for negativo, a equa��o n�o possui ra�zes reais.
		 * Informe o usu�rio e encerre o programa;
		 * 
		 * - Se o delta calculado for igual a zero a equa��o possui apenas uma raiz
		 * real. Informe ao usu�rio;
		 * 
		 * - Se o delta for positivo a equa��o possui duas ra�zes reais. Informe ao
		 * usu�rio;
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o valor de a para calcular a ra�z da equa��o: ");
		int a = scanner.nextInt();

		if (a != 0) {

			System.out.println("Informe o valor de b para calcular a ra�z da equa��o: ");
			int b = scanner.nextInt();

			System.out.println("Informe o valor de c para calcular a ra�z da equa��o: ");
			int c = scanner.nextInt();

			double delta = Math.pow(b, 2) - (4 * a * c);

			if (delta < 0) {
				System.out.println("A equa��o n�o possui ra�zes reais.");
			} else if (delta == 0) {
				System.out.println("A equa��o possui apenas uma raiz real.");
			} else {

				double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

				System.out.println("A equa��o possui duas ra�zes reais: ");
				System.out.println("X1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		} else {
			System.out.println("N�o � uma equa��o do segundo grau.");
		}

	}

}
