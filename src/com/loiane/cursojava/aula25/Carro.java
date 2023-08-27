package aula25;

public class Carro {

    // Métodos simples: sem retorno e/ou parâmetro (Void)

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    // O método void é incluído na própria classe
    // O Nome do método sempre começa com verbos "Exibir, calcular..."
    void exibirAutonomia(){

        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");

    }

}
