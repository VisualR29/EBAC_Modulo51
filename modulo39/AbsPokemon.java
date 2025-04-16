package com.ebac.modulo39;

public abstract class AbsPokemon {
    String nombre = "unknown";
    int vida = 0;
    int damage = 0;

    public AbsPokemon() {}

    public AbsPokemon(String nombre, int vida, int damage) {
        this.nombre = nombre;
        this.vida = vida;
        this.damage = damage;
    }

    public void info() {
        System.out.println("Pokemon: " + this.nombre + "\nVida: " + this.vida + "\nDaño: " + this.damage);
    }

    public abstract void atacar();
}