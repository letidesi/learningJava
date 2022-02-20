package com.leticia.learningjava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valorUm = 1;
		int valorDois = 2;
		
		boolean resultado = (valorUm == 1) && (valorDois == 2);
		System.out.println("valorUm é 1 AND valorDois é 2 - resultado: " + resultado);
		
		boolean resultado2 = (valorUm == 1) || (valorDois == 2);
		System.out.println("valorUm é 1 OR valorDois é 2 - resultado: " + resultado2);
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && falso);
		System.out.println(!verdadeiro || falso);
		System.out.println(verdadeiro && !falso);
		
	}

}
