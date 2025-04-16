package com.ebac.modulo38;

public class Ciclos {

    public static void main(String[] args) {
        int arreglo[] = new int[10];

        System.out.println("FOR (AGREGA ELEMENTOS)");
        for(int i = 0; i < 10; i++){
            arreglo[i] = i*5;
            System.out.println("ELEMENTO AGREGADO: " + arreglo[i]);
        }

        System.out.println("\nFOR-EACH");
        for (int num : arreglo){
            System.out.print("valor: " + num + " - ");
        }

        System.out.println("\nWHILE");
        int index = 0;
        while(index < 10){
            System.out.print("valor: " + arreglo[index] + " - ");
            index++;
        }

        System.out.println("\nDO-WHILE");
        index = 0;
        do {
            System.out.print(arreglo[index] + " - ");
            index++;
        }while(index < 9);
    }

}
