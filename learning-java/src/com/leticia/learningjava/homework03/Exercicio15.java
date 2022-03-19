package com.leticia.learningjava.homework03;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		/*
		 * A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
		 * Faça um programa capaz de gerar a série até o n−ésimo termo.
		 */

		int x = 1;
		int y = 0;
		int aux;

		for (int i = 0;; i++) {

			System.out.println(x);
			aux = x;
			x += y;
			y = aux;

		}

	}

}
