package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio0301 {

	public static void main(String[] args) {
		
		/*
		  Fa�a um programa que verifique se a letra digitada � "F" ou "M".
		  Conforme a letra escrever: F - feminino, M - masculino, sexo inv�lido.
		  
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe letra F- feminino ou letra M- masculino: ");
		String letra = scanner.next();
		
		if(letra.equalsIgnoreCase("f")) {
			System.out.println("F - Feminino.");
		} else if (letra.equalsIgnoreCase("m")) {
			System.out.println("M - Masculino.");
		} else {
			System.out.println("Sexo inv�lido!");
		}

	}

}
