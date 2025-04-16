package com.ebac.modulo43;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        hash.add("Perro");
        hash.add("Gato");
        hash.add("Caballo");
        hash.add("Ardilla");
        hash.add("Lagarto");

        System.out.println("Perro se encuentra en el hash? " + hash.contains("Perro"));
        System.out.println("Amarrillo se encuentra en el hash? " + hash.contains("Amarillo"));

        Iterator<String> iterator = hash.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " - ");
        }
        System.out.println();

        System.out.println("¿Cuántos elementos tiene el hashSet?: " + hash.size());
        hash.remove("Ardilla");

        System.out.println(hash);
        hash.clear();
        System.out.println(hash);
    }
}