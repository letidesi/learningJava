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
		double grausCelsius = scanner.nextDouble();
		
		double farenheit = (grausCelsius * 9 / 5) + 32;
		System.out.println("A temperatura em Farenheit � de: " + farenheit);
	}

}
