package com.ebac.modulo43;

import java.util.PriorityQueue;

public class MyPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Tarea> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Tarea("Comer", 4));
        priorityQueue.add(new Tarea("Jugar", 1));
        priorityQueue.add(new Tarea("Trabajo", 5));
        priorityQueue.add(new Tarea("Salida con amigos", 1));
        priorityQueue.add(new Tarea("Tarea", 3));
        priorityQueue.add(new Tarea("Ejercicio", 4));

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}

class Tarea implements Comparable<Tarea>{
    private String nombre;
    private Integer prioridad;

    public Tarea(String nombre, Integer prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }

    @Override
    public int compareTo(Tarea o) {
        return o.getPrioridad() - this.getPrioridad();
    }
}