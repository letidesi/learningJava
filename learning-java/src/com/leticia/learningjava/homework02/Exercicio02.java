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
		double valor = scanner.nextDouble();
		
		if(valor < 0) {
			System.out.println("O número informado: " + valor + ". É negativo.");
		} else {
			System.out.println("O número informado " + valor + ". É positivo.");
		}

	}

}
