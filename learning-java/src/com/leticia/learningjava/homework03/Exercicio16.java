package com.leticia.learningjava.homework03;

public class Exercicio16 {

	public static void main(String[] args) {

		/*
		 * A s�rie de Fibonacci � formada pela seq��ncia 0,1,1,2,3,5,8,13,21,34,55,...
		 * Fa�a um programa que gere a s�rie at� que o valor seja maior que 500.
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
