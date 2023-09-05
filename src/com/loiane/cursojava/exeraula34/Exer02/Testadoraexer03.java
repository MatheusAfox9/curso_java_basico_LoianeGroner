package com.loiane.cursojava.exeraula34.Exer02;

import java.util.Scanner;

public class Testadoraexer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;

        do {
            System.out.println("Entre com o número positivo: ");
            num = scan.nextInt();

            if ( num < 0){
                System.out.println("Número inválido, digite o número novamente.");
            }
        } while (num < 0);

        System.out.println(Calculadora.fatorial(num));



    }
}
