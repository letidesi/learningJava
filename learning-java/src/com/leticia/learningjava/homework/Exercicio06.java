package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		/* Fa�a um programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea. */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o raio do c�rculo: ");
		double raio = scanner.nextDouble();
		double potenciaR = raio * raio;
		double areaCirculo = 3.14 * potenciaR;
		
		System.out.println("�rea do C�rculo: " +areaCirculo);
		

	}

}
