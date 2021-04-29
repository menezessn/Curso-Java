package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(5+5);
    }

    public void subtraiDoisNumeros(){
        System.out.println(5-5);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }
    public double divideDoisNumeros(double num1,double num2){
        if(num2!=0) {
            return num1/num2;
        }
            System.out.println("Não é possível dividir por zero");
            return 0;
    }
}
