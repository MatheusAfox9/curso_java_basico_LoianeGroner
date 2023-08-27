package com.loiane.cursojava.exercicio14a15;

import java.util.Scanner;

public class Exer05 {
	
	public static void main(String[] args) {
		/*5. Faça um programa para a leitura de duas notas parciais de um aluno. 
			O programa deve calcular a média alcançada por aluno e apresentar:
			
			1 - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
			2 - A mensagem "Reprovado", se a média for menor do que sete;
			3 - A mensagem "Aprovado com Distinção", se a média for igual a dez */
			
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digte a primeira nota: ");
		Double nota1 = input.nextDouble();
		System.out.println("Digte a segunda nota: ");
		Double nota2 = input.nextDouble();
		
		Double media = (nota1 + nota2) / 2;
		
		if (media == 7) {
			System.out.println("Aprovado!");
		}else if (media < 7) {
			System.out.println("Reprovado");
		}else if (media == 10) {
			System.out.println("Aprovado com Distinção");
			
		}
		
		
		
		
		

	}

}
