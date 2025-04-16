package com.ebac.modulo42;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class ImplementacionStack {

    public static void imprimirPila(Stack<Object> pila){
        AtomicInteger i = new AtomicInteger(1);
        System.out.println("TAMAÑO DE LA PILA: " + pila.size());
        System.out.println("ELEMENTOS DE LA PILA:");
        pila.forEach(elemento -> System.out.println(i.getAndIncrement() + ": " + elemento));
        System.out.println("----------------------------------\n");
    }

    public static void main(String[] args) {
        Stack<Object> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        imprimirPila(pila);
        System.out.println("ULTIMO ELEMENTO AGREGADO y PRIMERO EN SALIR: " + pila.peek());
        System.out.println("ELIMINAMOS ESE ELEMENTOS: " + pila.pop());
        System.out.println("¿Contiene el elemento 2? " + pila.search(2));
        imprimirPila(pila);
    }
}
