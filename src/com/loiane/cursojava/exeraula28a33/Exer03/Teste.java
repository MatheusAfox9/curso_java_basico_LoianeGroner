package com.loiane.cursojava.exeraula28a33.Exer03;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do Aluno: ");
        aluno.setNome(Scan.nextLine());

        System.out.println("Entre com o nome do curso: ");
        aluno.setCurso(Scan.nextLine());

        System.out.println("Entre com o número de matrícula: ");
        aluno.setMatricula(Scan.nextLine());

        for (int i=0; i<aluno.getDisciplinas().length;i++){
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.setNomeDisciplinaPos(i, Scan.next() );
        }


        for (int i=0; i<aluno.getNotas().length; i++) {
            System.out.println("Obtendo notas da disciplinas " + aluno.getDisciplinas()[i]);
            int j;
            for (j = 0; j < aluno.getNotas()[i].length; j++) {
                System.out.println("Entre com a nota " + (j + 1));
                aluno.getNotas()[i][j] = Scan.nextDouble();
            }


        }

        aluno.mostrarInfo();

        for (int i=0; i<aluno.getDisciplinas().length; i++){
            if (aluno.verificarAprovado(i)){
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - foi reprovado");
            }
        }

    }
}
