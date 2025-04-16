package com.ebac.modulo47;
import java.util.List;

public class MyPatternMatching {
    public static void main(String[] args) {
        List<Object> listaObjetos = List.of(
                "Hola, Mundo!",
                123,
                45.67,
                true
        );

        for (Object obj : listaObjetos) {
            verificarTipo(obj);
        }
    }

    private static void verificarTipo(Object obj) {
        if (obj instanceof String s && s.contains("Mundo")) {
            System.out.println("Cadena con la palabra Mundo: " + s);
        } else if (obj instanceof Integer i && i > 100) {
            System.out.println("Número entero mayor a 100: " + i);
        } else if (obj instanceof Double d) {
            System.out.println("Número decimal: " + d);
        } else {
            System.out.println("Otro tipo de dato: " + obj);
        }
    }
}
