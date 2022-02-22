package com.leticia.learningjava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = scanner.nextInt();
		
		if(idade >= 18) {
			System.out.println("Voc� � maior de idade. Deseja fazer um cart�o de cr�dito?");
		} else {
			System.out.println("Voc� n�o � maior de idade. N�o poder� fazer um cart�o de cr�dito!");
		}
		
		System.out.println("Informe o pre�o do item comprado: ");
		double valor = scanner.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Este item � barato, pode comprar!");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Este item cont�m desconto, pe�a j� o seu!");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Ops, melhor pesquisar um pouco mais!!");
		} else {
			System.out.println("Este item � muito caro!");
		}

	}

}
