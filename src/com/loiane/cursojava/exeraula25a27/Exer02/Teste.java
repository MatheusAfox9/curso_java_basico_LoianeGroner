package com.loiane.cursojava.exeraulas25a27.Exer02;


public class Teste {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numeroConta = "12123";
        contaCorrente.agencia = "1234";
        contaCorrente.especial = true;
        contaCorrente.limiteEspecial = 500;
        contaCorrente.saldo = -10;
        contaCorrente.valorEspecialUsado = 0;

        System.out.println("Saldo da conta corrente " + contaCorrente.numeroConta + " = " + contaCorrente.saldo);

        boolean saqueEfetuado = contaCorrente.realizarSaque(10);

        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            contaCorrente.consultarSaldo();
        }else{
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente");
        }

        saqueEfetuado = contaCorrente.realizarSaque(500);

        System.out.println("Tentativa de saque de 500 reais");

        if (saqueEfetuado){
            System.out.println("Saque efetuado com sucesso");
            contaCorrente.consultarSaldo();
        }else{
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente");
        }

        System.out.println("Deposito de 500 reais");
        contaCorrente.depositar(500);
        contaCorrente.consultarSaldo();

        if (contaCorrente.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

        contaCorrente.realizarSaque(600);

        contaCorrente.consultarSaldo();
        if (contaCorrente.verificarUsoChequeEspecial()){
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }


    }
}
