package com.ebac.modulo41;

public class ContextoSealed {
    public static void main(String[] args) {
        MySealedClass newClass = new MySubSealedClass();

        newClass.mensaje();
    }
}
