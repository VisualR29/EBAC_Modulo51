package com.ebac.modulo41;

public final class MySubSealedClass extends MySealedClass{
    @Override
    public void mensaje() {
        System.out.println("Soy el mensaje de la subclase Sealed");
    }
}
