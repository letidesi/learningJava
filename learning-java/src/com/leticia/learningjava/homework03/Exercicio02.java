package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a
		 * senha igual ao nome do usu�rio, mostrando uma mensagem de erro e voltando a
		 * pedir as informa��es.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o nome de usu�rio que voc� deseja:");
		String nomeDoUsuario = scanner.nextLine();

		System.out.println("Informe a senha que voc� deseja:");
		String senhaDoUsuario = scanner.nextLine();

		boolean confirmar = nomeDoUsuario.equalsIgnoreCase(senhaDoUsuario);

		while (confirmar) {
			System.out.println("Nome de usu�rio e senha N�O podem ser iguais. \n");

			System.out.println("Informe o nome de usu�rio que voc� deseja:");
			String nomeDoUsuario2 = scanner.nextLine();

			System.out.println("Informe a senha que voc� deseja:");
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
