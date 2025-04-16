package com.ebac.modulo37;

public class ArreglosBidimensionales {

    public static void main(String[] args) {
        int matriz[][] = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        System.out.println("Matriz impresa: ");
        System.out.println(matriz[0][0] + "-" + matriz[0][1] + "-" + matriz[0][2] + "-" + matriz[0][3]);
        System.out.println(matriz[1][0] + "-" + matriz[1][1] + "-" + matriz[1][2] + "-" + matriz[1][3]);
        System.out.println(matriz[2][0] + "-" + matriz[2][1] + "-" + matriz[2][2] + "-" + matriz[2][3]);
    }

}
