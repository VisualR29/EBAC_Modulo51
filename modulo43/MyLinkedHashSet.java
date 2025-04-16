package com.ebac.modulo43;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHash = new LinkedHashSet<>();
        linkedHash.add("Perro");
        linkedHash.add("Gato");
        linkedHash.add("Caballo");
        linkedHash.add("Ardilla");
        linkedHash.add("Lagarto");

        System.out.println("Perro se encuentra en el hash? " + linkedHash.contains("Perro"));
        System.out.println("Amarrillo se encuentra en el hash? " + linkedHash.contains("Amarillo"));

        Iterator<String> iterator = linkedHash.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " - ");
        }
        System.out.println();

        System.out.println("¿Cuántos elementos tiene el linkedHashSet?: " + linkedHash.size());
        linkedHash.remove("Ardilla");

        System.out.println(linkedHash);
        linkedHash.clear();
        System.out.println(linkedHash);
    }
}
