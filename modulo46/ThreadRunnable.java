package com.ebac.modulo46;

public class ThreadRunnable {

    public static void main(String[] args) {

        var thread = new ThreadPractica();
        thread.start();

        //Sin asignar un objeto a una variable (Thread)
        (new ThreadPractica()).start();

        var runnable = new Thread (new RunnablePractica());
        runnable.start();

        //Sin asignar un objeto a una variable (Runnable)
        (new Thread(new RunnablePractica())).start();

        //Interfaz de manera directa (Runnable)
        Runnable runnableImplementado = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread utilizando Runnable");
            }
        };
        Thread threadRunnable = new Thread(runnableImplementado);
        threadRunnable.start();

        //Con expresión Lambda (Runnable)
        Runnable runnableLambda = () -> System.out.println("Thread utilizando Runnable con Lambda");
        Thread threadLambda = new Thread(runnableLambda);
        threadLambda.start();
    }
}

class ThreadPractica extends Thread {
    @Override
    public void run() {
        System.out.println("Metodo run extendiendo de la clase Thread");
    }
}

class RunnablePractica implements Runnable {
    @Override
    public void run() {
        System.out.println("Metodo run implementando la interfaz Runnable");
    }
}