package com.leticia.learningjava.aula12;

import java.util.Scanner;

public class LeituraDeDadosEnviadosPeloUsuárioSegundaParte {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu primeiro nome, sua idade,"
				+  " quantidade de filhos, se você mora sozinha,"  + 
				   " se você tem bichinhos de estimação: ");
				
				String primeiroNome = scanner.next();
				int idade = scanner.nextInt();
				byte quantidadeDeFilhos = scanner.nextByte();
				boolean moraSozinha = scanner.nextBoolean();
				boolean bichinhosEstimação = scanner.nextBoolean();
				
				System.out.println("Você informou os seguintes valores: ");
				System.out.println("Primeiro nome: " + primeiroNome);
				System.out.println("Idade é: " + idade);
				System.out.println("Quantidade de filhos: " + quantidadeDeFilhos);
				System.out.println("Mora sozinha? " + moraSozinha);
				System.out.println("Tem bichinhos de estimação? " + bichinhosEstimação);

	}

}
