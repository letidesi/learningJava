package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		/* Fa�a um programa que converta de metros para cent�metros. */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe quantos metros: ");
		double metros = scanner.nextDouble();
		
		double cm = metros * 100;
		System.out.println(metros + " m � igual a " + cm + " cm.");

	}

}
