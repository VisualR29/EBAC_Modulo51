package com.ebac.modulo38;

public class EstructurasCondicionales {

    /*haz uso de variables tipo int y realiza las
    comparaciones que creas necesarias, puedes utilizar
    también variables tipo String para validar cadenas
    con el método equals, etc.*/
    public static void main(String[] args) {
        int edadMinima = 18;
        int edadUsuario = 20;

        if(edadUsuario >= edadMinima){
            System.out.println("CUMPLES CON LA EDAD REQUERIDAD!");
        }else{
            System.out.println("NO PUEDES ACCEDER, NO CUENTAS CON LA EDAD NECESARIA!");
        }

        edadUsuario = 17;

        if(edadUsuario >= edadMinima){
            System.out.println("CUMPLES CON LA EDAD REQUERIDAD!");
        }else{
            System.out.println("NO PUEDES ACCEDER, NO CUENTAS CON LA EDAD NECESARIA!");
        }

        String nombreRegistrado = "OSBALDO";
        String nombreIngresado = "ARMANDO";

        if(nombreIngresado.toUpperCase().equals(nombreRegistrado)){
            System.out.println("ACCESO PERMITIDO\nBIENVENIDO " + nombreRegistrado);
        }else{
            System.out.println("ACCESO DENEGADO\nUSUARIO INCORRECTO");
        }

        nombreIngresado = "Osbaldo";


        if(nombreIngresado.toUpperCase().equals(nombreRegistrado)){
            System.out.println("ACCESO PERMITIDO\nBIENVENIDO " + nombreRegistrado);
        }else{
            System.out.println("ACCESO DENEGADO\nUSUARIO INCORRECTO");
        }
    }

}
