package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		/* Faša um programa que converta de metros para centÝmetros. */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe quantos metros: ");
		double metros = scanner.nextDouble();
		
		double cm = metros * 100;
		System.out.println("Valor em centÝmetros: " + cm);

	}

}
