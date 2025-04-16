package com.ebac.modulo39;

public class Metodos {
    private int id = 1;
    private String nombre;
    private int edad;
    private String trabajo = "Desempleado";

    public Metodos(){}

    public Metodos(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Metodos(int id, String nombre, int edad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void getData(){
        System.out.println("------->\nId: " + this.id + "\nNombre: " + this.nombre + "\nEdad: " + this.edad + "\nTrabajo: " + this.trabajo + "\n------->");
    }

    public int cumpleanios(){
        this.edad++;
        return edad;
    }

    public String cambioNombre(String nombre){
        this.nombre = nombre;
        return this.nombre;
    }

    public void irTrabajar(String trabajo){
        this.trabajo = trabajo;
        System.out.println(this.nombre + " se consiguio trabajo en " + this.trabajo);
    }

    public static void main(String[] args) {
        Metodos metodo = new Metodos(1, "Esteban", 19);
        metodo.getData();
        metodo.cumpleanios();
        System.out.println("Cambio de nombre a " + metodo.cambioNombre("Luis"));
        metodo.irTrabajar("Maquila");
        metodo.getData();
    }
}