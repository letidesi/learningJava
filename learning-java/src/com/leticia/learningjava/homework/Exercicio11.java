package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		/*
		     Fa�a um programa que pe�a 2 n�meros inteiros e um n�mero real.
		     Calcule e mostre:
		   
		     - O produto do dobro do primeiro com metade do segundo.
		     - A soma do triplo do primeiro com o terceiro.
		     - O terceiro elevado ao cubo.
		     
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero que seja inteiro: ");
		int primeiroNumero = scanner.nextInt();
		
		System.out.println("Informe o segundo n�mero que seja inteiro: ");
		int segundoNumero = scanner.nextInt();
		
		System.out.println("Informe o terceiro n�mero que seja real: ");
		double terceiroNumero = scanner.nextDouble();
		
		int dobroDoPrimeiroNumero = primeiroNumero * 2;
		int metadeDoSegundoNumero = segundoNumero / 2;
		
		int produto = dobroDoPrimeiroNumero * metadeDoSegundoNumero;
		System.out.println("O produto do dobro do primeiro com metade do segundo �: "
		+ produto);
		
		int triploDoPrimeiro = primeiroNumero * 3;
		double soma = triploDoPrimeiro + terceiroNumero;
		System.out.println("A soma do triplo do primeiro com o terceiro �: " + soma);
		
		double terceiroElevadoAoCubo = Math.pow(terceiroNumero, 3);
		System.out.println("O terceiro elevado ao cubo �: " + terceiroElevadoAoCubo);
		
		
	}

}
