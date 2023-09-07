package com.loiane.cursojava.exeraula34.Exer06;

public class ConversaoDeUnidadesDeTempo {

    private static double minutosParaSegundos = 60;
    private double horaParaMinutos = 60;
    private static double diaParaHoras = 24;
    private static double semanaParaDias = 7;
    private static double mesParaDias = 30;
    private static double anoParaDias = 365.25;


    public static double conversãoMinutosParaSegundos (Double segundos){
        return segundos * minutosParaSegundos;


    }




}
