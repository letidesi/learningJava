package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
	
		/* Fa�a um programa que pe�a as 4 notas bimestrias e mostre a m�dia. */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe valor da primeira nota bimestral:");
		double primeiraNota = scanner.nextDouble();
		
		System.out.println("Informe valor da segunda nota bimestral:");
		double segundaNota = scanner.nextDouble();
		
		System.out.println("Informe valor da terceira nota bimestral:");
		double terceiraNota = scanner.nextDouble();
		
		System.out.println("Informe valor da quarta nota bimestral:");
		double quartaNota = scanner.nextDouble();
		
		double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
		System.out.println("Sua m�dia foi: " + media);
		
	}

}
