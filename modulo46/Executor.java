package com.ebac.modulo46;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i < 11; i++) {
            Runnable worker = new Worker("Proceso: " + i);
            executor.execute(worker);
        }

        executor.shutdown();

        while(!executor.isTerminated()){}

        System.out.println("Proceso terminado");
    }
}

class Worker implements Runnable {
    private final String mensaje;

    public Worker(String mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - Mensaje: " + mensaje);
        proceso();
    }

    private void proceso(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
