package com.ebac.modulo40;

public class Cuadrado extends Figura implements Coloreable{
    private int lado;
    private String color;

    public Cuadrado(int lado, String color) {
        this.lado = lado;
        this.color = color;
    }

    @Override
    public int perimetro() {
        return 4 * lado;
    }

    @Override
    public String nombreColor() {
        return "El color de la figura es: " + color;
    }

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(4, "Violeta");

        cuadrado.nombreFigura("Cuadrado");
        System.out.println("Perímetro: " + cuadrado.perimetro());
        System.out.println(cuadrado.nombreColor());
    }
}
