package com.loiane.cursojava.exercicio14a15;

import java.util.Scanner;

public class Exer07 {
	
public static void main(String[] args) {
		
		/*7. Faça um Programa que leia três números e mostre o maior e o menor 
		deles.*/
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = input.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = input.nextInt();
		System.out.println("Digite o terceiro número: ");
		int num3 = input.nextInt();
		
		int maior = num1;
		if (num2 > maior) {
			maior = num2;
		}
		if (num3 > maior) {
			maior = num3;
		}
		
		int menor = num1;
		if (num2 < menor) {
			menor = num2;
		}
		if (num3 < menor) {
			menor = num3;
		}
		
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		
		input.close();
		
		

	}

}
