package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As
		 * perguntas s�o: - "Telefonou para a v�tima?" - "Esteve no local do crime?" -
		 * "Mora perto da v�tima?" - "Devia para a v�tima?" -
		 * "J� trabalhou com a v�tima?" O programa deve no final emitir uma
		 * classifica��o sobre a participa��o da pessoa no crime. Se a pessoa responder
		 * positivamente a 2 quest�es ela deve ser classificada como "Suspeita", entre 3
		 * e 4 como "C�mplice" e 5 como "Assassino". Caso contr�rio, ele ser�
		 * classificado como "Inocente".
		 * 
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Telefonou para a v�tima? \n [1] - sim \n [2] - n�o");
		int telefonou = scanner.nextInt();

		System.out.println("Esteve no local do crime? \n [1] - sim \n [2] - n�o");
		int local = scanner.nextInt();

		System.out.println("Mora perto da v�tima? \n [1] - sim \n [2] - n�o");
		int mora = scanner.nextInt();

		System.out.println("Devia para a v�tima? \n [1] - sim \n [2] - n�o");
		int devia = scanner.nextInt();

		System.out.println("J� trabalhou com a v�tima? \n [1] - sim \n [2] - n�o");
		int trabalhou = scanner.nextInt();

		boolean valido = true;

		int count = 0;
		int count2 = 0;

		switch (telefonou) {
		case 1:
			count = 1;
			break;
		case 2:
			count2 = 1;
			break;
		default:
			System.out.println("Valor inv�lido para 'Telefonou para v�tima'!");
			valido = false;
			break;
		}

		switch (local) {
		case 1:
			count = count + 1;
			break;
		case 2:
			count2 = count2 + 1;
			break;
		default:
			System.out.println("Valor inv�lido para 'Esteve no local do crime'!");
			valido = false;
			break;
		}

		switch (mora) {
		case 1:
			count = count + 1;
			break;
		case 2:
			count2 = count2 + 1;
			break;
		default:
			System.out.println("Valor inv�lido para 'Mora perto da v�tima'!");
			valido = false;
			break;
		}
		switch (devia) {
		case 1:
			count = count + 1;
			break;
		case 2:
			count2 = count2 + 1;
			break;
		default:
			System.out.println("Valor inv�lido para 'Devia para v�tima'!");
			valido = false;
			break;
		}
		switch (trabalhou) {
		case 1:
			count = count + 1;
			break;
		case 2:
			count2 = count2 + 1;
			break;
		default:
			System.out.println("Valor inv�lido 'Trabalhou com a v�tima'!");
			valido = false;
			break;
		}

		if (valido) {

			if (count == 2) {
				System.out.println("Suspeita.");
			} else if (count == 3 || count == 4) {
				System.out.println("C�mplice.");
			} else if (count == 5) {
				System.out.println("Assasino.");
			} else {
				System.out.println("Inocente.");
			}
		}

	}
}
