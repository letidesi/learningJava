package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/* Fa�a um programa que pe�a dois n�meros e imprima a soma. */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		double primeiroNumero = scanner.nextDouble();
		
		System.out.println("Informe o segundo n�mero: ");
		double segundoNumero = scanner.nextDouble();
		
		double soma = primeiroNumero + segundoNumero;
		System.out.println("O valor da soma �: " + soma);
		
	}

}
