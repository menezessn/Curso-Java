package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Carro {
    //velocidade limite deve ser de 240 km/h
    private String nome;
    private double velocidadeMaxima;
    //static - o atributo pertence à classe e não mais a um objeto, modificando em um objeto, você altera todas.
    private static double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {

    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
    public static double getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public void imprime(){
        System.out.println("_________________________________");
        System.out.println(this.nome);
        System.out.println("Velocidade máxima " + this.velocidadeMaxima);
        System.out.println("Velocidade limite " + velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
