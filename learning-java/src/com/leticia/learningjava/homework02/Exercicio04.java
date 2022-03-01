package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		/*
		   Faça um programa que verifique se uma letra digitada é vogal ou consoante.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe uma letra: ");
		String letra = scanner.next();
		
		if(letra.length() > 1) {
			System.out.println("Não é uma letra válida.");
		} else {
				switch(letra) {
				case "a": 
				case "A": 
				case "e": 
				case "E": 
				case "i": 
				case "I": 
				case "o": 
				case "O": 
				case "u": 
				case "U": System.out.println("A letra '" + letra + "' é uma vogal."); break;
				default: System.out.println("A letra '" + letra + "' é uma consoante."); break;
				}
		}
		
	

	}

}
