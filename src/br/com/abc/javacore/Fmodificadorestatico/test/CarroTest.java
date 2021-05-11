package br.com.abc.javacore.Fmodificadorestatico.test;

import br.com.abc.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {

    public static void main(String[] args) {
        System.out.println();
        Carro c1= new Carro ("BMW", 280);
        Carro c2= new Carro ("Audi", 275);
        Carro c3= new Carro ("Mercedes", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("--------------------------");

        //Pelas boas práticas, atributos estaticos são alterados em toda classe, apesar de dar para modificar em um e, assim, modificando todos
        Carro.setVelocidadeLimite(220);
        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
