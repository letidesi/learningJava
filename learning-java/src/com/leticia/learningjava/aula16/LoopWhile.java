package com.leticia.learningjava.aula16;

public class LoopWhile {

	public static void main(String[] args) {

		int i = 0;
		int max = 15;

		System.out.println("Contando até " + max);

		while (i <= max) {
			System.out.println("Valor de i: " + i);
			i++;
		}
		System.out.println(i);

		do {
			i++;
			System.out.println("Valor de i: " + i);
		} while (i < 20);
		System.out.println(i);

	}

}
