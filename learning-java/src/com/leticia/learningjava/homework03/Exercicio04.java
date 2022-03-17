package com.leticia.learningjava.homework03;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Supondo que a população de um país A seja da ordem de 80000 habitantes com
		 * uma taxa anual de crescimento de 3% e que a população de B seja 200000
		 * habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
		 * e escreva o número de anos necessários para que a população do país A
		 * ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
		 */

		double A = 80000;
		double taxaAnualA = 0.03;
		double B = 200000;
		double taxaAnualB = 0.015;

		double anos = 0;

		for (int i = 0; A <= B; i++) {
			A += A * taxaAnualA;
			B += B * taxaAnualB;
			anos += 1;
		}

		System.out.println("País A: " + A + "% \nPaís B: " + B + "% \nO números de anos necessários para a populução"
				+ " A ultrapassar ou igualar a população B é de " + anos + " anos.");
	}

}
