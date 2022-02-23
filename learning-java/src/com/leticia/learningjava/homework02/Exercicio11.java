package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		/*
		   As organiza��es Tabajara resolveram dar um aumento de sal�rio aos
		   seus colaboradores e lhe contraram para desenvolver o programa que
		   calcular� os reajustes.
		   Fa�a um programa que receba o sal�rio de um colaborador e o reajuste
		   segundo o seguinte crit�rio, baseado no sal�rio atual:
		   
		   - Sal�rios at� R$ 280,00 (incluindo): aumento de 20%
		   - Sal�rios entre R$ 280,00 e R$ 700,00: aumento de 15%;
		   - Sal�rios entre R$ 700,00 e R$ 1500,00: aumento de 10%;
		   - Sal�rios de R$ 1500,00 em diante: aumento de 5%. 
		   
		   Ap�s o aumento realizado, informe na tela:
		   
		   - O sal�rio antes do reajuste.
		   - O percentual de aumento aplicado.
		   - O valor do aumento.
		   - O novo sal�rio, ap�s o aumento.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o sal�rio do colaborador: ");
		double salario = scanner.nextDouble();
		
		double vintePorcento = 1.20;
		double quinzePorcento = 1.15;
		double dezPorcento = 1.10;
		double cincoPorcento = 1.05;
		
		double aumentoAplicado20 = salario * vintePorcento;
		double aumentoAplicado15 = salario * quinzePorcento;
		double aumentoAplicado10 = salario * dezPorcento;
		double aumentoAplicado05 = salario * cincoPorcento;
		
		double valorAumento20 = aumentoAplicado20 - salario;
		double valorAumento15 = aumentoAplicado15 - salario;
		double valorAumento10 = aumentoAplicado10 - salario;
		double valorAumento05 = aumentoAplicado05 - salario;
		
		
		System.out.println("O sal�rio antes do reajuste � igual " + salario + " reais.");
		
		if(salario == 280) {
			System.out.println("O valor do porcentual aplicado � de: " + vintePorcento);
			System.out.println("O valor do aumento � de: " + valorAumento20);
			System.out.println("O novo sal�rio � igual a " + aumentoAplicado20 + " reais. \n");
		} else if (salario > 280 && salario <= 700) {
			System.out.println("O valor do porcentual aplicado � de: " + quinzePorcento);
			System.out.println("O valor do aumento � de: " + valorAumento15);
			System.out.println("O novo sal�rio � igual a " + aumentoAplicado15 + " reais.");
		} else if (salario > 700 && salario <= 1500) {
			System.out.println("O valor do porcentual aplicado � de: " + dezPorcento);
			System.out.println("O valor do aumento � de: " + valorAumento10);
			System.out.println("O novo sal�rio � igual a " + aumentoAplicado10 + " reais.");
		}else if (salario > 1500) {
			System.out.println("O valor do porcentual aplicado � de: " + cincoPorcento);
			System.out.println("O valor do aumento � de: " + valorAumento05);
			System.out.println("O novo sal�rio � igual a " + aumentoAplicado05 + " reais.");
		}else {
			System.out.println("N�o ganhar� aumento.");
		}
	

	}

}
