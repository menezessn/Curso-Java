package br.com.abc.javacore.Fmodificadorestatico.classes;

public class Cliente {
    //blocos de inicialização estaticos
    // 0 - bloco de inicialização estático é executado quando jvm carrega a classe (é executado apenas uma vez)
    //1- alocado espaço na memória para o objeto que será criado
    //2 - cada atributo de classe é criado e inicializado com seus valores default ou explicitos
    // 3 - bloco de inicialização dos objetos é executado
    // 4 - construtor é executado

    private static int[] parcelas ;

    static {
        parcelas = new int [100];
        System.out.println("Dentro do bloco de inicialização");
        for (int i = 1; i<=100; i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente(){

    }

    public static int[] getParcelas() {
        return parcelas;
    }


}
