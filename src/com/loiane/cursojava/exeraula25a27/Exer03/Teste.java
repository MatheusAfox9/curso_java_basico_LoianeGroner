package com.loiane.cursojava.exeraulas25a27.Exer03;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do Aluno: ");
        aluno.nome = Scan.nextLine();

        System.out.println("Entre com o nome do curso: ");
        aluno.curso = Scan.nextLine();

        System.out.println("Entre com o número de matrícula: ");
        aluno.matricula = Scan.nextLine();


        aluno.disciplinas = new String [3];
        for (int i=0; i<aluno.disciplinas.length;i++){
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.disciplinas[i] = Scan.next();
        }

        aluno.notas = new double [3] [4];
        for (int i=0; i<aluno.notas.length; i++) {
            System.out.println("Obtendo notas da disciplinas " + aluno.disciplinas[i]);
            int j;
            for (j = 0; j < aluno.notas.length; j++) {
                System.out.println("Entre com a nota " + (j + 1));
                aluno.notas[i][j] = Scan.nextDouble();
            }


        }

        aluno.mostrarInfo();

        for (int i=0; i<aluno.disciplinas.length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi reprovado");
            }
        }








    }
}
