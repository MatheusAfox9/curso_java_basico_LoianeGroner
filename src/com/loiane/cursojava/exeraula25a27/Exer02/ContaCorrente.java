package com.loiane.cursojava.exeraulas25a27.Exer02;

public class ContaCorrente {

    /* 2.	Cria uma classe para representar uma conta corrente que possui um número,
     um saldo, um status que informa se ela é especial ou não, um limite.
     Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques),
     despositar dinheiro, consultar saldo e verificar se o cliente está usando cheque especial ou não.
     Desenvolva um programa para testar essa classe.
     */

    String numeroConta;
    String agencia;
    boolean especial;
    double saldo;
    double limiteEspecial;

    double valorEspecialUsado;


    boolean realizarSaque(double quantiaASacar){

        //tem saldo na conta
        if (saldo >= quantiaASacar){
            saldo -= quantiaASacar;
            return true;
        } else { //não tem saldo na conta
            if (especial) {
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; //não é especial e não tem saldo suficiente
            }
        }
    }

    void depositar (double valorDepositado){
        saldo += valorDepositado;
    }

    void consultarSaldo(){
        System.out.println("Saldo atual da conta = " + saldo);
    }

    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }


}
