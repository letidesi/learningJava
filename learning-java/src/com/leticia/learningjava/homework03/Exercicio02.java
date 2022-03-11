package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a
		 * senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a
		 * pedir as informações.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o nome de usuário que você deseja:");
		String nomeDoUsuario = scanner.nextLine();

		System.out.println("Informe a senha que você deseja:");
		String senhaDoUsuario = scanner.nextLine();

		boolean confirmar = nomeDoUsuario.equalsIgnoreCase(senhaDoUsuario);

		while (confirmar) {
			System.out.println("Nome de usuário e senha NÃO podem ser iguais. \n");

			System.out.println("Informe o nome de usuário que você deseja:");
			String nomeDoUsuario2 = scanner.nextLine();

			System.out.println("Informe a senha que você deseja:");
			String senhaDoUsuario2 = scanner.nextLine();

			boolean confirmar2 = nomeDoUsuario2.equalsIgnoreCase(senhaDoUsuario2);

			if (confirmar2) {
				continue;

			} else {
				System.out.println("Cadastro realizado com sucesso!");
				break;
			}
		}
	}

}
