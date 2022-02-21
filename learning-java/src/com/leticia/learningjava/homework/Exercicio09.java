package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		/* 
		   Faça um programa que peça a temperatura em graus Farenheit, 
		   transforme e mostre a temperatura em graus Celsius.
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus Farenheit: ");
		double farenheit = scanner.nextDouble();
		
		double celsius = (5 * (farenheit - 32) / 9);
		System.out.println("A temperatura " + farenheit + " °F é igual a: " + celsius + " °C.");
		
	}

}
