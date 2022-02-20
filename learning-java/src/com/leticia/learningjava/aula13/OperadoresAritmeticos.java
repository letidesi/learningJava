package com.leticia.learningjava.aula13;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		String operadores = "Operadores";
		String aritmeticos = " Aritméticos:";
		String concatenarString = operadores + aritmeticos;
		
		System.out.println(concatenarString);
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 3;
		System.out.println(resultado);
		
		resultado = resultado / 2;
		System.out.println(resultado);
		
		resultado = resultado % 4;
		System.out.println(resultado);
		
		System.out.println("Valor do resultado atual: " + resultado);
		
		resultado++;
		System.out.println(resultado);
		resultado++;
		System.out.println(resultado);
	    resultado +=1;
	    System.out.println(resultado);
	    
	    System.out.println(resultado++);
	    System.out.println(++resultado);
	    
	    resultado--;
	    System.out.println(resultado);
	    
	    System.out.println(resultado--);
	    System.out.println(--resultado);
	    
	    System.out.println("Valor do resultado atual: " + resultado);
	    
	    
	}

}
