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
		
		switch(letra) {
		case "a": System.out.println("A letra " + letra + " � uma vogal."); break;
		case "A": System.out.println("A letra " + letra + " � uma vogal."); break;
		case "e": System.out.println("A letra " + letra + " � uma vogal."); break;
		case "E": System.out.println("A letra " + letra + " � uma vogal."); break;
		case "i": System.out.println("A letra " + letra + " � uma vogal."); break;
		case "I": System.out.println("A letra " + letra + " � uma vogal."); break;
		case "o": System.out.println("A letra " + letra + " � uma vogal."); break;
		case "O": System.out.println("A letra " + letra + " � uma vogal."); break;
		case "u": System.out.println("A letra " + letra + " � uma vogal."); break;
		case "U": System.out.println("A letra " + letra + " � uma vogal."); break;
		default: System.out.println("A letra " + letra + " � uma consoante."); break;
		}

	}

}
