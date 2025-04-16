package com.ebac.modulo47;
import static java.lang.StringTemplate.STR;

public class MyStringTemplate {
    public static void main(String[] args) {
        String procesadorStr = usoDelProcesadorStr("Kevin", "Rojas", "Guadalajara");
        System.out.println(procesadorStr);
    }

    static String usoDelProcesadorStr(String nombre, String apellido, String ciudad){
        return STR."""
                {
                    "Nombre": "\{nombre}",
                    "Apellido": "\{apellido}",
                    "Ciudad": "\{ciudad}"
                }
                """ ;
    }
}
