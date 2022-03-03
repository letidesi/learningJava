package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		/*
		 * Fça um programa que leia 2 números e em seguida pergunte ao usuário qual
		 * operação ele deseja realizar.O resultado da operação deve ser acompanhado de
		 * uma frase que diga se o número é:
		 * 
		 * - Par ou Ímpar; - Positivo ou Negativo.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		double primeiroNumero = scanner.nextDouble();

		System.out.println("Informe o segundo número: ");
		double segundoNumero = scanner.nextDouble();

		System.out.println("Qual operação você deseja realizar: \n"
				+ " [+] - Soma \n [-] - Subtração  \n [/] - Divisão \n " + "[*] - Multiplicação");

		String realizarOperacao = scanner.next();

		double resultado = 0;
		boolean valida = true;

		switch (realizarOperacao) {
		case "+":
			resultado = primeiroNumero + segundoNumero;
			break;
		case "-":
			resultado = primeiroNumero - segundoNumero;
			break;
		case "/":
			resultado = primeiroNumero / segundoNumero;
			break;
		case "*":
			resultado = primeiroNumero * segundoNumero;
			break;
		default:
			System.out.println("Operação inválida.");
			valida = false;
		}

		if (valida) {

			if (resultado % 2 == 0) {
				System.out.println("O número " + resultado + " é par.");
			} else {
				System.out.println("O número " + resultado + " é ímpar.");
			}

			if (resultado >= 0) {
				System.out.println("O número " + resultado + " é positvo.");
			} else {
				System.out.println("O número " + resultado + " é negativo.");
			}
		}

	}

}
