package com.loiane.cursojava.exercicio14a15;

import java.util.Scanner;

public class Exer09 {
	
	public static void main(String[] args) {
		// 9. Faça um Programa que leia três números e mostre-os em ordem decrescente
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Digite o primeiro número: ");
		Double num1 = input.nextDouble();
		System.out.println("Digite o segundo número: ");
		Double num2 = input.nextDouble();
		System.out.println("Digite o terceiro número: ");
		Double num3 = input.nextDouble();
		
		Double maior = num1;
		Double meio = num2;
		Double menor = num3;
		
		if (num2 > maior && num2 > num3) {
			maior = num2;
			meio = num1;
		 if (num3 > num1) {
			meio = num3;
			menor = num1;
		}else  {
			menor = num3;
			meio = num1;
		} 
		 
		} else if ( num3 > maior && num3 > num2) {
			menor = num3;
			meio = num1;
			
		} if (num2 > num1) {
			meio = num2;
			menor = num1;
		} else {
			menor = num2;
			meio = num1;
			
		}
		
		
		System.out.println("Ordem decrescente: " + maior + ", " + meio + ", " + menor);
        
        input.close();
		

	}

}
