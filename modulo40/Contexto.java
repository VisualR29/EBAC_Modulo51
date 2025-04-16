package com.ebac.modulo40;

import jdk.dynalink.linker.ConversionComparator;

public class Contexto {
    public static void main(String[] args) {
        ClaseGenerica<Integer> claseEntero = new ClaseGenerica<>();
        ClaseGenerica<String> claseString = new ClaseGenerica<>();
        ClaseGenerica<Boolean> claseBoolean = new ClaseGenerica<>();

        Integer entero = claseEntero.metodoGenerico(29);
        String cadena = claseString.metodoGenerico("Hola mundo!");
        Boolean booleano = claseBoolean.metodoGenerico(false);

        System.out.println("Valor entero: " + entero);
        System.out.println("Valor cadena: " + cadena);
        System.out.println("Valor booleano: " + booleano);

        System.out.println("\n----------Modulo de convección--------------\n");

        System.out.println("Variable estática: " + Convenciones.holaMundo);
        System.out.println("Constante idUsuario: " + Convenciones.idUsuario);
        Convenciones.metodoEstatico();
    }
}
