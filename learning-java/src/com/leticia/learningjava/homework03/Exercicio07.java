package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que leia 5 n�meros e informe o maior n�mero.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double maior = 0;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("Infome um n�mero:");
			double numeroInformado = scanner.nextDouble();
			
			if(numeroInformado > maior) {
				
				maior = numeroInformado;
			}

		}
		
		System.out.println("O maior n�mero �: " + maior);
		
	}
 
}
