package com.ebac.modulo40;

abstract class Figura {
    public abstract int perimetro();

    public void nombreFigura(String nombre) {
        System.out.println("El nombre de la figura es: " + nombre);
    }

}
