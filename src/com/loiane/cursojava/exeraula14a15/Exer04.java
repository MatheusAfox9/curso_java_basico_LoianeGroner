package com.loiane.cursojava.exercicio14a15;

import java.util.Scanner;

public class Exer04 {
	
public static void main(String[] args) {
		
		/* 4. Faça um Programa que verifique se uma letra digitada é vogal ou 
		   consoante.*/
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = input.next();
		
		if (letra.length() >1) {
			System.out.println("Dado inválido, favor digitar apenas uma letra.");
			
		}else {
			
		char ch = letra.charAt(0);
		switch(letra) {
		
		case "a":
		case "e":	
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":	
		case "I":
		case "O":
		case "U":	
			
			System.out.println("Você digitou " +letra+ ", é uma vogal");
			break;
		default:
			
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				System.out.println("Você digitou " + letra + ", é uma consoante");
			}else {
				System.out.print("Dado inválido, favor digitar uma letra.");
			}
			
			break;
			
			
		}
			
			
		}
		
		
			

	}

}
