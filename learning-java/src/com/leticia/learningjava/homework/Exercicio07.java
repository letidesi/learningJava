package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		/*
		   Fa�a um programa que calcule a �rea de um quadrado, em seguida mostre 
		   o dobro desta �rea para o usu�rio.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor da base: ");
		double b = scanner.nextDouble();
		
		System.out.println("Informe o valor da altura: ");
		double h = scanner.nextDouble();
		
		double area = b * h;
		
		double areaFinal = area * 2;
		System.out.println("Valor final do dobro da �rea do quadrado �: " + areaFinal);
	}

}
