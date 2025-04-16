package com.ebac.modulo47;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class MyVirtualThreads {
    public static void main(String[] args) {
        ejecucionHilosVirtuales();
    }

    private static void ejecucionHilosVirtuales() {
        long inicio = System.nanoTime();
        ForkJoinPool pool = new ForkJoinPool();
        long resultado = pool.submit(new SumaVirtual(1, 10_000_000)).join();
        long fin = System.nanoTime();

        System.out.println("El resultado es: " + resultado);
        System.out.println("Tiempo de ejecución (ms): " + (fin - inicio) / 1e6);
    }

    static class SumaVirtual extends RecursiveTask<Long> {
        private final long inicio;
        private final long fin;

        public SumaVirtual(long inicio, long fin){
            this.inicio = inicio;
            this.fin = fin;
        }

        @Override
        protected Long compute() {
            long suma = 0;
            for (long i = inicio; i <= fin; i++){
                suma += i;
            }
            return (Long) suma;
        }
    }
}
