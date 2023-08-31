package com.loiane.cursojava.exeraula28a33.Exer02;

public class Teste {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente("1234",true,500,1000);
        contaCorrente.setNumeroConta("12345");
        contaCorrente.setEspecial(true);
        contaCorrente.setSaldo(500);
        contaCorrente.setLimiteEspecial(1000);

        System.out.println("Saldo da conta corrente " + contaCorrente.getNumeroConta() + " = " + contaCorrente.getSaldo());



    }


}
