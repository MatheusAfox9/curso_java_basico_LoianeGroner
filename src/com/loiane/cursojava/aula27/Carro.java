package com.loiane.cursojava.aula27;

public class Carro {

    // Método com retorno e parâmetro

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // O método void é incluído na própria classe
    // O Nome do método sempre começa com verbos "Exibir, calcular..."
    // Quando método não possui retorno iniciar a declaração com o "Void"
    void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");


    }


    /* Quando o métedo possui retorno usamos no inicio da declaração o tipo de retorno" double, String, int"
    e no final do método usar o retorn */


    double obterAutonomia(){

        System.out.println("Método obter autonomia foi chamado. ");

        return capCombustivel * consumoCombustivel;
    }

    //Criar um método para determinar um determinado combustivel para um determinada km
    // Os parâmetros são incluídos, no exemplo não temos a km que vamos precisar como atributo porque é algo variável
    // O parametro sera o "(double km)"

    double calcularCombustivel(double km){

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }

}
