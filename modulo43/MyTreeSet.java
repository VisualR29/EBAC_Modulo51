package com.ebac.modulo43;

import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("Perro");
        tree.add("Gato");
        tree.add("Caballo");
        tree.add("Ardilla");
        tree.add("Lagarto");

        System.out.println(tree.floor("G"));
        System.out.println(tree.ceiling("G"));

        System.out.println("Perro se encuentra en el hash? " + tree.contains("Perro"));
        System.out.println("Amarrillo se encuentra en el hash? " + tree.contains("Amarillo"));

        Iterator<String> iterator = tree.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " - ");
        }
        System.out.println();

        System.out.println("¿Cuántos elementos tiene el linkedHashSet?: " + tree.size());
        tree.remove("Ardilla");

        System.out.println(tree);
        tree.clear();
        System.out.println(tree);
    }
}
