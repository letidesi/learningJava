package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		/*
		   Fa�a um programa para o c�lculo de uma folha de pagamento,
		   sabendo que os descontos s�o os Imposto de Renda, que depende
		   do  sal�rio bruto e 3% para o Sindicato e que o FGTS
		   corresponde a 11% do sal�rio bruto, mas n�o � descontado
		   (� a empresa que deposita). O sal�rio l�quido corresponde
		   ao sal�rio bruto menos os descontos. O programa dever� pedir
		   ao usu�rio o valor da sua hora e quantidade de horas trabalhadas
		   no m�s.
		   Desconto do IR:
		   
		   - Sal�rio Bruto at� 900 (inclusive) - isento.
		   - Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%.
		   - Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%.
		   - Sal�rio Bruto acima de 2500 (inclusive) - desconto de 20%.
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe quanto voc� ganha por hora: ");
		double valorHora = scanner.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadasno m�s: ");
		double quantidadeHorasTrabalhadas = scanner.nextDouble();
		
		double salarioBruto = valorHora * quantidadeHorasTrabalhadas;
		
		double impostoRenda5 = salarioBruto * 0.05;
		double impostoRenda10 = salarioBruto * 0.10;
		double impostoRenda20 = salarioBruto * 0.20;
		double impostoRenda = salarioBruto * 0;
		
		double INSS = salarioBruto * 0.10;
		double FGTS = salarioBruto * 0.11;
		
		
		double totalDescontos5 = impostoRenda5 + INSS; 
		double totalDescontos10 = impostoRenda10 + INSS; 
		double totalDescontos20 = impostoRenda20 + INSS;
		double totalDescontos =  impostoRenda;
		
	    double salarioLiquido5 = salarioBruto - totalDescontos5;
	    double salarioLiquido10 = salarioBruto - totalDescontos10;
	    double salarioLiquido20 = salarioBruto - totalDescontos20;
	    double salarioLiquido = totalDescontos;
		
		System.out.println("S�lario Bruto: (" + valorHora + " * " + quantidadeHorasTrabalhadas + ")  : " + " " +"R$ " + salarioBruto);
		
		if(salarioBruto <= 900) {
			System.out.println("(-) IR (0%)    " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + "  "+ " " + " : " + " R$ " + " " + " " + impostoRenda);
			System.out.println("(-) INSS (10%) " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " : " + " R$ " + "  " + INSS);
			System.out.println("(-) FGTS (11%) " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " : " + " R$ " + "  " + FGTS);
			System.out.println("Total de descontos "   + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " : " + " R$ " + " " + " " + totalDescontos);
			System.out.println("Sal�rio L�quido" + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + "  : " + " R$ " + " "  + " " + salarioLiquido);
			System.out.println("Status" + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + "  " + " " + " " + " " + "  " + " " + " : " + " "  + " " + "Isento");
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			System.out.println("(-) IR (5%)    " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + "  "+ " " + " : " + " R$ " + " " + " " + impostoRenda5);
			System.out.println("(-) INSS (10%) " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " : " + " R$ " + "  " + INSS);
			System.out.println("(-) FGTS (11%) " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " : " + " R$ " + "  " + FGTS);
			System.out.println("Total de descontos "   + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " : " + " R$ " + " " + " " + totalDescontos5);
			System.out.println("Sal�rio L�quido" + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + "  : " + " R$ " + " "  + " " + salarioLiquido5);
			
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			System.out.println("(-) IR (10%) " + " " + " " + " " + " " + " " + "  " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " :" + " " + " R$ " + impostoRenda10);
			System.out.println("(-) INSS (10%) " + " " + " " + " " + " " + " " + "  " + "  " + " " + "  " + " " + " " + " : " + " R$ " + INSS);
			System.out.println("(-) FGTS (11%) " + " " + " " + " " + " " + " " + "  " + "  " + " " + "  " + " " + " " + " : " + " R$ " + FGTS);
			System.out.println("Total de descontos " + " " + " " + " " + " " + " " + "  " + "  " + " " + " : " + " R$ " + totalDescontos10);
			System.out.println("Sal�rio L�quido" + " " + " " + " " + " " + " " + "  " + "  " + " "  + " " + " " + " " + "  : " + " R$ " + salarioLiquido10);
		} else {
			System.out.println("(-) IR (20%)   " + " " + " " + " " + " " + " " + "  " + " " + " " + " " + " " + " " + " " + " " + " : " + " R$ " + impostoRenda20);
			System.out.println("(-) INSS (10%) " + " " + " " + " " + " " + " " + "  " + "  " + " " + "  " + " " + " " + " : " + " R$ " + INSS);
			System.out.println("(-) FGTS (11%) " + " " + " " + " " + " " + " " + "  " + "  " + " " + "  " + " " + " " + " : " + " R$ " + FGTS);
			System.out.println("Total de descontos " + " " + " " + " " + " " + " " + "  " + "  " + " "  + " : " + " R$ " + totalDescontos20);
			System.out.println("Sal�rio L�quido" + " " + " " + " " + " " + " " + "  " + "  " + " "  + " " + " " + " " + " " + " : " + " R$ " + salarioLiquido20);
		}
		
	}

}
