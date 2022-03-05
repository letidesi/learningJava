package com.leticia.learningjava.aula17;

public class LoopFor {

	public static void main(String[] args) {

		for (int i = 0; i < 26; i++) {

			System.out.println("Valor de i: " + i);
		}

		System.out.println("\n");

		for (int i = 26; i >= 0; i--) {

			System.out.println("Valor de i: " + i);
		}

		System.out.println("\n");

		for (int i = 0, j = 28; i < j; i++, j--) {

			System.out.println("i = " + i + "; j = " + j);
		}

		System.out.println("\n");

		int i = 0;

		for (; i < 11;) {

			System.out.println("i = " + i);

			i += 2;
		}

		System.out.println("\n");

		for (int j = 0; j < 50; j += 5) {

			System.out.println("j: " + j);
		}

		System.out.println("\n");
		
		int soma = 0;
		for (int count = 1; count < 6; soma += count++) {

			System.out.println("O valor de i : " + count);
		}
		
			System.out.println("O valor da soma é: " + soma);
	}

}
