package br.com.abc.javacore.Dsobrecargaconstrutores.test;

import br.com.abc.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("Marcio" , "2144", new double[]{3,4,5,9},"12/01/1999");
        est.imprime();
    }
}
