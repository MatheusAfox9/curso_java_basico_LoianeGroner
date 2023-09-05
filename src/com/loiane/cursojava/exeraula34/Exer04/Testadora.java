package com.loiane.cursojava.exeraula34.Exer04;

import java.util.Scanner;

public class Testadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ConversorDeUnidadeDeArea con = new ConversorDeUnidadeDeArea();

        System.out.println("Digite a sua área em metros: ");
        double metroQuadrados = scan.nextDouble();

        double pesQuadrados = con.conversaoMetrosPes(metroQuadrados);

        System.out.println("O valor em pés quadrados é: " + pesQuadrados);

        double centimetrosQuadrados = con.conversaoPesCentrimetros(pesQuadrados);

        System.out.println("O valor em centímetros quadrados é: " + centimetrosQuadrados);

        System.out.println("Digite a sua área em milhas: ");
        double milhasQuadrados = scan.nextDouble();

        double acre = con.conversaomilhasParaAcre(milhasQuadrados);

        System.out.println("O valor em Acres é: " + acre);

        double pesQuadrados2 = con.conversaoAcrePes(acre);

        System.out.println("O valor em pés quadrados é: " + pesQuadrados2);



    }
}
