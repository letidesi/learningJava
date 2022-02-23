package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		/*
		   As organizações Tabajara resolveram dar um aumento de salário aos
		   seus colaboradores e lhe contraram para desenvolver o programa que
		   calculará os reajustes.
		   Faça um programa que receba o salário de um colaborador e o reajuste
		   segundo o seguinte critério, baseado no salário atual:
		   
		   - Salários até R$ 280,00 (incluindo): aumento de 20%
		   - Salários entre R$ 280,00 e R$ 700,00: aumento de 15%;
		   - Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%;
		   - Salários de R$ 1500,00 em diante: aumento de 5%. 
		   
		   Após o aumento realizado, informe na tela:
		   
		   - O salário antes do reajuste.
		   - O percentual de aumento aplicado.
		   - O valor do aumento.
		   - O novo salário, após o aumento.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o salário do colaborador: ");
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
		
		
		System.out.println("O salário antes do reajuste é igual " + salario + " reais.");
		
		if(salario == 280) {
			System.out.println("O valor do porcentual aplicado é de: " + vintePorcento);
			System.out.println("O valor do aumento é de: " + valorAumento20);
			System.out.println("O novo salário é igual a " + aumentoAplicado20 + " reais. \n");
		} else if (salario > 280 && salario <= 700) {
			System.out.println("O valor do porcentual aplicado é de: " + quinzePorcento);
			System.out.println("O valor do aumento é de: " + valorAumento15);
			System.out.println("O novo salário é igual a " + aumentoAplicado15 + " reais.");
		} else if (salario > 700 && salario <= 1500) {
			System.out.println("O valor do porcentual aplicado é de: " + dezPorcento);
			System.out.println("O valor do aumento é de: " + valorAumento10);
			System.out.println("O novo salário é igual a " + aumentoAplicado10 + " reais.");
		}else if (salario > 1500) {
			System.out.println("O valor do porcentual aplicado é de: " + cincoPorcento);
			System.out.println("O valor do aumento é de: " + valorAumento05);
			System.out.println("O novo salário é igual a " + aumentoAplicado05 + " reais.");
		}else {
			System.out.println("Não ganhará aumento.");
		}
	

	}

}
