package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		/*
		 * Faça um programa que leia três números e mostre em ordem decrescente.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		double primeiroNumero = scanner.nextDouble();

		System.out.println("Informe o segundo número: ");
		double segundoNumero = scanner.nextDouble();

		System.out.println("Informe o terceiro número: ");
		double terceiroNumero = scanner.nextDouble();

		if (primeiroNumero <= segundoNumero && primeiroNumero <= terceiroNumero && segundoNumero <= terceiroNumero) {
			System.out.println("Ordem decrescente: " + terceiroNumero + " , " + segundoNumero + " , " + primeiroNumero);
		} else if (primeiroNumero <= segundoNumero && primeiroNumero <= terceiroNumero
				&& terceiroNumero <= segundoNumero) {
			System.out.println("Ordem decrescente: " + segundoNumero + " , " + terceiroNumero + " , " + primeiroNumero);
		} else if (segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero
				&& primeiroNumero <= terceiroNumero) {
			System.out.println("Ordem decrescente: " + terceiroNumero + " , " + primeiroNumero + " , " + segundoNumero);
		} else if (segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero
				&& terceiroNumero <= primeiroNumero) {
			System.out.println("Ordem decrescente: " + primeiroNumero + " , " + terceiroNumero + " , " + segundoNumero);
		} else if (terceiroNumero <= primeiroNumero && terceiroNumero <= segundoNumero
				&& primeiroNumero <= segundoNumero) {
			System.out.println("Ordem decrescente: " + segundoNumero + " , " + primeiroNumero + " , " + terceiroNumero);
		} else if (terceiroNumero <= primeiroNumero && terceiroNumero <= segundoNumero
				&& segundoNumero <= primeiroNumero) {
			System.out.println("Ordem decrescente: " + primeiroNumero + " , " + segundoNumero + " , " + terceiroNumero);
		}

	}

}
