package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		/*
		   Faça um programa que peça um valor e mostre na tela 
		   se o valor é positivo ou negativo.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		double numero = scanner.nextDouble();
		
		if(numero < 0) {
			System.out.println("O número informado foi: '" + numero + "'. É negativo!");
		} else {
			System.out.println("O número informado foi: '" + numero + "'. É positivo!");
		}

	}

}
