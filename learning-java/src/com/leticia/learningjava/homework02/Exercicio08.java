package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		/*
		   Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual
		   produto voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato.
		   
		 */
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Informe o pre�o do primeiro produto: "); // 14,00
		double primeiroProduto = scanner.nextDouble();
		
		System.out.println("Informe o pre�o do segundo produto: "); // 12,00
		double segundoProduto = scanner.nextDouble();
		
		System.out.println("Informe o pre�o do terceiro produto: "); // 9,00
		double terceiroProduto = scanner.nextDouble();
			
		if(primeiroProduto < segundoProduto && primeiroProduto < terceiroProduto) {
			System.out.println("Compre o primeiro produto com o valor de: " + primeiroProduto);
		} else if (segundoProduto < primeiroProduto && segundoProduto < terceiroProduto) {
			System.out.println("Compre o segundo produto com o valor de: " + segundoProduto);
		} else {
			System.out.println("Compre o terceiro produto com o valor de: " + terceiroProduto);
		}
		
	}

}
