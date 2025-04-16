package com.ebac.modulo37;

public class TipoComplejoString {

    public static void main(String[] args) {

        String nombre = "Esteban";
        String celular = "123 456 78 89";

        System.out.println("Nombre: " + nombre);
        System.out.println("Celular: " + celular);
        System.out.println("Nombre en mayus: " + nombre.toUpperCase());
        System.out.println("Celular es igual al nombre: " + celular.equals(nombre));
        System.out.println("Nombre tamaño: " + nombre.length());
        System.out.println("Celular primeros 3 digitos: " + celular.substring(0,3));

    }

}
