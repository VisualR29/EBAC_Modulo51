package com.ebac.modulo41;

public class ContextoRecord {
    public static void main(String[] args) {
        MyRecordClass recordClass = new MyRecordClass(18, "Esteban");
        System.out.println(recordClass);
        System.out.println("Nombre: " + recordClass.nombre());
        System.out.println("Numero: " + recordClass.numero());

    }
}
