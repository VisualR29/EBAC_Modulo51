package com.ebac.modulo39;

public class AbsCharmander extends AbsPokemon {
    public AbsCharmander() {
        super("Charmander", 250, 70);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("SOY UN GRAN POKEMON Y LANZO FUEGO");
    }

    @Override
    public void atacar() {
        System.out.println(this.nombre + " utiliza Lanzallamas!");
    }
}
