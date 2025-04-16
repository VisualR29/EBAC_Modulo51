package com.ebac.modulo39;

public interface InterfazVehiculo {
    public default void propietario(String propietario){
        System.out.println("Dueño del vehiculo: " + propietario);
    }

    public String tipo();

    public int llantas();
}
