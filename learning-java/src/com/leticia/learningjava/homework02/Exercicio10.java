package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		/*
		   Faça um programa que pergunte em que turno você estuda. Peça para
		   digitar M - matutino ou V - vespertino ou N - noturno. Imprima a
		   mensagem "Bom dia!", "Boa tarde!"ou "Boa noite!" ou "Valor inválido!". 
		   Conforme o caso.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe em qual turno você estuda, M para Matutino"
				+ ", V para vespertino ou N para noturno:");
		
		String turno = scanner.next();
		
		switch(turno) {
		case "M": 
		case "m": System.out.println("Bom dia!"); break;
		case "V": 
		case "v": System.out.println("Boa tarde!"); break;
		case "N": 
		case "n": System.out.println("Boa noite!"); break;
		default: System.out.println("Valor inválido!"); break;
		}
	}

}
