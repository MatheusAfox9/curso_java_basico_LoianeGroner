package com.loiane.cursojava.exeraula35;

public class Calculadora {


    public static int fibonacci (int num){

        if (num<2){
            return 1;
        }

        return fibonacci(num-1) + fibonacci(num-2);



    }

    public static int somatoria(int num){

        if (num == 1)
            return 1;


        return num + somatoria(num-1);
    }




}
