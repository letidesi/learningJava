package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia três números e mostre o maior deles.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		double primeiroNumero = scanner.nextDouble();

		System.out.println("Informe o segundo número: ");
		double segundoNumero = scanner.nextDouble();

		System.out.println("Informe o terceiro número");
		double terceiroNumero = scanner.nextDouble();

		if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero) {
			System.out.println("O primeiro número é o maior: " + primeiroNumero);
		} else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero) {
			System.out.println("O segundo número é o maior: " + segundoNumero);
		} else if (terceiroNumero >= primeiroNumero && terceiroNumero >= segundoNumero) {
			System.out.println("O terceiro número é o maior: " + terceiroNumero);
		}

	}

}
