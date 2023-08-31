package com.loiane.cursojava.exeraula25a27.Exer01;

public class Lampada {

    // 1.	Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar, desligar a lampada.


    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String [] tipos;
    boolean tipoAbajur;

    boolean Ligada;


    void ligar(){

        Ligada = true;

    }

    void desligar(){

        Ligada = false;

    }

    void mostrarEstado(){

        if (Ligada){
            System.out.println("Lampada está ligada");
        } else {
            System.out.println("Lampada está desligada");
        }
    }

    void mudarEstado(){

        if(Ligada){
            desligar();
        } else {
            ligar();
        }

    }




}
