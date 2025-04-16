package com.ebac.modulo45;

public class ClaseRuntimeException {
    public static void main(String[] args) {
        int[] arreglo = {0, 1, 2};
        try {
            System.out.println(arreglo[3]);
        } catch (Exception e){
            System.out.println("Ocurrio una exception: " + e.getMessage());
        }
    }
}
