package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exerc�cio13 {

	public static void main(String[] args) {
		

		/* 
		   Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero
		   de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no
		   referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda,
		   8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:
		   
		   - Sal�rio Bruto.
		   - Quanto pagou ao INSS.
		   - O Sal�rio L�quido.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe quanto voc� ganha por hora: ");
		double ganhaPorHora = scanner.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhas no m�s: ");
		double quantidadeHorasTrabalhadas = scanner.nextDouble();

		double salarioBruto = ganhaPorHora * quantidadeHorasTrabalhadas;
		System.out.println("O total do seu sal�rio no referido m�s, no caso, o sal�rio bruto � de: " + salarioBruto + " reais.");
		
		double pagoAoInss = salarioBruto * 0.08;
		System.out.println("Foi pago ao INSS um valor de: " + pagoAoInss);
		
		double impostoDeRenda = salarioBruto * 0.11;
		
		double pagoAoSindicato = salarioBruto * 0.05;
		
		double salarioDescontos = impostoDeRenda + pagoAoInss + pagoAoSindicato;
		
		double salarioLiquido = salarioBruto - salarioDescontos;
		System.out.println("O valor do seu sal�rio l�quido � de: " + salarioLiquido);

	}

}
