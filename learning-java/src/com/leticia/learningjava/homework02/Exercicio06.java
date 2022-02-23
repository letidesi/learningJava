package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		/*
		    Faça um programa que leia três números e mostre o maior deles.
		    
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		double primeiroNumero = scanner.nextDouble(); 
		
		System.out.println("Informe o segundo número: ");
		double segundoNumero = scanner.nextDouble(); 
		
		System.out.println("Informe o terceiro número");
		double terceiroNumero = scanner.nextDouble(); 
		
		if(primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O maior número: " + primeiroNumero);
		} else if(segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			System.out.println("O maior número: " + segundoNumero);
		} else {
			System.out.println("O maior número: " + terceiroNumero);
		}

	}

}
