package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		/*
		   Faça um programa que calcule a área de um quadrado, em seguida mostre 
		   o dobro desta àrea para o usuário.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor do lado do quadrado: ");
		double ladoDoQuadrado = scanner.nextDouble();
		
		double areaDoQuadrado = Math.pow(ladoDoQuadrado, 2);
		
		double dobroAreaDoQuadrado = areaDoQuadrado * 2;
		
		System.out.println("A área do quadrado é: " + areaDoQuadrado);
		System.out.println("O dobro da área do quadrado é: " + dobroAreaDoQuadrado);
		
	}

}
