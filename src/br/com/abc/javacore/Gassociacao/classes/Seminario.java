package br.com.abc.javacore.Gassociacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print(){
        System.out.println("----------Relatório do Seminário-------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Professor: " + this.professor.getNome());
        if(local != null){
            System.out.println("Local: " + this.local.getBairro() + " " + this.local.getRua());
        }else{
            System.out.println("Não há um local cadastrado");
        }
        System.out.println("Alunos: ");
        if (alunos != null && alunos.length != 0){
        for(Aluno aluno : this.alunos){
            System.out.println(aluno.getNome());
        }
        } else{
            System.out.println("Não há alunos registrados no seminário");
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
