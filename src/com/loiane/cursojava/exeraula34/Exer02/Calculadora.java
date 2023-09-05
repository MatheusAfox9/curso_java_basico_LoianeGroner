package com.loiane.cursojava.exeraula34.Exer02;

public class Calculadora {

    private int num1;
    private int num2;


    public static int somar(int num1, int num2){
        return (num1 + num2);

    }

    public static int diminuir (int num1, int num2){
        return (num1 - num2);

    }

    public static int multiplicar (int num1, int num2){
        return (num1 * num2);

    }

    public static int dividir (int num1, int num2){
        return (num1 / num2);

    }

    public static int potencia (int num1, int num2){

        int total = num1;
        for (int i=1;i<num2;i++){
            total *= num1;

        }

        return total;

    }

    // Fatorial 5! 5 * 4 * 3 * 2 * 1 = 120
    //0! = 1
    // Não existe fatorial de número negativo

    public static int fatorial(int num){

        if (num == 0){
            return 0;
        }

        int total = 1;
        for (int i=num;i>1;i--){
            total *= i;

        }
        return total;

    }

}
