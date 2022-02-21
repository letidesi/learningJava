package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		/* Faça um programa que peça o raio de um círculo, calcule e mostre sua área. */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o raio do círculo: ");
		double raio = scanner.nextDouble();
	
		double areaCirculo = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + areaCirculo);
		

	}

}
