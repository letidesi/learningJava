package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		/*
		   Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem 
		   "O n�mero informado foi: [n�mero]." 
		   
		*/
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Informe um n�mero: ");
		 double numero = scanner.nextDouble();
		 System.out.println("O n�mero informado foi: " + numero);

	}

}
