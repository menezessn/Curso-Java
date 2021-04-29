package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {

    public static void main(String[] args) {
        Professor armando = new Professor();
        armando.CPF = "193.195.403-21";
        armando.nome = "Armando Nogueira";
        armando.matricula= "1212";
        armando.rg = "50.776.198-4";

        System.out.println(armando.matricula);
        System.out.println(armando.nome);
        System.out.println(armando.CPF);
        System.out.println(armando.rg);

    }

}
