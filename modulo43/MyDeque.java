package com.ebac.modulo43;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class MyDeque {
    public static void main(String[] args) {
        Deque<String> colaDoble = new LinkedList<>();
        //Excepción
        colaDoble.addFirst("Uno");
        colaDoble.getFirst();
        colaDoble.removeFirst();
        colaDoble.addLast("Tres");
        colaDoble.getLast();
        colaDoble.removeLast();

        //No expepción
        colaDoble.offerFirst("Dos");
        colaDoble.pollFirst();
        colaDoble.peekFirst();
        colaDoble.offerLast("Cuatro");
        colaDoble.pollLast();
        colaDoble.peekLast();

        colaDoble.addFirst("Perro");
        colaDoble.addLast("Gato");
        colaDoble.addFirst("Caballo");
        colaDoble.addLast("Ardilla");
        colaDoble.addFirst("Lagarto");

        System.out.println("Perro se encuentra en el hash? " + colaDoble.contains("Perro"));
        System.out.println("Amarrillo se encuentra en el hash? " + colaDoble.contains("Amarillo"));

        Iterator<String> iterator = colaDoble.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " - ");
        }
        System.out.println();

        System.out.println("¿Cuántos elementos tiene el linkedHashSet?: " + colaDoble.size());
        colaDoble.remove("Ardilla");
        colaDoble.removeLast();
        colaDoble.removeFirst();

        System.out.println(colaDoble);
        colaDoble.clear();
        System.out.println(colaDoble);
    }

}
