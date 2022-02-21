package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/* Faça um programa que peça dois números e imprima a soma. */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		double primeiroNumero = scanner.nextDouble();
		
		System.out.println("Informe o segundo número: ");
		double segundoNumero = scanner.nextDouble();
		
		double soma = primeiroNumero + segundoNumero;
		System.out.println("O valor da soma é: " + soma);
		
	}

}
