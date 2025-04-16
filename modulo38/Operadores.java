package com.ebac.modulo38;

import java.sql.SQLOutput;

public class Operadores {

    public static void main(String[] args) {
        int numA = 10, numB = 5;
        int suma = numA + numB;
        int resta = numA - numB;
        int mult = numA * numB;
        double div = numA / numB;
        int incremento = ++numA;
        numA -= 1;
        int decremento = --numA;
        numA += 1;
        numA += 1;
        int modulo = numA % numB;

        System.out.println("OPERADORES ARITMÉTICOS");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + mult);
        System.out.println("División: " + div);
        System.out.println("Incremento: " + incremento);
        System.out.println("Decremento: " + decremento);
        System.out.println("Modulo: " + modulo);

        int siente = 7;
        int cinco = 5;

        System.out.println("\nOPERADORES RELACIÓN");
        System.out.println("5 < 7: " + (cinco<siente));
        System.out.println("5 > 7: " + (cinco>siente));
        System.out.println("5 <= 5: " + (cinco<=cinco));
        System.out.println("5 >= 7: " + (cinco>=siente));
        System.out.println("5 == 7: " + (cinco==siente));
        System.out.println("5 =! 7: " + (cinco!=siente));

        boolean verdad = true;
        boolean falso = false;

        System.out.println("\nOPERADORES LÓGICOS");
        System.out.println("TRUE && TRUE: " + (verdad&&verdad));
        System.out.println("FALSE && TRUE: " + (verdad&&falso));
        System.out.println("FALSE || TRUE: " + (verdad||falso));
        System.out.println("FALSE || FALSE: " + (falso||falso));
        System.out.println("!FALSE: " + !falso);
    }

}
