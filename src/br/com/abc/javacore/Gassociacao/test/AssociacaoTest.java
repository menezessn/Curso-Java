package br.com.abc.javacore.Gassociacao.test;

import br.com.abc.javacore.Gassociacao.classes.Aluno;
import br.com.abc.javacore.Gassociacao.classes.Local;
import br.com.abc.javacore.Gassociacao.classes.Professor;
import br.com.abc.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Marcelo", 27);
        Aluno aluno2 = new Aluno("Joana d'arc", 20);

        Seminario sem = new Seminario("Como ficar rico");
        Seminario sem2 = new Seminario("Como programar");

        Professor prof = new Professor("youda", "Programar");
        Professor prof2 = new Professor("Marcão" , "Empreender");

        Local local = new Local("Ruas das araras" , "Grajau");


        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);
//        aluno.print();

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new Aluno[]{aluno, aluno2});

        sem2.setProfessor(prof2);
        sem2.setLocal(local);
        sem2.setAlunos(new Aluno[] {aluno});


        prof.setSeminarios(new Seminario[]{sem});
        prof2.setSeminarios(new Seminario [] {sem2});

        sem.print();
        sem2.print();
        prof.print();
        prof2.print();
        aluno.print();
        aluno2.print();
    }
}
