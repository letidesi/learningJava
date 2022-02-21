package com.leticia.learningjava.homework;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		/*
		 
		   Faça um programa que peça o tamanho de um arquivo para download (em MB)
		   e a velocidade do link da internet (em Mbps), calcule e informe o tempo
		   aproximado de download do arquivo usando link (em minutos).
		   
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo: ");
		double tamanhoDoArquivo = scanner.nextDouble();
		
		System.out.println("Informe a velocidade do link da internet: ");
		double velocidadeDoLinkDaInternet = scanner.nextDouble();
		
		double tempoAproximadoDeDownload = tamanhoDoArquivo / velocidadeDoLinkDaInternet;
		double tempoAproximadoDeDownloadEmMinutos = tempoAproximadoDeDownload / 60;
		
		System.out.println("O tempo aproximado de download do arquivo é: " + tempoAproximadoDeDownload);
		System.out.println("O tempo aproximado de download do arquivo em minutos é: " + tempoAproximadoDeDownloadEmMinutos);
	}

}
