package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto
		 * voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o pre�o do primeiro produto: ");
		double primeiroPreco = scanner.nextDouble();

		System.out.println("Informe o pre�o do segundo produto: ");
		double segundoPreco = scanner.nextDouble();

		System.out.println("Informe o pre�o do terceiro produto: ");
		double terceiroPreco = scanner.nextDouble();

		if (primeiroPreco <= segundoPreco && primeiroPreco <= terceiroPreco) {
			System.out.println("Compre o primeiro produto com o valor de: " + primeiroPreco);
		} else if (segundoPreco <= primeiroPreco && segundoPreco <= terceiroPreco) {
			System.out.println("Compre o segundo produto com o valor de: " + segundoPreco);
		} else if (terceiroPreco <= primeiroPreco && terceiroPreco <= segundoPreco) {
			System.out.println("Compre o terceiro produto com o valor de: " + terceiroPreco);
		}

	}

}
