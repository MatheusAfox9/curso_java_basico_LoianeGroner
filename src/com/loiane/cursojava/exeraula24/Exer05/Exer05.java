package com.loiane.cursojava.exeraula24.Exer05;

public class Exer05 {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numeroConta = "12123";
        contaCorrente.agencia = "1234";
        contaCorrente.especial = true;
        contaCorrente.limiteEspecial = 500;
        contaCorrente.saldo = -10;

        System.out.println("Saldo da conta corrente " + contaCorrente.numeroConta + " = " + contaCorrente.saldo);


    }
}
