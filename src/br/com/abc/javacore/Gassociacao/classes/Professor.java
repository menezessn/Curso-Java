package br.com.abc.javacore.Gassociacao.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public void print(){
        System.out.println("----------Relatório do Professor-------------");
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade do professor: " + this.especialidade);
        System.out.println("Seminários participantes: ");
        if (seminarios != null && this.seminarios.length!=0){
        for( Seminario sem : this.seminarios){
            System.out.println(sem.getTitulo()+ " ");
        }
        } else{
            System.out.println("Não há seminários cadastrados no professor");
        }
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
