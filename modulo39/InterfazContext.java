package com.ebac.modulo39;

public class InterfazContext {
    public static void main(String[] args) {
        InterfazMoto vehiculo = new InterfazMoto();
        vehiculo.propietario("Manuel");
        System.out.println("El dueño de la " + vehiculo.tipo() + " es Manuel y tiene " + vehiculo.llantas() + " llantas.");
    }

}
