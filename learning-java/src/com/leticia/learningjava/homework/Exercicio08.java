package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		/* 
		   Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero
		   de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no
		   referido m�s. 
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe quanto voc� ganha por hora: ");
		double ganhaPorHora = scanner.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhas no m�s: ");
		double quantidadeHorasTrabalhadas = scanner.nextDouble();
		
		double salario = ganhaPorHora * quantidadeHorasTrabalhadas;
		System.out.println("O total do seu sal�rio no referido m�s � de: " + salario + " reais.");
		
	}

}
