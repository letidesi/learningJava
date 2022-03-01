package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/* 
		   Faça um programa que peça dois números e imprima o maior deles.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		double primeiroNumero = scanner.nextDouble();
		
		System.out.println("Informe o segundo número: ");
		double segundoNumero = scanner.nextDouble();
		
		if(primeiroNumero > segundoNumero) {
			System.out.println("O maior número é: " + primeiroNumero);
		} else {
			System.out.println("O maior número é: " + segundoNumero);
		}
	}

}
