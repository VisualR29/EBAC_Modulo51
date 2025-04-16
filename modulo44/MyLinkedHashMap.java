package com.ebac.modulo44;

import java.util.LinkedHashMap;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Manzana");
        linkedHashMap.put(2, "Platano");
        linkedHashMap.put(3, "Cereza");
        linkedHashMap.put(4, "Sandia");
        linkedHashMap.put(5, "Uva");

        System.out.println("LinkedHashMap inicial: " + linkedHashMap);

        linkedHashMap.forEach((k, v) -> System.out.println("Clave: " + k + " | Valor: " + v));
        System.out.println("-----------------------");

        System.out.println("Valores: " + linkedHashMap.values());
        System.out.println("Claves: " + linkedHashMap.keySet());
        System.out.println("-----------------------");

        System.out.println("Número de elementos: " + linkedHashMap.size());
        System.out.println("Eliminando clave 3: " + linkedHashMap.remove(3));
        System.out.println("¿Existe la clave 2?: " + linkedHashMap.containsKey(2));
        System.out.println("Valor de la clave 4: " + linkedHashMap.get(4));
        System.out.println("¿Contiene el valor 'Uva'?: " + linkedHashMap.containsValue("Uva"));
        System.out.println("Valor por defecto cuando no existe clave 9: " + linkedHashMap.getOrDefault(9, "No encontrado"));

        linkedHashMap.replace(5, "Melón");
        System.out.println("Después de reemplazar clave 5: " + linkedHashMap);

        linkedHashMap.putIfAbsent(6, "Kiwi");
        System.out.println("Después de agregar clave 6 si estaba ausente: " + linkedHashMap);
    }
}
