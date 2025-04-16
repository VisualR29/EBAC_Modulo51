package com.ebac.modulo42;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ImplementacionArrayList {

    public static void imprimirArreglo(ArrayList<Object> lista) {
        AtomicInteger i = new AtomicInteger(1);
        System.out.println("TAMAÑO DE LA LISTA: " + lista.size());
        System.out.println("ELEMENTOS DE LA LISTA:");
        lista.forEach(elemento -> System.out.println(i.getAndIncrement() + ": " + elemento));
        System.out.println("----------------------------------\n");
    }

    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();
        long inicio = System.currentTimeMillis();
        System.out.println("TIENE ELEMENTOS: " + lista.isEmpty());
        lista.add(1);
        lista.add("Heyyy!!!");
        lista.add(true);
        lista.add(10);
        imprimirArreglo(lista);
        lista.remove(0);
        lista.remove(2);
        imprimirArreglo(lista);
        lista.add(29);
        System.out.println("TIENE ELEMENTOS: " + lista.isEmpty());
        lista.add("Sere el último elementos agregado");
        imprimirArreglo(lista);
        long fin = System.currentTimeMillis();
        System.out.println("////tiempo de ejecucion del vector es de " + (fin - inicio) + "////\n");

        List<Object> lista2 = List.of("A", 10, false, 29);
        lista.addAll(lista2);
        imprimirArreglo(lista);
    }
}
