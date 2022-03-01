package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa para a leitura de duas notas parciais de um aluno. O
		 * programa deve calcular a m�dia alcan�ada por aluno e apresentar:
		 * 
		 * - A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete. - A
		 * mensagem "Reprovado", se a m�dia for menor do que sete. - A mensagem
		 * "Aprovado com Distin��o", se a m�dia for igual a dez.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double primeiraNota = scanner.nextDouble();

		System.out.println("Informe a segunda nota: ");
		double segundaNota = scanner.nextDouble();

		double media = (primeiraNota + segundaNota) / 2;

		if (media == 10) {
			System.out.println("Aprovado com Distin��o.");
		} else if (media >= 7) {
			System.out.println("Aprovado.");
		} else {
			System.out.println("Reprovado.");
		}
	}

}
