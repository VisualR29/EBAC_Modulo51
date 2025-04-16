package com.ebac.modulo46;

public class WaitNotify {
    public static void main(String[] args) {
        WaitNotifyThread waitNotifyThread = new WaitNotifyThread();
        waitNotifyThread.start();

        synchronized (waitNotifyThread) {
            try {
                waitNotifyThread.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        System.out.println(waitNotifyThread.contador);

        }
    }
}

class WaitNotifyThread extends Thread{
    public int contador;
    @Override
    public void run() {
        synchronized (this){
            System.out.println("Executing");
            for (int i = 0; i <= 1000; i++){
                contador = i;
            }
            notify();
        }
    }
}