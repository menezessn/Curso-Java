package br.com.abc.javacore.Dsobrecargaconstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String nome, String matricula, double[] notas){
        this.matricula=matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String nome, String matricula, double[] notas, String dataMatricula) {
        this(nome, matricula, notas);
        this.dataMatricula = dataMatricula;

    }

    public Estudante() {
        System.out.println("Construtor Default");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for(double nota: notas){
            System.out.println(nota);
        }
    }

    //alt+insert = getters & setters


    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
