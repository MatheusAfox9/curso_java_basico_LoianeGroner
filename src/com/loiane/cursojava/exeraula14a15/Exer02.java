package com.loiane.cursojava.exercicio14a15;

import java.util.Scanner;

public class Exer02 {
	
	public static void main(String[] args) {
		/* 2. Faça um Programa que peça um valor e mostre na tela se o valor é 
		positivo ou negativo.*/
		
		Scanner input = new Scanner (System.in);

		System.out.println("Digte um número: ");
		Double numero = input.nextDouble();

		if (numero >= 0) {
			System.out.println("O número é positivo");
		} else {
	System.out.println("O número é negativo");
		}

	}

}
