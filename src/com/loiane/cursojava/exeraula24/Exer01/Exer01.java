package com.loiane.cursojava.exeraula24.Exer01;

public class Exer01 {

    public static void main(String[] args) {


        // Instanciando a lampada
        Lampada lampada = new Lampada();

        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarelo";
        lampada.tipoLuz = "Amarela";
        lampada.tipoAbajur = true;

        //Por ser um atributo com Array precisamos instaciar/criar o array para usar o atributo
        lampada.tipos = new String[5];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";


    }
}
