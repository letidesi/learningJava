package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		/*
		   Fa�a um programa que calcule a �rea de um quadrado, em seguida mostre 
		   o dobro desta �rea para o usu�rio.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor do lado do quadrado: ");
		double ladoDoQuadrado = scanner.nextDouble();
		
		double areaDoQuadrado = Math.pow(ladoDoQuadrado, 2);
		
		double dobroAreaDoQuadrado = areaDoQuadrado * 2;
		
		System.out.println("A �rea do quadrado �: " + areaDoQuadrado);
		System.out.println("O dobro da �rea do quadrado �: " + dobroAreaDoQuadrado);
		
	}

}
