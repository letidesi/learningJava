package com.leticia.learningjava.homework03;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo do
		 * outro. Depois modifique o programa para que ele mostre os n�meros um ao lado
		 * do outro.
		 */
		
		for(int i = 1; i < 21; i++) {
		
			System.out.print(i + " " + "\n");
		}
		
		System.out.println("\n");
		
		for(int j = 1; j < 21; j++) {
			
			System.out.print(j + " ");
		}
		
		
	}

}
