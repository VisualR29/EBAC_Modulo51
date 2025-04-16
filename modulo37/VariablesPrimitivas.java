package com.ebac.modulo37;

public class VariablesPrimitivas {

    public static void main(String[] args) {

        Integer numero = 18;
        Double puntoDecimal = 0.154682;
        Float puntoDecimalF = 3.1415f;
        Boolean encendido = false;
        Character tercerLetraABC = 'C';

        System.out.println("Integer: " + numero);
        System.out.println("Double: " + puntoDecimal);
        System.out.println("Float: " + puntoDecimalF);
        System.out.println("Boolean: " + encendido);
        System.out.println("Character: " + tercerLetraABC);

        System.out.println("METODOS\n" + numero.toString());
        System.out.println(puntoDecimal.isNaN());
        System.out.println(puntoDecimalF.byteValue());
        System.out.println(encendido.compareTo(false));
        System.out.println(tercerLetraABC.charValue());
    }

}
