package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		/* Faça um programa que converta de metros para centímetros. */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe quantos metros: ");
		double metros = scanner.nextDouble();
		
		double cm = metros * 100;
		System.out.println(metros + " m é igual a " + cm + " cm.");

	}

}
