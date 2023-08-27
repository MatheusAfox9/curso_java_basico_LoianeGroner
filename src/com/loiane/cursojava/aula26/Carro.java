package aula26;

public class Carro {

    // Método com retorno

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

}
