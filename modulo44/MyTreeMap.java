package com.ebac.modulo44;

import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Manzana");
        treeMap.put(2, "Platano");
        treeMap.put(3, "Cereza");
        treeMap.put(4, "Sandia");
        treeMap.put(5, "Uva");

        System.out.println("TreeMap inicial: " + treeMap);

        treeMap.forEach((k, v) -> System.out.println("Clave: " + k + " | Valor: " + v));
        System.out.println("-----------------------");

        System.out.println("Valores: " + treeMap.values());
        System.out.println("Claves: " + treeMap.keySet());
        System.out.println("-----------------------");

        System.out.println("Número de elementos: " + treeMap.size());
        System.out.println("Eliminando clave 3: " + treeMap.remove(3));
        System.out.println("¿Existe la clave 2?: " + treeMap.containsKey(2));
        System.out.println("Valor de la clave 4: " + treeMap.get(4));
        System.out.println("¿Contiene el valor 'Uva'?: " + treeMap.containsValue("Uva"));
        System.out.println("Valor por defecto cuando no existe clave 9: " + treeMap.getOrDefault(9, "No encontrado"));

        treeMap.replace(5, "Melón");
        System.out.println("Después de reemplazar clave 5: " + treeMap);

        treeMap.putIfAbsent(6, "Kiwi");
        System.out.println("Después de agregar clave 6 si estaba ausente: " + treeMap);
    }
}
