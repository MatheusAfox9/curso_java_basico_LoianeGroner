package com.loiane.cursojava.exercicio14a15;

import java.util.Scanner;

public class Exer03 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		
		/* 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
		Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/
		
		
		String masculino = "M";
		String feminino = "F";
		
		System.out.println("Digete o seu sexo: M ou F");
		String sexo = input.nextLine().toUpperCase();
		
		
		switch (sexo){
			case "M":
				System.out.println("Masculino");
				
				break;
			case "F":
				System.out.println("Feminino");
				
				break;
			default:
				System.out.println("Sexo invalino!");
				
				break;
			
		}
			
		
	}

}
