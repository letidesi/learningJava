package com.leticia.learningjava.aula12;

import java.util.Scanner;

public class LeiturasDeDadosEnviadosPeloUsuário {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu nome completo:");
		String nomeCompleto = scanner.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Informe seu primeiro nome: ");
		String primeiroNome = scanner.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Informe a sua idade: ");
		int idade = scanner.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Informe a sua altura: ");
		double altura = scanner.nextDouble();
		System.out.println("Sua altura é: " + altura);
		
		
	}

}
