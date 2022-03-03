package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		/*
		 * F�a um programa que leia 2 n�meros e em seguida pergunte ao usu�rio qual
		 * opera��o ele deseja realizar.O resultado da opera��o deve ser acompanhado de
		 * uma frase que diga se o n�mero �:
		 * 
		 * - Par ou �mpar; - Positivo ou Negativo.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro n�mero: ");
		double primeiroNumero = scanner.nextDouble();

		System.out.println("Informe o segundo n�mero: ");
		double segundoNumero = scanner.nextDouble();

		System.out.println("Qual opera��o voc� deseja realizar: \n"
				+ " [+] - Soma \n [-] - Subtra��o  \n [/] - Divis�o \n " + "[*] - Multiplica��o");

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
			System.out.println("Opera��o inv�lida.");
			valida = false;
		}

		if (valida) {

			if (resultado % 2 == 0) {
				System.out.println("O n�mero " + resultado + " � par.");
			} else {
				System.out.println("O n�mero " + resultado + " � �mpar.");
			}

			if (resultado >= 0) {
				System.out.println("O n�mero " + resultado + " � positvo.");
			} else {
				System.out.println("O n�mero " + resultado + " � negativo.");
			}
		}

	}

}
