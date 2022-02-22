package com.leticia.learningjava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = scanner.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você é maior de idade. Deseja fazer um cartão de crédito?");
		} else {
			System.out.println("Você não é maior de idade. Não poderá fazer um cartão de crédito!");
		}
		
		System.out.println("Informe o preço do item comprado: ");
		double valor = scanner.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Este item é barato, pode comprar!");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Este item contém desconto, peça já o seu!");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Ops, melhor pesquisar um pouco mais!!");
		} else {
			System.out.println("Este item é muito caro!");
		}

	}

}
