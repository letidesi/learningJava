package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que leia e valide as seguintes informa��es: Nome: maior que
		 * 3 caracteres; Idade: entre 0 e 150; Sal�rio: maior que zero; Sexo: 'f' ou
		 * 'm'; Estado Civil: 's', 'c', 'v', 'd';
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe seu nome:");
		String nome = scanner.nextLine();

		System.out.println("Informe seu g�nero: \n [m] - Masculino \n [f] - Feminino");
		String genero = scanner.nextLine();

		System.out.println("Informe seu estado civil: \n [s] - Solteira (o) \n [c] - Casada (o)"
				+ "\n [v] - Vi�va (o) \n [d] - Divorciada (o)");
		String estadoCivil = scanner.nextLine();

		System.out.println("Informe sua idade:");
		int idade = scanner.nextInt();

		System.out.println("Informe seu sal�rio:");
		double salario = scanner.nextDouble();

		boolean validarNome = nome.length() >= 3;
		boolean validarIdade = idade >= 0 && idade <= 150;
		boolean validarSalario = salario > 0;

		if (validarNome) {
			System.out.println("\n");
			System.out.println("Seu nome: " + nome + ".");
		} else {
			System.out.println("\n");

			System.out.println("Nome inv�lido.");

			System.out.println("\n");

			while (validarNome == false) {

				System.out.println("Informe seu nome:");
				String nome2 = scanner.nextLine();

				boolean validarNome2 = nome2.length() >= 3;

				if (validarNome2) {
					System.out.println("Seu nome: " + nome2 + ".");
					break;
				} else {
					continue;
				}
			}

		}

		if (validarIdade) {
			System.out.println("Idade: " + idade + " anos.");
		} else {

			System.out.println("\n");

			System.out.println("Idade inv�lida.");

			System.out.println("\n");

			while (validarIdade == false) {

				System.out.println("Informe sua idade:");
				int idade2 = scanner.nextInt();

				boolean validarIdade2 = idade2 >= 0 && idade2 <= 150;

				if (validarIdade2) {
					System.out.println("Idade: " + idade2 + " anos.");
					break;
				} else {
					continue;
				}
			}
		}

		if (validarSalario) {
			System.out.println("Sal�rio: " + salario + ".");
		} else {
			System.out.println("\n");

			System.out.println("Sal�rio inv�lido.");

			System.out.println("\n");

			while (validarSalario == false) {

				System.out.println("Informe seu sal�rio:");
				double salario2 = scanner.nextDouble();

				boolean validarSalario2 = salario2 > 0;

				if (validarSalario2) {
					System.out.println("Sal�rio: " + salario2 + ".");
					break;
				} else {
					continue;
				}
			}
		}

		if (genero.equalsIgnoreCase("f")) {
			System.out.println("Seu g�nero: " + "Feminino.");

		} else if (genero.equalsIgnoreCase("m")) {
			System.out.println("Seu g�nero: " + "Masculino.");

		} else {
			while (genero != "m" || genero != "f") {

				System.out.println("Informe seu g�nero: \n [m] - Masculino \n [f] - Feminino");
				String genero2 = scanner.nextLine();

				if (genero2.equalsIgnoreCase("f")) {
					System.out.println("Seu g�nero: " + "Feminino.");
					break;
				} else if (genero2.equalsIgnoreCase("m")) {
					System.out.println("Seu g�nero: " + "Masculino.");
					break;
				} else {
					continue;
				}
			}
		}

		if (estadoCivil.equalsIgnoreCase("s")) {
			System.out.println("Estado Civil: " + "Solteira (o).");

		} else if (estadoCivil.equalsIgnoreCase("c")) {
			System.out.println("Estado Civil: " + "Casada (o).");

		} else if (estadoCivil.equalsIgnoreCase("v")) {
			System.out.println("Estado Civil: " + "Vi�va (o).");

		} else if (estadoCivil.equalsIgnoreCase("d")) {
			System.out.println("Estado Civil: " + "Divorciada (o).");

		} else {
			while (estadoCivil != "s" || estadoCivil != "c" || estadoCivil != "v" || estadoCivil != "d") {

				System.out.println("Informe seu estado civil: \n [s] - Solteira (o) \n [c] - Casada (o)"
						+ "\n [v] - Vi�va (o) \n [d] - Divorciada (o)");
				String estadoCivil2 = scanner.nextLine();

				if (estadoCivil2.equalsIgnoreCase("s")) {
					System.out.println("Estado Civil: " + "Solteira (o).");
					break;
				} else if (estadoCivil2.equalsIgnoreCase("c")) {
					System.out.println("Estado Civil: " + "Casada (o).");
					break;
				} else if (estadoCivil2.equalsIgnoreCase("v")) {
					System.out.println("Estado Civil: " + "Vi�va (o).");
					break;
				} else if (estadoCivil2.equalsIgnoreCase("d")) {
					System.out.println("Estado Civil: " + "Divorciada (o).");
					break;
				} else {
					continue;
				}
			}
		}

	}

}
