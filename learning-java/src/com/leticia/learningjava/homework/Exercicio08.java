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
		
		System.out.println("Informe o n�mero de horas trabalhas: ");
		double numeroHorasTrabalhadas = scanner.nextDouble();
		
		double totalSalario = ganhaPorHora * numeroHorasTrabalhadas;
		System.out.println("Seu sal�rio no referido m�s � de: " + totalSalario + " reais.");
	}

}
