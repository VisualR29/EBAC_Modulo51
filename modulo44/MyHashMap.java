package com.ebac.modulo44;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Java");
        hashMap.put(20, "Python");
        hashMap.put(30, "C++");
        hashMap.put(40, "JavaScript");
        hashMap.put(50, "Go");
        hashMap.put(null, "Swift");

        System.out.println("HashMap inicial: " + hashMap);
        hashMap.forEach((k, v) -> System.out.println("Clave: " + k + " | Valor: " + v));
        System.out.println("-----------------------");

        System.out.println("Valores: " + hashMap.values());
        System.out.println("Claves: " + hashMap.keySet());
        System.out.println("-----------------------");

        System.out.println("Número de elementos: " + hashMap.size());
        System.out.println("Eliminando clave nula: " + hashMap.remove(null));
        System.out.println("¿Existe la clave 20?: " + hashMap.containsKey(20));
        System.out.println("Valor de la clave 30: " + hashMap.get(30));
        System.out.println("¿Contiene el valor 'Go'?: " + hashMap.containsValue("Go"));
        System.out.println("Valor por defecto cuando no existe clave 99: " + hashMap.getOrDefault(99, "No encontrado"));

        hashMap.replace(40, "TypeScript");
        System.out.println("Después de reemplazar clave 40: " + hashMap);

        hashMap.putIfAbsent(60, "Rust");
        System.out.println("Después de agregar clave 60 si estaba ausente: " + hashMap);
    }
}