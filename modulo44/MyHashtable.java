package com.ebac.modulo44;

import java.util.Hashtable;

public class MyHashtable {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Rojo");
        hashtable.put(2, "Azul");
        hashtable.put(3, "Verde");
        hashtable.put(4, "Amarillo");
        hashtable.put(5, "Negro");

        System.out.println("Hashtable inicial: " + hashtable);

        hashtable.forEach((k, v) -> System.out.println("Clave: " + k + " | Valor: " + v));
        System.out.println("-----------------------");

        System.out.println("Valores: " + hashtable.values());
        System.out.println("Claves: " + hashtable.keySet());
        System.out.println("-----------------------");

        System.out.println("Número de elementos: " + hashtable.size());
        System.out.println("Eliminando clave 3: " + hashtable.remove(3));
        System.out.println("¿Existe la clave 2?: " + hashtable.containsKey(2));
        System.out.println("Valor de la clave 4: " + hashtable.get(4));
        System.out.println("¿Contiene el valor 'Negro'?: " + hashtable.containsValue("Negro"));
        System.out.println("Valor por defecto cuando no existe clave 99: " + hashtable.getOrDefault(99, "No encontrado"));

        hashtable.replace(5, "Blanco");
        System.out.println("Después de reemplazar clave 5: " + hashtable);

        hashtable.putIfAbsent(6, "Gris");
        System.out.println("Después de agregar clave 6 si estaba ausente: " + hashtable);
    }
}