package com.leticia.learningjava.aula12;

import java.util.Scanner;

public class LeituraDeDadosEnviadosPeloUsu�rioSegundaParte {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu primeiro nome, sua idade,"
				+  " quantidade de filhos, se voc� mora sozinha,"  + 
				   " se voc� tem bichinhos de estima��o: ");
				
				String primeiroNome = scanner.next();
				int idade = scanner.nextInt();
				byte quantidadeDeFilhos = scanner.nextByte();
				boolean moraSozinha = scanner.nextBoolean();
				boolean bichinhosEstima��o = scanner.nextBoolean();
				
				System.out.println("Voc� informou os seguintes valores: ");
				System.out.println("Primeiro nome: " + primeiroNome);
				System.out.println("Idade �: " + idade);
				System.out.println("Quantidade de filhos: " + quantidadeDeFilhos);
				System.out.println("Mora sozinha? " + moraSozinha);
				System.out.println("Tem bichinhos de estima��o? " + bichinhosEstima��o);

	}

}
