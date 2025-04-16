package com.ebac.modulo43;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        //Excepción
        cola.add("Uno");
        cola.element();
        cola.remove();

        //No expepción
        cola.offer("Dos");
        cola.poll();
        cola.peek();

        cola.add("Perro");
        cola.add("Gato");
        cola.add("Caballo");
        cola.add("Ardilla");
        cola.add("Lagarto");

        System.out.println("Perro se encuentra en el hash? " + cola.contains("Perro"));
        System.out.println("Amarrillo se encuentra en el hash? " + cola.contains("Amarillo"));

        Iterator<String> iterator = cola.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " - ");
        }
        System.out.println();

        System.out.println("¿Cuántos elementos tiene el linkedHashSet?: " + cola.size());
        cola.remove("Ardilla");

        System.out.println(cola);
        cola.clear();
        System.out.println(cola);
    }
}
