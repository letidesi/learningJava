package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		

		/*
		    Fa�a um programa que leia tr�s n�meros e mostre o maior e o menor deles.
		    
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: "); // 9
		double primeiroNumero = scanner.nextDouble(); 
		
		System.out.println("Informe o segundo n�mero: "); // 7
		double segundoNumero = scanner.nextDouble(); 
		
		System.out.println("Informe o terceiro n�mero"); // 10
		double terceiroNumero = scanner.nextDouble(); 
		
		if(primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero) {
			System.out.println("O primeiro n�mero � o maior: " + primeiroNumero);
		} else if(segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero) {
			System.out.println("O segundo n�mero � o maior: " + segundoNumero);
		} else if (terceiroNumero >= primeiroNumero && terceiroNumero >= segundoNumero) {
			System.out.println("O terceiro n�mero � o maior: " + terceiroNumero);
		}
		
		if(primeiroNumero <= segundoNumero && primeiroNumero <= terceiroNumero) {
			System.out.println("O primeiro n�mero � o menor: " + primeiroNumero);
		} else if (segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero) {
			System.out.println("O segundo n�mero � o menor: " + segundoNumero);
		} else if (terceiroNumero <= primeiroNumero && terceiroNumero <= segundoNumero) {
			System.out.println("O terceiro n�mero � o menor: " + terceiroNumero);
		}

	}

}
