package com.leticia.learningjava.aula12;

import java.util.Scanner;

public class LeiturasDeDadosEnviadosPeloUsu�rio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu nome completo:");
		String nomeCompleto = scanner.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("Informe seu primeiro nome: ");
		String primeiroNome = scanner.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Informe a sua idade: ");
		int idade = scanner.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		System.out.println("Informe a sua altura: ");
		double altura = scanner.nextDouble();
		System.out.println("Sua altura �: " + altura);
		
		
	}

}
