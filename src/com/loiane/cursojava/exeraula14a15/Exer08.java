package com.loiane.cursojava.exercicio14a15;

import java.util.Scanner;

public class Exer08 {
	
	public static void main(String[] args) {
		/* 8. Faça um programa que pergunte o preço de três produtos e informe 
		qual produto você deve comprar, sabendo que a decisão é sempre 
		pelo mais barato. */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Dige o preço do primeiro produto: ");
		Double preco1 = input.nextDouble();
		System.out.println("Dige o preço do segundo produto: ");
		Double preco2 = input.nextDouble();
		System.out.println("Dige o preço do terceiro produto: ");
		Double preco3 = input.nextDouble();
		
		if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("O primeiro produto é o mais barato.");
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("O segundo produto é o mais barato.");
        } else if (preco3 < preco1 && preco3 < preco2) {
            System.out.println("O terceiro produto é o mais barato.");
        } else {
            System.out.println("Dois ou mais produtos têm o mesmo preço.");
        }
        
        input.close();
		
		
	}

}
