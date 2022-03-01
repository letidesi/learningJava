package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que calcule as raízes de uma equação do segundo grau, na
		 * forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer
		 * consistências, informando ao usuário nas seguintes situações:
		 * 
		 * - Se o usuário informar o valor de A igual a zero, a equação não é do segundo
		 * grau e o programa não deverá pedir os demais valores, sendo encerrado;
		 * 
		 * - Se o delta calculado for negativo, a equação não possui raízes reais.
		 * Informe o usuário e encerre o programa;
		 * 
		 * - Se o delta calculado for igual a zero a equação possui apenas uma raiz
		 * real. Informe ao usuário;
		 * 
		 * - Se o delta for positivo a equação possui duas raízes reais. Informe ao
		 * usuário;
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o valor de a para calcular a raíz da equação: ");
		int a = scanner.nextInt();

		if (a != 0) {

			System.out.println("Informe o valor de b para calcular a raíz da equação: ");
			int b = scanner.nextInt();

			System.out.println("Informe o valor de c para calcular a raíz da equação: ");
			int c = scanner.nextInt();

			double delta = Math.pow(b, 2) - (4 * a * c);

			if (delta < 0) {
				System.out.println("A equação não possui raízes reais.");
			} else if (delta == 0) {
				System.out.println("A equação possui apenas uma raiz real.");
			} else {

				double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

				System.out.println("A equação possui duas raízes reais: ");
				System.out.println("X1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		} else {
			System.out.println("Não é uma equação do segundo grau.");
		}

	}

}
