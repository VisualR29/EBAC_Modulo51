package com.ebac.modulo45;

public class MiException extends Exception {
    public MiException() {
        super("Ocurrio un error");
    }

    public MiException(String message) {
        super("Ocurrio un error - " + message);
    }
}

class MiClaseDeNegocio {
    public void calcularSuma(int a, int b) throws MiException{
        if (a < 10) {
            throw new MiException("El numero a no puede ser menor de 10");
        } else {
            System.out.println("La suma es: " + (a + b));
        }
    }
}

class Context {
    public static void main(String[] args) {
        MiClaseDeNegocio miClaseDeNegocio = new MiClaseDeNegocio();
        try {
            miClaseDeNegocio.calcularSuma(5,3);
        } catch (MiException e) {
            System.out.println(e.getMessage());
        }
    }
}