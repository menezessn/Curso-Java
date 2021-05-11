package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.CPF = "122.222.232-20";
        prof.matricula = "11122";
        prof.nome = "Marcos";
        prof.rg = "122211-5";

        Professor prof2 = new Professor();
        prof2.CPF = "122.222.232-20";
        prof2.matricula = "11122";
        prof2.nome = "Joana";
        prof2.rg = "122211-5";

        System.out.println("dentro do professor");
        System.out.println(prof.nome);
        prof.imprime();
        prof2.imprime();
    }
}
