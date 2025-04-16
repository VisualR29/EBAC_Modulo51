package com.ebac.modulo42;

import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class ImplementacionVector {
    public static void imprimirVector(Vector<Object> vector){
        AtomicInteger i = new AtomicInteger(1);
        System.out.println("TAMAÑO DE LA LISTA: " + vector.size());
        System.out.println("ELEMENTOS DE LA LISTA:");
        vector.forEach(elemento -> System.out.println(i.getAndIncrement() + ": " + elemento));
        System.out.println("----------------------------------\n");
    }

    public static void main(String[] args) {
        Vector<Object> vector1 = new Vector<>();
        long inicio = System.currentTimeMillis();
        System.out.println("TIENE ELEMENTOS: " + vector1.isEmpty());
        vector1.add('A');
        vector1.add('B');
        vector1.add('C');
        vector1.add('D');
        imprimirVector(vector1);
        vector1.remove(1);
        vector1.remove(2);
        imprimirVector(vector1);
        vector1.add(29);
        System.out.println("TIENE ELEMENTOS: " + vector1.isEmpty());
        vector1.add("Sere el último elementos agregado");
        imprimirVector(vector1);
        long fin = System.currentTimeMillis();
        System.out.println("////tiempo de ejecucion del vector es de " + (fin - inicio) + "////\n");
    }
}
