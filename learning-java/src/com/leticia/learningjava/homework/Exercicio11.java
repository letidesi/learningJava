package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		/*
		     Faça um programa que peça 2 números inteiros e um número real.
		     Calcule e mostre:
		   
		     - O produto do dobro do primeiro com metade do segundo.
		     - A soma do triplo do primeiro com o terceiro.
		     - O terceiro elevado ao cubo.
		     
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número que seja inteiro: ");
		int primeiroNumero = scanner.nextInt();
		
		System.out.println("Informe o segundo número que seja inteiro: ");
		int segundoNumero = scanner.nextInt();
		
		System.out.println("Informe o terceiro número que seja real: ");
		double terceiroNumero = scanner.nextDouble();
		
		int dobroDoPrimeiroNumero = primeiroNumero * 2;
		int metadeDoSegundoNumero = segundoNumero / 2;
		
		int produto = dobroDoPrimeiroNumero * metadeDoSegundoNumero;
		System.out.println("O produto do dobro do primeiro com metade do segundo é: "
		+ produto);
		
		int triploDoPrimeiro = primeiroNumero * 3;
		double soma = triploDoPrimeiro + terceiroNumero;
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + soma);
		
		double terceiroElevadoAoCubo = Math.pow(terceiroNumero, 3);
		System.out.println("O terceiro elevado ao cubo é: " + terceiroElevadoAoCubo);
		
		
	}

}
