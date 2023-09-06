package com.loiane.cursojava.exeraula34.Exer05;

import java.util.Scanner;

public class Testadora {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        ConversaoDeUnidadesDeVolume con = new ConversaoDeUnidadesDeVolume();

        System.out.println("Digite a QTD de litros: ");
        double litros = Scan.nextDouble();

        double metrosCubicos = con.conversaoLitroParaMetrosCubicos(litros);

        System.out.println("A conversão de litros em metros Cubicos é: " + metrosCubicos);

        double litrosConvertidos = con.conversaoMetrosCubicosParaLitro(litros);

        System.out.println("A conversão de metros cubicos em litros é: " + litrosConvertidos);

        double pesCubicos = con.conversaoMetrosCubicosParaPesCubicos(metrosCubicos);

        System.out.println("A conversão de metros cubicos em Pes cubicos é: " + pesCubicos);

        System.out.println("Digite a QTD de galão americano: ");
        double galaoAmericano = Scan.nextDouble();

        double polegadaCubica = con.conversaoGalaoAmericanoParaPolegadasCubicas(galaoAmericano);

        System.out.println("A conversão de galão americano para polegadas cubicas é: " + polegadaCubica);

        double conversaoLitros = con.conversaoGalaoAmericanoParaLitros(galaoAmericano);

        System.out.println("A conversão de galão americano para litros é: " + conversaoLitros);




    }

}
