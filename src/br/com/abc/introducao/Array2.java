package br.com.abc.introducao;

public class Array2 {
    public static void main(String[] args) {
        int [][] dia = new int[3][];
        dia[0] = new int[3];
        dia[1] = new int[3];
        dia[2] = new int[3];
        
        int [][] dia2 = { {0,1},{0,3,4}, {4,5,6} };

        for (int []x:
             dia2) {
            for (int y:
                 x) {
                System.out.println(y);
            }
        }




    }
}
