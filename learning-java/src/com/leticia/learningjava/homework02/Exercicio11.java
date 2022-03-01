package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		/*
		 * As organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus
		 * colaboradores e lhe contraram para desenvolver o programa que calcular� os
		 * reajustes. Fa�a um programa que receba o sal�rio de um colaborador e o
		 * reajuste segundo o seguinte crit�rio, baseado no sal�rio atual:
		 * 
		 * - Sal�rios at� R$ 280,00 (incluindo): aumento de 20% - Sal�rios entre R$
		 * 280,00 e R$ 700,00: aumento de 15%; - Sal�rios entre R$ 700,00 e R$ 1500,00:
		 * aumento de 10%; - Sal�rios de R$ 1500,00 em diante: aumento de 5%.
		 * 
		 * Ap�s o aumento realizado, informe na tela:
		 * 
		 * - O sal�rio antes do reajuste. - O percentual de aumento aplicado. - O valor
		 * do aumento. - O novo sal�rio, ap�s o aumento.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o sal�rio do colaborador: ");
		double salario = scanner.nextDouble();

		int percentualAplicado = 0;

		if (salario <= 280) {
			percentualAplicado = 20;
		} else if (salario > 280 && salario <= 700) {
			percentualAplicado = 15;
		} else if (salario > 700 && salario <= 1500) {
			percentualAplicado = 10;
		} else if (salario > 1500) {
			percentualAplicado = 5;
		}

		double valorAumento = (salario / 100) * percentualAplicado;
		double salarioAjustado = salario + valorAumento;

		System.out.println("O sal�rio antes do reajuste � de: " + "R$ " + salario);
		System.out.println("O percentual de aumento aplicado � de: " + percentualAplicado + "%");
		System.out.println("O valor do aumento � de: " + "R$ " + valorAumento);
		System.out.println("O sal�rio ajustado � de: " + "R$ " + salarioAjustado);
	}

}
