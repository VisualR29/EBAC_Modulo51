package com.ebac.modulo43;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedLista = new LinkedList<>();
        linkedLista.add("Perro");
        linkedLista.add("Gato");
        linkedLista.add("Caballo");
        linkedLista.add("Ardilla");
        linkedLista.add("Lagarto");

        System.out.println("Perro se encuentra en el hash? " + linkedLista.contains("Perro"));
        System.out.println("Amarrillo se encuentra en el hash? " + linkedLista.contains("Amarillo"));

        Iterator<String> iterator = linkedLista.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " - ");
        }
        System.out.println();

        System.out.println("¿Cuántos elementos tiene el linkedHashSet?: " + linkedLista.size());
        linkedLista.remove("Ardilla");

        System.out.println(linkedLista);
        linkedLista.clear();
        System.out.println(linkedLista);
    }
}
