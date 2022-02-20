package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		/* 
		   Faça um programa que pergunte quanto você ganha por hora e o número
		   de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
		   referido mês. 
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe quanto você ganha por hora: ");
		double ganhaPorHora = scanner.nextDouble();
		
		System.out.println("Informe o número de horas trabalhas: ");
		double numeroHorasTrabalhadas = scanner.nextDouble();
		
		double totalSalario = ganhaPorHora * numeroHorasTrabalhadas;
		System.out.println("Seu salário no referido mês é de: " + totalSalario + " reais.");
	}

}
