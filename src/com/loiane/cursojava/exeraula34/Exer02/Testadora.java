package com.loiane.cursojava.exeraula34.Exer02;



public class Testadora {

    public static void main(String[] args) {

        imprimirTela(Calculadora.somar(1, 2));
        imprimirTela(Calculadora.diminuir(4, 2));
        imprimirTela(Calculadora.multiplicar(5, 5));
        imprimirTela(Calculadora.dividir(10, 2));
        imprimirTela(Calculadora.potencia(2, 3));


        }
    static void imprimirTela(int num){
        System.out.println(num);


    }
}
