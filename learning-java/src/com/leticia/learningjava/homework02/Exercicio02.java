package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Fa?a um programa que pe?a um valor e mostre na tela se o valor ? positivo ou
		 * negativo.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um n?mero: ");
		double numero = scanner.nextDouble();

		if (numero < 0) {
			System.out.println("O n?mero informado foi: '" + numero + "'. ? negativo!");
		} else {
			System.out.println("O n?mero informado foi: '" + numero + "'. ? positivo!");
		}

	}

}
