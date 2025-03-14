package com.ebac.modulo51;

public class Calculadora {
    public double sumar(double a, double b){
        return a + b;
    }

    public double resta(double a, double b){
        return a - b;
    }

    public double multiplicacion(double a, double b){
        return a * b;
    }

    public double division(double a, double b){
        if (b == 0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        double num1 = 5;
        double num2 = 2;

        System.out.println("+ : " + cal.sumar(num1,num2));
        System.out.println("- : " + cal.resta(num1,num2));
        System.out.println("* : " + cal.multiplicacion(num1,num2));
        System.out.println("/ : " + cal.division(num1,num2));
    }
}
