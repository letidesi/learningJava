package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/*
		  Fa�a um programa que verifique se a letra digitada � "F" ou "M".
		  Conforme a letra escrever: F - feminino, M - masculino, sexo inv�lido.
		  
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe letra F para feminino ou letra M para masculino: ");
		String letraInformada = scanner.nextLine();
		
		switch(letraInformada) {
		case "F": System.out.println("Feminino."); break;
		case "M": System.out.println("Masculino."); break;
		default: System.out.println("Sexo inv�lido"); break;
		}
	}

}
