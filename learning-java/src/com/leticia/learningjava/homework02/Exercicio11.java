package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		/*
		 * As organizações Tabajara resolveram dar um aumento de salário aos seus
		 * colaboradores e lhe contraram para desenvolver o programa que calculará os
		 * reajustes. Faça um programa que receba o salário de um colaborador e o
		 * reajuste segundo o seguinte critério, baseado no salário atual:
		 * 
		 * - Salários até R$ 280,00 (incluindo): aumento de 20% - Salários entre R$
		 * 280,00 e R$ 700,00: aumento de 15%; - Salários entre R$ 700,00 e R$ 1500,00:
		 * aumento de 10%; - Salários de R$ 1500,00 em diante: aumento de 5%.
		 * 
		 * Após o aumento realizado, informe na tela:
		 * 
		 * - O salário antes do reajuste. - O percentual de aumento aplicado. - O valor
		 * do aumento. - O novo salário, após o aumento.
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o salário do colaborador: ");
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

		System.out.println("O salário antes do reajuste é de: " + "R$ " + salario);
		System.out.println("O percentual de aumento aplicado é de: " + percentualAplicado + "%");
		System.out.println("O valor do aumento é de: " + "R$ " + valorAumento);
		System.out.println("O salário ajustado é de: " + "R$ " + salarioAjustado);
	}

}
