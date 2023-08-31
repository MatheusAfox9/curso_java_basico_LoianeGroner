package com.loiane.cursojava.exeraula28a33.Exer02;

public class ContaCorrente {

    private String numeroConta;
    private boolean especial;
    private double saldo;
    private double limiteEspecial;

    public ContaCorrente(String numeroConta, boolean especial, double saldo, double limiteEspecial) {
        this.numeroConta = numeroConta;
        this.especial = especial;
        this.saldo = saldo;
        this.limiteEspecial = limiteEspecial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public boolean realizarSaque(double quantiaASacar){

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

    public void depositar (double valorDepositado){
        saldo += valorDepositado;
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual da conta = " + saldo);
    }

    public boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }



}
