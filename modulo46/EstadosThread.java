package com.ebac.modulo46;

public class EstadosThread implements Runnable{

    static Thread tEspera;

    public static void main(String[] args) throws InterruptedException {
        //Estado New
        Thread thread = new Thread("Nuevo Thread");
        System.out.println("Estado del thread: " + thread.getState());

        //Estado Runnable
        thread.start();
        System.out.println("Estado del thread: " + thread.getState());

        //Estado Espera
        tEspera = new Thread(new EstadosThread(), "Mi thread en Espera");
        tEspera.start();

        //Estado en Tiempo de Espera
        Thread threadTimed = new Thread(new ThreadTimedWaiting(), "Thread de tiempo de espera");
        threadTimed.start();

        Thread.sleep(600);
        System.out.println("Estado del thread: " + threadTimed.getState());

        //Estado Terminado
        Thread.sleep(1000);
        System.out.println("Estado del thread: " + thread.getState());

        //Estado Bloqueado
        Thread tBloqueado = new Thread(new ThreadBloqueado());
        Thread tBloqueado2 = new Thread(new ThreadBloqueado());
        tBloqueado.start();
        tBloqueado2.start();
        Thread.sleep(500);
        System.out.println("Estado del thread: " + tBloqueado2.getState());
        System.exit(0);
    }

    @Override
    public void run(){
        Thread thread = new Thread(new ThreadEspera(tEspera));
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class ThreadBloqueado implements Runnable{
    @Override
    public void run() {
        ejecucionInfinita();
    }

    private static synchronized void ejecucionInfinita() {
        while (true) {}
    }
}

class ThreadEspera implements Runnable{
    private final Thread thread;

    public ThreadEspera(Thread thread){
        this.thread = thread;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Estado del thread: " + thread.getState());
    }
}

class ThreadTimedWaiting implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}