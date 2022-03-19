package com.leticia.learningjava.homework03;

public class Exercicio16 {

	public static void main(String[] args) {

		/*
		 * A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,...
		 * Faça um programa que gere a série até que o valor seja maior que 500.
		 */

		int x = 1;
		int y = 0;
		int aux;

		for (int i = 0; i < 20; i++) {

			System.out.println(x);
			aux = x;
			x += y;
			y = aux;

		}

	}

}
