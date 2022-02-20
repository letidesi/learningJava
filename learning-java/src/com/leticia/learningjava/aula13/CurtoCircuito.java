package com.leticia.learningjava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		boolean resultadoUm = falso & verdadeiro;
		boolean resultadoDois = falso && verdadeiro;
		
		System.out.println(resultadoUm);
		System.out.println(resultadoDois);
		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);
	}

}
