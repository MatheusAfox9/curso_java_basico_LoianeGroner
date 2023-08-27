package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
	

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			/* System.out.println("Digite seu nome completo: ");
			String nomeCompleto = input.nextLine();
			System.out.println("Seu nome é " + nomeCompleto);
			
			
			System.out.println("Digite seu primeiro nome completo: ");
			String primeiroNome = input.next();
			System.out.println("Seu primeiro nome é " + primeiroNome); 
			
			System.out.println("Digite a sua idade:");
			int idade = input.nextInt();
			System.out.println("Sua idade é: " + idade);
			
			System.out.println("Digite a sua altura:");
			double altura = input.nextDouble();
			System.out.println("Sua altura é: " + altura); */
			
			System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação:");
			String primeiroNome = input.next();
			int idade = input.nextInt();
			byte qtdFilhos = input.nextByte();
			float altura = input.nextFloat();
			boolean temPet = input.nextBoolean();
			
			System.out.println("Você digitou os seguintes valores:");
			System.out.println("Digite seu primeiro nome: " + primeiroNome);
			System.out.println("Digite a sua idade: " + idade);
			System.out.println("Idade: " + idade);
			System.out.println("Altura: " + altura);
			System.out.println("Tem bichinho de estimação? " + temPet);
			
			
			
			

		}

}

