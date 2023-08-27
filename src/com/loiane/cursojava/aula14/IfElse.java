package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/* System.out.println("Entre com sua idade");
		
		int idade = input.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade");
			
			
		} else {
			System.out.println("Não é maior de idade");
			
		}*/
			
		
		// Barato <= 10
		// Pedir desconto > 10 E valor < 15
		// Pesquisar mais >= 15 E Valor < 17
		// Muito caro >= 17
		
		System.out.println("Entre com o preço do item: ");
		double valor = input.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Está barato, pode comprar");
		
		} else if (valor > 10 && valor < 15){
			System.out.println("Você pode pedir desconto");
			
			
		} else if (valor >= 15 && valor < 17){
			System.out.println("Pode pesquisar mais");
			
			
		} else {
			
			System.out.println("Está muito caro");
		}
			
		
		 
		
	}

}
