package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		/*
		   Faça um programa que peça um número e então mostre a mensagem 
		   "O número informado foi: [número]." 
		   
		*/
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Informe um número: ");
		 double numero = scanner.nextDouble();
		 System.out.println("O número informado foi: " + numero);

	}

}
