package com.loiane.cursojava.exercicio11a13;

import java.util.Scanner;

public class Exercicio01 {
	
public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);		
				
		// 1 - Faça um Programa que mostre a mensagem "Alo mundo" na tela
		
		//String mensagem = "Olá, mundo!";
		//System.out.println(mensagem);
		
		/* 2 - Faça um Programa que peça um número e então mostre a
		mensagem O número informado foi [número]. */
		
		/*System.out.println("Digite um número: ");
		int numero = input.nextInt();
		System.out.println("O número informado foi: " + numero);*/
		
		// 3 - Faça um Programa que peça dois números e imprima a soma.
		
		/* System.out.println("Digite o primeiro número: ");
		int numero1 = input.nextInt();
		System.out.println("Digite o segundo número: ");
		int numero2 = input.nextInt();
		int soma = numero1 + numero2;
		System.out.println("A soma dos dois números é: " + soma);*/
		
		// 4 - Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		/* System.out.println("Digite a primeira nota: ");
		int nota1 = input.nextInt();
		System.out.println("Digite a segunda nota: ");
		int nota2 = input.nextInt();
		System.out.println("Digite a terceira nota: ");
		int nota3 = input.nextInt();
		System.out.println("Digite a quarta nota: ");
		int nota4 = input.nextInt();
		
		int somatorio = (nota1 + nota2 + nota3 + nota4)  / 4;
		
		System.out.println("A sua média é: " + somatorio);*/
		
		//  5 - Faça um Programa que converta metros para centímetros
		
		/* System.out.println("Informe o número de metros que deseja converter para cm: ");
		Double metro = input.nextDouble();
		Double conversao = (metro * 100);
		System.out.println("A conversão do metro informado em cm é: " + conversao);*/
		
		/* 6 - Faça um Programa que peça o raio de um círculo, calcule e mostre 
		sua área.
		
		System.out.println("Entre com o raio do círculo: ");
		double raio = input.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + area);*/
		
		/* 7 - Faça um Programa que calcule a área de um quadrado, em seguida 
		mostre o dobro desta área para o usuário 
		
		System.out.println("Digite o tamanho do lado do quadrado: ");
		double lado = input.nextDouble();
		
		double areaQuadrado = lado * lado;
		
		System.out.println("A área do quadrado é: " + areaQuadrado);
		double dobro = areaQuadrado * 2;
		
		System.out.println("O dobro da área é: " + dobro);*/
		
		
		/* 8 - Faça um Programa que pergunte quanto você ganha por hora e o 
		número de horas trabalhadas no mês. Calcule e mostre o total do seu 
		salário no referido mês*/
		
		/* System.out.println("Quanto você ganha por hora: ");
		Double horaTrabalhada = input.nextDouble();
		System.out.println("Qual foi o total de horas trabalhadas: ");
		int totalHoras = input.nextInt();
		
		Double salarioMes = (horaTrabalhada * totalHoras);
		System.out.println("Você recerá de salário o valor de R$: " + salarioMes); */
		
		
		
		/* 11 - Faça um Programa que peça 2 números inteiros e um número real. 
		Calcule e mostre:
		a. o produto do dobro do primeiro com metade do segundo .
		b. a soma do triplo do primeiro com o terceiro.
		c. o terceiro elevado ao cubo. */
		
		/*System.out.println("Digite o primeiro número inteiro: ");
		int n1 = input.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		int n2 = input.nextInt();
		System.out.println("Digite o número real: ");
		double n3 = input.nextDouble();
		
		int a = (n1*2) + (n2/2);
		double b = (n1*3) + n3;
		double c = n3 * n3 * n3
			
		
	
		
		System.out.println("O dobro do primeiro com metade do segundo é: " + a);
		System.out.println("O triplo do primeiro com o terceiro é: " + b);
		System.out.println("O terceiro elevado ao cubo: " + c);*/
		
		
		/* 12 - Tendo como dados de entrada a altura de uma pessoa, construa um 
		algoritmo que calcule seu peso ideal, usando a seguinte fórmula: 
		(72.7*altura) - 58 */
		
		/* System.out.println("Digite a sua altura: ");
		double altura = input.nextDouble();
		
		double pesoIdeal = (72.7*altura) - 58;
		
		System.out.println("O seu pesoa ideal é: " + pesoIdeal);*/
		
		/* 13 - Tendo como dados de entrada a altura e o sexo de uma pessoa, 
		construa um algoritmo que calcule seu peso ideal, utilizando as 
		seguintes fórmulas:
		. Para homens: (72.7*h) - 58
		a. Para mulheres: (62.1*h) - 44.7 (h = altura)
		b. Peça o peso da pessoa e informe se ela está dentro, acima ou 
		abaixo do peso. 
		
		System.out.println("Digite a sua altura: ");
		double altura = input.nextDouble();
		
		System.out.println("Escolha: M - Masculino / F - Feminino ");
		String sexo = input.next();
		
		System.out.println("Digite o seu peso: ");
		double peso = input.nextDouble();*/
		
		/* 14 - João Papo-de-Pescador, homem de bem, comprou um 
		microcomputador para controlar o rendimento diário de seu trabalho. 
		Toda vez que ele traz um peso de peixes maior que o estabelecido 
		pelo regulamento de pesca do estado de São Paulo (50 quilos) deve 
		pagar uma multa de R$ 4,00 por quilo excedente. João precisa que 
		você faça um programa que leia a variável peso (peso de peixes) e 
		verifique se há excesso. Se houver, gravar na variável excesso e na 
		variável multa o valor da multa que João deverá pagar. Caso contrário 
		mostrar tais variáveis com o conteúdo ZERO.*/
		
		
				
		/* System.out.println("Olá meu fornecedor, quantos kg de peixo você nos trouxe hoje? ");
		int pesoJ = input.nextInt();
		
		int multa = 0;
		
		int excesso = pesoJ-50;
		
		int multaRegulamento = excesso * 4;
		
		if (pesoJ <= 50) {
			System.out.println("Excesso: 0,00");	
			System.out.println("Multa: 0,00");	
			
		} else {
			System.out.println("Excesso: " + excesso);	
			System.out.println("Multa: " + (multaRegulamento));	
			
			
		}*/
		
		/* 15 - Faça um Programa que pergunte quanto você ganha por hora e o 
		número de horas trabalhadas no mês. Calcule e mostre o total do seu 
		salário no referido mês, sabendo-se que são descontados 11% para o 
		Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um 
		programa que nos dê:
		. salário bruto.
		a. quanto pagou ao INSS.
		b. quanto pagou ao sindicato.
		c. o salário líquido.
		d. calcule os descontos e o salário líquido, conforme a tabela 
		abaixo:
		+ Salário Bruto : R$ - IR (11%) : R$ - INSS 
		(8%) : R$ - Sindicato ( 5%) : R$ = Salário
		Liquido : R$
		Obs.: Salário Bruto - Descontos = Salário Líquido.*/
		
		
		/*System.out.println("Quanto você ganha por hora: ");
		Double horaTrabalhada = input.nextDouble();
		System.out.println("Qual foi o total de horas trabalhadas no mês: ");
		int totalHoras = input.nextInt();
		
		double salarioBruto = horaTrabalhada*totalHoras;
		System.out.println("O seu salário Bruto é: " + salarioBruto);
		
		double ir = salarioBruto * 0.11;
		
		double inss = salarioBruto * 0.08;
		System.out.println("Você pagou de INSS: " + inss);
		
		double sindicato = salarioBruto * 0.05;
		System.out.println("Você pagou de Sindicato: " + sindicato);
		
		double salarioLiquido = (salarioBruto - ir - inss - sindicato);
		System.out.println("Seu salário líquido é: " + salarioLiquido);*/
		

		
		
		
		/* 16.Faça um programa para uma loja de tintas. O programa deverá pedir o 
		tamanho em metros quadrados da área a ser pintada. Considere que a 
		cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a 
		tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao 
		usuário a quantidades de latas de tinta a serem compradas e o preço 
		total.
		
		System.out.println("Quantos metros tem a área a ser pintada?");
		int metros = input.nextInt();*/
		
		
		
		

	}

}
