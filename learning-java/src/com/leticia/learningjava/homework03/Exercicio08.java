package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros.
		 */
		
		Scanner scanner = new Scanner(System.in);

		double soma = 0 ;
		double media = 0;

		for (int i = 0; i < 5; i++) {

			System.out.println("Informe um n�mero:");
			double num = scanner.nextDouble();
           
			soma += num;
			
			media = soma / 5;
			
		}

		System.out.println("O valor da soma dos n�meros �: " + soma + "\n" + "A m�dia �: " + media);
	}

}
