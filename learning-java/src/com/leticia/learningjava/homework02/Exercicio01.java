package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/* 
		   Fa�a um programa que pe�a dois n�meros e imprima o maior deles.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		double primeiroNumero = scanner.nextDouble();
		
		System.out.println("Informe o segundo n�mero: ");
		double segundoNumero = scanner.nextDouble();
		
		if(primeiroNumero > segundoNumero) {
			System.out.println("O maior n�mero �: " + primeiroNumero);
		} else {
			System.out.println("O maior n�mero �: " + segundoNumero);
		}
	}

}
