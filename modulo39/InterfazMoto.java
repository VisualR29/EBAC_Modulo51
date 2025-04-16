package com.ebac.modulo39;

public class InterfazMoto implements InterfazVehiculo{
    @Override
    public void propietario(String propietario) {
        InterfazVehiculo.super.propietario(propietario);
    }

    @Override
    public String tipo() {
        return "Moto";
    }

    @Override
    public int llantas() {
        return 4;
    }
}
