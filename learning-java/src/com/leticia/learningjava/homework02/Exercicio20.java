package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As
		 * perguntas são: - "Telefonou para a vítima?" - "Esteve no local do crime?" -
		 * "Mora perto da vítima?" - "Devia para a vítima?" -
		 * "Já trabalhou com a vítima?" O programa deve no final emitir uma
		 * classificação sobre a participação da pessoa no crime. Se a pessoa responder
		 * positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3
		 * e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será
		 * classificado como "Inocente".
		 * 
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Telefonou para a vítima? \n [1] - sim \n [2] - não");
		int telefonou = scanner.nextInt();

		System.out.println("Esteve no local do crime? \n [1] - sim \n [2] - não");
		int local = scanner.nextInt();

		System.out.println("Mora perto da vítima? \n [1] - sim \n [2] - não");
		int mora = scanner.nextInt();

		System.out.println("Devia para a vítima? \n [1] - sim \n [2] - não");
		int devia = scanner.nextInt();

		System.out.println("Já trabalhou com a vítima? \n [1] - sim \n [2] - não");
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
			System.out.println("Valor inválido para 'Telefonou para vítima'!");
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
			System.out.println("Valor inválido para 'Esteve no local do crime'!");
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
			System.out.println("Valor inválido para 'Mora perto da vítima'!");
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
			System.out.println("Valor inválido para 'Devia para vítima'!");
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
			System.out.println("Valor inválido 'Trabalhou com a vítima'!");
			valido = false;
			break;
		}

		if (valido) {

			if (count == 2) {
				System.out.println("Suspeita.");
			} else if (count == 3 || count == 4) {
				System.out.println("Cúmplice.");
			} else if (count == 5) {
				System.out.println("Assasino.");
			} else {
				System.out.println("Inocente.");
			}
		}

	}
}
