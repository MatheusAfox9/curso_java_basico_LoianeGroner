package com.loiane.cursojava.aula30;

public class Carro {


    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;



    // Usar a função generate para gerar os construtores, contrutores são os parametros
    // O "this" referencia os atributos e metodos da própria classe "Estou dizendo que tô usando dessa classe carro)
    // Deixar explicito que o metodo ta usando atributos ou metodos da propria classe. Nesse exemplo Carro

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando o construtor com 3 parâmetros");
    }


    //Criado um constrututor que tá referenciado um modelo especidifco
    // Toda classe que criar com esse construtor será "Fiat, Ducato, 10 passageiros"
    public Carro(String marca, String modelo) {
       this(marca,modelo, 10);
        System.out.println("Chamando o construtor com 2 parâmetros");

    }

    public Carro() {

    }

    void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");


    }



    double obterAutonomia(){

        System.out.println("Método obter autonomia foi chamado. ");

        return capCombustivel * consumoCombustivel;
    }


    double calcularCombustivel(double km){

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }
}
