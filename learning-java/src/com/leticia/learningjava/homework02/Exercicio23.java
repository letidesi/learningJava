package com.leticia.learningjava.homework02;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		/*
		 * O Hipermercado Tabajara est� com uma promo��o de carnes que � imperd�vel.
		 * Confira: At� 5 Kg Acima de 5 Kg File Duplo R$ 4,90 por Kg R$ 5,80 por Kg
		 * Alcatra R$ 5,90 por Kg R$ 6,80 por Kg Picanha R$ 6,90 por Kg R$ 7,80 por Kg
		 * Para atender a todos os clientes, cada cliente poder� levar apenas um dos
		 * tipos de carne da promo��o, por�m n�o h� limites para a quantidade de carne
		 * por cliente. Se compra for feita no cart�o Tabajara o cliente receber� ainda
		 * um desconto de 5% sobre o total da compra. Escreva um programa que pe�a o
		 * tipo e a quantidade de carne comprada pelo usu�rio e gere um cupom fiscal,
		 * contendo as informa��es da compra: tipo e quantidade de carne, pre�o total,
		 * tipo de pagamento, valor do desconto e valor a pagar.
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Informe o tipo de carne desejada: \n " + "[1] - Fil� Duplo \n [2] - Alcatra \n [3] - Picanha");
		int tipoDeCarne = scanner.nextInt();

		System.out.println("Informe a quantidade em kg de carne desejada:");
		double quantidadeDeCarne = scanner.nextDouble();

		double precoKg = 0;

		if (tipoDeCarne == 1) {

			System.out.println(quantidadeDeCarne + "Kg - Fil� Duplo");

			if (quantidadeDeCarne < 5) {
				precoKg = 4.90;
			} else {
				precoKg = 5.80;
			}

		} else if (tipoDeCarne == 2) {

			System.out.println(quantidadeDeCarne + "Kg - Alcatra");

			if (quantidadeDeCarne < 5) {
				precoKg = 5.90;
			} else {
				precoKg = 6.80;
			}

		} else if (tipoDeCarne == 3) {

			System.out.println(quantidadeDeCarne + "Kg - Picanha");

			if (quantidadeDeCarne < 5) {
				precoKg = 6.90;
			} else {
				precoKg = 7.80;
			}
		}

		double totalAPagar = quantidadeDeCarne * precoKg;
		System.out.println(quantidadeDeCarne + "kg * " + precoKg + " = " + totalAPagar);

		System.out.println("Deseja pagar com o cart�o? \n [1] - Sim \n [2] - N�o");
		int cartao = scanner.nextInt();

		switch (cartao) {
		case 1:
			double desconto = (totalAPagar / 100) * 5;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar: " + (totalAPagar - desconto));
			break;
		case 2:
			System.out.println("Valor a pagar: " + totalAPagar);
			break;
		default:
			System.out.println("Valor inv�lido.");
			break;
		}

	}

}
