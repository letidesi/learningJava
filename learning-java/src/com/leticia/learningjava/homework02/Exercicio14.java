package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que lê as duas notas parcias obtidas por um aluno numa
		 * disciplina ao longo de um semestre, e calcule sua média.
		 * 
		 * - Média de Aproveitamento Conceito
		 * 
		 * Entre 9.0 e 10.0 A Entre 7.5 e 9.0 B Entre 6.0 e 7.5 C Entre 4.0 e 6.0 D
		 * Entre 4.0 e zero E
		 * 
		 * O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente
		 * e a mensagem "APROVADO" se o conceito for A, B ou C ou "REPROVADO" se o
		 * conceito for D ou E.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double primeiraNota = scanner.nextDouble();

		System.out.println("Informe a segunda nota: ");
		double segundaNota = scanner.nextDouble();

		double mediaDoAluno = (primeiraNota + segundaNota) / 2;

		String aproveitamentoDoAluno = "";

		if (mediaDoAluno >= 9.0 && mediaDoAluno <= 10) {
			aproveitamentoDoAluno = "A";

		} else if (mediaDoAluno >= 7.5 && mediaDoAluno < 9.0) {
			aproveitamentoDoAluno = "B";

		} else if (mediaDoAluno >= 6.0 && mediaDoAluno < 7.6) {
			aproveitamentoDoAluno = "C";

		} else if (mediaDoAluno >= 4.0 && mediaDoAluno < 6.0) {
			aproveitamentoDoAluno = "D";

		} else if (mediaDoAluno >= 0 && mediaDoAluno < 4) {
			aproveitamentoDoAluno = "E";

		} else if (mediaDoAluno < 0) {
			aproveitamentoDoAluno = "E";

		}

		System.out.println("Sua primeira nota: " + primeiraNota + " & " + "sua segunda nota: " + segundaNota + "\n"
				+ "Sua média: " + mediaDoAluno + "\n" + "Seu conceito: " + aproveitamentoDoAluno);

		switch (aproveitamentoDoAluno) {
		case "A":
		case "B":
		case "C":
			System.out.println("APROVADO.");
			break;
		case "D":
		case "E":
			System.out.println("REPROVADO.");
			break;
		}
	}

}
