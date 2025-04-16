package com.ebac.modulo39;

public class MetodosEstaticos {

    public static int suma(int num1, int num2){
        return(num1 + num2);
    }

    public static int resta(int num1, int num2){
        return(num1 - num2);
    }

    public static void imprimirNumero(int num1){
        System.out.println("El valor de numero almacenado es: " + num1);
    }

    public static boolean esCero(int num1){
        if(num1==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int resultado = 0;
        System.out.println("El valor almacenado es cero? " + MetodosEstaticos.esCero(resultado));
        resultado = MetodosEstaticos.suma(10,5);
        MetodosEstaticos.imprimirNumero(resultado);
        System.out.println("El valor almacenado es cero? " + MetodosEstaticos.esCero(resultado));
        resultado = MetodosEstaticos.resta(resultado,7);
        MetodosEstaticos.imprimirNumero(resultado);
        System.out.println("El valor almacenado es cero? " + MetodosEstaticos.esCero(resultado));
    }
}