package com.loiane.cursojava.exeraula34.Exer04;

public class ConversorDeUnidadeDeArea {

    private static double metroParaPes = 10.76;
    private static double pesParaCentrimetros = 929;
    private static double milhaParaAcre = 640;
    private static double acreParaPes = 43560;

    public static double conversaoMetrosPes(double metrosQuadrados){

        return metrosQuadrados * metroParaPes;
    }

    public static double conversaoPesCentrimetros(double pesQuadrados){

        return pesQuadrados * pesParaCentrimetros;
    }

    public static double conversaomilhasParaAcre(double milhas){

        return milhas * milhaParaAcre;
    }

    public static double conversaoAcrePes(double acre){

        return acre * acreParaPes;
    }




}
