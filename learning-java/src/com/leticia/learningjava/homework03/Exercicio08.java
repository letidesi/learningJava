package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que leia 5 números e informe a soma e a média dos números.
		 */
		
		Scanner scanner = new Scanner(System.in);

		double soma = 0 ;
		double media = 0;

		for (int i = 0; i < 5; i++) {

			System.out.println("Informe um número:");
			double num = scanner.nextDouble();
           
			soma += num;
			
			media = soma / 5;
			
		}

		System.out.println("O valor da soma dos números é: " + soma + "\n" + "A média é: " + media);
	}

}
