package com.loiane.cursojava.exeraula34.Exer05;

public class ConversaoDeUnidadesDeVolume {

    private static double litroParaCubicos = 1000;
    private double cubicosParaLitros = 0.001000;

    private static double cubicosParaPesCubicos = 35.32;

    private static double galaoAmericanoParaPolegadasCubicas = 231;

    private static double galaoAmericanoParaLitros = 3.785;


    public double conversaoLitroParaMetrosCubicos (double metrosCubicos){

        return metrosCubicos / litroParaCubicos;

    }

    public double conversaoMetrosCubicosParaLitro (double litrosConvertido){

        return litrosConvertido / cubicosParaLitros;

    }

    public double conversaoMetrosCubicosParaPesCubicos (double pesCubicos){

        return pesCubicos * cubicosParaPesCubicos;

    }

    public double conversaoGalaoAmericanoParaPolegadasCubicas (double polegadasCubicas){

        return polegadasCubicas * galaoAmericanoParaPolegadasCubicas;

    }

    public double conversaoGalaoAmericanoParaLitros (double conversaoLitros){

        return conversaoLitros * galaoAmericanoParaLitros;

    }



}
