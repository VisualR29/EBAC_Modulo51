package com.ebac.modulo46;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();
        Runnable runnable = () -> contador.incrementar();

        Thread t1 = new Thread(runnable, "t1");
        Thread t2 = new Thread(runnable, "t2");
        t1.start();
        t2.start();

        Thread.sleep(600);
        System.out.println("---------");

        ContadorSincronizado contadorSincronizado = new ContadorSincronizado();
        Runnable runnableSincronizado = () -> contadorSincronizado.incrementar();

        Thread t1S = new Thread(runnableSincronizado, "t1S");
        Thread t2S = new Thread(runnableSincronizado, "t2S");
        t1S.start();
        t2S.start();


    }
}

class Contador {
    private static int contador = 0;

    public void incrementar(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ++contador;
        System.out.println("Contador NO sincronizado actual: " + contador + " - " + Thread.currentThread().getName());
    }

    public static int getContador() {return contador;}
}

class ContadorSincronizado {
    private static int contador = 0;

    public synchronized void incrementar(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ++contador;
        System.out.println("Contador sincronizado actual: " + contador + " - " + Thread.currentThread().getName());
    }

    public static int getContador() {return contador;}
}