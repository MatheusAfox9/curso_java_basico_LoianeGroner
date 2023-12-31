package com.loiane.cursojava.exeraula25a27.Exer03;

public class Aluno {

    /* 3.	Escreva uma class para representar um Aluno. Adicione atributos relacionados às caracteristicas de um Aluno,
     como nome, matricula, curso que está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas.
      Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma determinada disciplina.
      Escreva um programa para testar essa classe, que pede as informações do aluno ao usuário e ao final informa o nome das
      disciplinas, mostra as notas e mostra se o aluno foi aprovado ou não.
     */

    String nome;
    String matricula;
    String curso;

    String[] disciplinas;

    double [] [] notas;

    void mostrarInfo(){
        System.out.println("Nome " + nome);
        System.out.println("Matricula " + matricula);
        System.out.println("Nome do curso " + curso);

        for (int i=0; i<notas.length; i++){
            System.out.println("Notas da disciplica " + disciplinas[i]);
            for (int j = 0; j < notas.length; j++){
                System.out.println(notas [i][j] + " ");
            }

        }

    }

    boolean verificarAprovado(int indice){

        double soma = 0;

        for (int i=0; i<notas.length; i++){
            soma += notas[indice] [i];

        }

        double media = soma / 3;
        if (media >= 7){
            return true;
        }else{
            return false;
        }


    }



}
