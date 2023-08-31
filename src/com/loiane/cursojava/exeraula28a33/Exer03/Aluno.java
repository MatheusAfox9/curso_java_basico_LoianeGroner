package com.loiane.cursojava.exeraula28a33.Exer03;

public class Aluno {

    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double [] [] notas;

    public Aluno(){
        disciplinas = new String[3];
        notas = new double[3][4];


    }

    public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[][] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notas = notas;
        disciplinas = new String[3];
        notas = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }



   public void mostrarInfo(){
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

    public boolean verificarAprovado(int indice){

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

    public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
        this.disciplinas[pos] = nomeDisciplina;
    }

}
