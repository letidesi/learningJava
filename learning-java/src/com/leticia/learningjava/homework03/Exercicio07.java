package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que leia 5 números e informe o maior número.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double maior = 0;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Infome um número:");
			double numeroInformado = scanner.nextDouble();
			
			if(numeroInformado > maior) {
				
				maior = numeroInformado;
			}

		}
		
		System.out.println("O maior número é: " + maior);
		
	}
 
}
