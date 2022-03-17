package com.leticia.learningjava.homework03;

public class Exercicio04 {

	public static void main(String[] args) {

		/*
		 * Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes com
		 * uma taxa anual de crescimento de 3% e que a popula��o de B seja 200000
		 * habitantes com uma taxa de crescimento de 1.5%. Fa�a um programa que calcule
		 * e escreva o n�mero de anos necess�rios para que a popula��o do pa�s A
		 * ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento.
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

		System.out.println("Pa�s A: " + A + "% \nPa�s B: " + B + "% \nO n�meros de anos necess�rios para a populu��o"
				+ " A ultrapassar ou igualar a popula��o B � de " + anos + " anos.");
	}

}
