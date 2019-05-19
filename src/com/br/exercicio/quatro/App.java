package com.br.exercicio.quatro;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int controle = 1;
		
		while (controle > 0) {
			
			int mediaEsperada = 7;
			
			System.out.println("Primeira nota: ");
			double nota1 = scan.nextDouble();
			
			System.out.println("Segunda nota: ");
			double nota2 = scan.nextDouble();
			
			System.out.println("Terceira nota: ");
			double nota3 = scan.nextDouble();
			
			System.out.println("Quarta nota: ");
			double nota4 = scan.nextDouble();
			
			double notaFinal = nota1 + nota2 + nota3 + nota4;
			
			double mediaFinal = notaFinal / 4.0;
			
			if (mediaFinal >= mediaEsperada) {
				
				System.out.println("Parabéns, você foi aprovado(a). Sua média final foi: " + mediaFinal);
				
			} else {
				
				System.out.println("Você foi reprovado(a). A média esperada era de " + mediaEsperada + " e sua média final foi: " + mediaFinal);
				
			}
			
			System.out.println("Digite 1 para continuar no programa ou -1 para sair");
			controle = scan.nextInt();
			
		}
		
				
	}

}
