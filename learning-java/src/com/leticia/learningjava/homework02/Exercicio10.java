package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		/*
		   Fa�a um programa que pergunte em que turno voc� estuda. Pe�a para
		   digitar M - matutino ou V - vespertino ou N - noturno. Imprima a
		   mensagem "Bom dia!", "Boa tarde!"ou "Boa noite!" ou "Valor inv�lido!". 
		   Conforme o caso.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe em qual turno voc� estuda, M para Matutino"
				+ ", V para vespertino ou N para noturno:");
		
		String turno = scanner.next();
		
		switch(turno) {
		case "M": 
		case "m": System.out.println("Bom dia!"); break;
		case "V": 
		case "v": System.out.println("Boa tarde!"); break;
		case "N": 
		case "n": System.out.println("Boa noite!"); break;
		default: System.out.println("Valor inv�lido!"); break;
		}
	}

}
