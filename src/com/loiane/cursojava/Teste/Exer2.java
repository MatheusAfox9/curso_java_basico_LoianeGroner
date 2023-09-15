package com.loiane.cursojava.Teste;

import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Curso curso = new Curso();

        System.out.println("Digite o nome do seu curso: ");
        String nomeCurso = scan.nextLine();

        System.out.println("Digite o seu horário: ");
        String horario = scan.nextLine();

        curso.setNome(nomeCurso);
        curso.setHorario(horario);

        Professor professor = new Professor();

        System.out.println("Digite o nome do professor: ");
        String nomeProf = scan.nextLine();

        System.out.println("Digite o nome do departamento: ");
        String departamentoProf = scan.nextLine();

        System.out.println("Digite o seu e-mail: ");
        String emailProf = scan.nextLine();

        professor.setNome(nomeProf);
        professor.setDepartamento(departamentoProf);
        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        System.out.println("--- Alunos ---");

        Aluno [] alunos = new Aluno[5];

        for (int i = 0; i<5; i++){

            System.out.println("Digite o nome do Aluno: " + (i+1));
            String nomeAluno = scan.nextLine();

            System.out.println("Digite a matricula do Aluno: ");
            String matriculaAluno = scan.nextLine();

            double[] notas = new double[4];

            for (int j = 0; j<4; j++){

                System.out.println("Digite as notas: " + (j+1));
                notas[j] = scan.nextDouble();
            }


            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matriculaAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;

            curso.setAluno(alunos);











        }



    }
}
