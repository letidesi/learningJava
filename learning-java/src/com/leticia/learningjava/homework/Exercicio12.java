package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		/* 
		 
		   Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo
		   que calcule seu peso ideal, usando a seguinte fórmula: (72.7 * altura) - 58
		   
	    */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		double altura = scanner.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		System.out.println("Seu peso ideal é: " + pesoIdeal);
		

	}

}
