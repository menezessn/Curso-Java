package br.com.abc.introducao;

public class Array {
    public static void main(String[] args) {
        int [][] dias = new int [2][2];
        dias[0][0] = 1;
        dias[0][1] = 2;
        dias[1][0] = 3;
        dias[1][1] = 4;

        for (int []ref:
                dias ) {
            for (int dia:
                    ref) {
                System.out.println(dia);
            }
        }

    }
}

