package com.leticia.learningjava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um dia da semana [1-7]: ");
		int diaDaSemana = scanner.nextInt();
		
		switch(diaDaSemana) {
		case 1: System.out.println("Domingo."); break;
		case 2: System.out.println("Segunda-feira."); break;
		case 3: System.out.println("Ter�a-feira."); break;
		case 4: System.out.println("Quarta-feira."); break;
		case 5: System.out.println("Quinta-feira."); break;
		case 6: System.out.println("Sexta-feira."); break;
		case 7: System.out.println("S�bado."); break;
		default: System.out.println("N�o � um dia da semana v�lido.");
		}
		
		switch(diaDaSemana) {
		
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia �til."); break;
		case 1: 
		case 7: System.out.println("Fim de semana."); break;
		default: System.out.println("N�o � um dia da semana v�lido.");
		}
		
		/*
		 
		 Exemplo com o IF/ELSE:
		 
		if(diaDaSemana == 1) {
			System.out.println("Domingo.");
		} else if (diaDaSemana == 2) {
			System.out.println("Segunda-feira.");
		} else if (diaDaSemana == 3) {
			System.out.println("Ter�a-feira.");
		} else if (diaDaSemana == 4) {
			System.out.println("Quarta-feira.");
		} else if (diaDaSemana == 5) {
			System.out.println("Quinta-feira.");
		} else if (diaDaSemana == 6) {
			System.out.println("Sexta-feira.");
		} else if (diaDaSemana == 7) {
			System.out.println("S�bado.");
		} else {
			System.out.println("N�o � um dia da semana v�lido.");
		}
		
		*/
	}

}
