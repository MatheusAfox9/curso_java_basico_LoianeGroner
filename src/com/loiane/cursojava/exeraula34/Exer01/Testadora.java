package com.loiane.cursojava.exeraula34.Exer01;

import com.loiane.cursojava.exeraula34.Exer01.Contador;

public class Testadora {

    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }

    public static void main(String[] args) {

        imprimirValor();

        Contador.incrementar();

        imprimirValor();

        Contador.zerar();

        imprimirValor();



    }
}
