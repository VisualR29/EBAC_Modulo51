package com.ebac.modulo48;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class InterfacesFuncionales {
    public static void main(String[] args) {
//        //Lambda 1
//        SinParametros sinParametros = () -> System.out.println("Lambda Sin Parametros");
//        sinParametros.metodo();
//
//        //Lambda 2
//        ConParametro conParametro = (a, b) -> System.out.println("El año actual es "+ a + " en la ciudad de " + b);
//        conParametro.metodo(2025,"CDMX");
//
//        //Lambda 3
//        ConParametrosYRetorno conParametrosYRetorno = (int a) -> {
//            int b = 0;
//            for (int i = 1; i < a+1; i++) {b += i;}
//            return b;};
//        int result = conParametrosYRetorno.metodo(10);
//        System.out.println("El resultado fue de: " + result);

        //Lambda 4 (Actividad 3.A)
        InterfaceA interfaceA = () -> {
          return "Soy una función sin parametros, pero retorno esta cadena de texto.";
        };
        String cadena = interfaceA.metodo();
        System.out.println(cadena);

        //Supplier (Actividad 3.A)
        Supplier<String> supplier = () -> {
            return "Soy un supplier sin parametros, pero retorno esta cadena de texto.";
        };
        cadena = supplier.get();
        System.out.println(cadena);

        //Lambda 5 (Actividad 3.B)
        InterfaceB interfaceB = (list) -> {
            list.forEach(System.out::println);
        };
        interfaceB.metodo(Arrays.asList("Pinguino", "Jirafa", "Ajolote"));

        //Consumer (Actividad 3.B)
        List<String> lista = Arrays.asList("Pinguino", "Jirafa", "Ajolote");
        Consumer<String> consumer = elemento -> System.out.println(elemento);
        lista.forEach(consumer);

        //UnartOperator<T> (Actividad 3.C)
        UnaryOperator<Integer> unaryOperator = a -> {
            return (a + a) * a - a;
        };
        int result = unaryOperator.apply(4);
        System.out.println("El resultado de (a + a) * a - a = " + result);
    }
}

@FunctionalInterface
interface SinParametros {
    void metodo();
}

@FunctionalInterface
interface ConParametro {
    void metodo(int entero, String string);
}

@FunctionalInterface
interface ConParametrosYRetorno{
    int metodo(int entero);
}

@FunctionalInterface
interface InterfaceA {
    String metodo();
}

@FunctionalInterface
interface InterfaceB {
    void metodo(List<String> lista);
}