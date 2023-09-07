package com.loiane.cursojava.exeraula34.Exer06;

import java.util.Scanner;

public class Testadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite a QTD de minutos para conversão: ");
        double minutos = scan.nextDouble();

        double segundos = ConversaoDeUnidadesDeTempo.conversãoMinutosParaSegundos(minutos);

        System.out.println("A QTD " + minutos + " em segundos é: " + segundos);


    }
}
