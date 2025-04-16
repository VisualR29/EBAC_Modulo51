package com.ebac.modulo39;

public class ClaseB {
    public ClaseB(){
        System.out.println("Clase B");
    }

    public static void main(String[] args) {
        ClaseA objetoA = new ClaseA();
        ClaseC objetoC = new ClaseC("Max");
    }
}
