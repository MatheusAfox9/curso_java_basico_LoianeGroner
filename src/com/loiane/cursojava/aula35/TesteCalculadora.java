package com.loiane.cursojava.aula35;

public class TesteCalculadora {

    public static void main(String[] args) {

        int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println("Fatorial não recursivo: " + fatorialNR);

        int fatorialR = Calculadora.fatocial(5);
        System.out.println("Fatorial recursivo: " + fatorialR);

    }
}
