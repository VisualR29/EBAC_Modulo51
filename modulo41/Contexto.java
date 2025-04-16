package com.ebac.modulo41;

public class Contexto {
    public static void main(String[] args) {
        Object edad = 19;

        switch (edad) {
            case Integer i:
                System.out.println("ACCESO DENEGADO ES MENOR DE EDAD.");
                break;
            default:
                System.out.println("TIPO DE DATO INVALIDO.");
        }
    }
}
