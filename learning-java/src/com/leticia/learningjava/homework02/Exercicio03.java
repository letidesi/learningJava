package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que verifique se a letra digitada é "F" ou "M". Conforme a
		 * letra escrever: F - feminino, M - masculino, sexo inválido.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe letra F para feminino ou letra M para masculino: ");
		String letraInformada = scanner.next();

		switch (letraInformada) {
		case "F":
			System.out.println("Feminino.");
			break;
		case "f":
			System.out.println("Feminino.");
			break;
		case "M":
			System.out.println("Masculino.");
			break;
		case "m":
			System.out.println("Masculino.");
			break;
		default:
			System.out.println("Sexo inválido");
			break;
		}

		/*
		 * Outra maneira de resolver:
		 * 
		 * if(letra.equalsIgnoreCase("f")) { 
		 * System.out.println("F - Feminino."); 
		 * } else if (letra.equalsIgnoreCase("m")) { 
		 * System.out.println("M - Masculino."); 
		 * } else { 
		 * 	System.out.println("Sexo inválido!"); 
		 * }
		 * 
		 */

	}

}
