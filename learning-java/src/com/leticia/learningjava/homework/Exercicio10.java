package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		/* 
		   Fa�a um programa que pe�a a temperatura em graus Celsius,
		   transforme e mostre a temperatura em graus Farenheit.
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		double celsius = scanner.nextDouble();
		
		double farenheit = (celsius * 9 / 5) + 32;
		System.out.println("A temperatura " + celsius + " �C � igual a: " + farenheit + " �F.");
	}

}
