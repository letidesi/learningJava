package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que imprima na tela apenas os n�meros �mpares entre 1 e 50.
		 */

		for (int i = 0; i < 51; i++) {

			if (i % 2 == 1) {
				System.out.println(i);
			}

		}
	}

}
