package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercício13 {

	public static void main(String[] args) {
		

		/* 
		   Faça um programa que pergunte quanto você ganha por hora e o número
		   de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
		   referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
		   8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
		   
		   - Salário Bruto.
		   - Quanto pagou ao INSS.
		   - O Salário Líquido.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe quanto você ganha por hora: ");
		double ganhaPorHora = scanner.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhas no mês: ");
		double quantidadeHorasTrabalhadas = scanner.nextDouble();

		double salarioBruto = ganhaPorHora * quantidadeHorasTrabalhadas;
		System.out.println("O total do seu salário no referido mês, no caso, o salário bruto é de: " + salarioBruto + " reais.");
		
		double pagoAoInss = salarioBruto * 0.08;
		System.out.println("Foi pago ao INSS um valor de: " + pagoAoInss);
		
		double impostoDeRenda = salarioBruto * 0.11;
		
		double pagoAoSindicato = salarioBruto * 0.05;
		
		double salarioDescontos = impostoDeRenda + pagoAoInss + pagoAoSindicato;
		
		double salarioLiquido = salarioBruto - salarioDescontos;
		System.out.println("O valor do seu salário líquido é de: " + salarioLiquido);

	}

}
