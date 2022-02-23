package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		

		/*
		    Faça um programa que leia três números e mostre o maior e o menor deles.
		    
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: "); // 9
		double primeiroNumero = scanner.nextDouble(); 
		
		System.out.println("Informe o segundo número: "); // 7
		double segundoNumero = scanner.nextDouble(); 
		
		System.out.println("Informe o terceiro número"); // 10
		double terceiroNumero = scanner.nextDouble(); 
		
		if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O maior número: " + primeiroNumero);
		} else if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			System.out.println("O maior número: " + segundoNumero);
		} else {
			System.out.println("O maior número: " + terceiroNumero);
		}
		
		if(primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
			System.out.println("O menor número: " + primeiroNumero);
		} else if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
			System.out.println("O menor número: " + segundoNumero);
		} else {
			System.out.println("O menor número: " + terceiroNumero);
		}

	}

}
