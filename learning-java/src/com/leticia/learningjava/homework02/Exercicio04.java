package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		/*
		   Fa�a um programa que verifique se uma letra digitada � vogal ou consoante.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe uma letra: ");
		String letra = scanner.next();
		
		if(letra.length() > 1) {
			System.out.println("N�o � uma letra v�lida.");
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
				case "U": System.out.println("A letra '" + letra + "' � uma vogal."); break;
				default: System.out.println("A letra '" + letra + "' � uma consoante."); break;
				}
		}
		
	

	}

}
