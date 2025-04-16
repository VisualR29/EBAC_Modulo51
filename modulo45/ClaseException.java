package com.ebac.modulo45;

import java.io.FileWriter;
import java.io.IOException;

public class ClaseException {
    public static void main(String[] args) throws IOException {
        crearArchivo("/Users/lesli/archivo.txt");

//        Ruta equivocada
//        crearArchivo("/User/lesli/archivo.txt");

        crearArchivo2("/Users/lesli/archivos.txt");

//        Ruta equivocada
//          crearArchivo2("/User/lesli/archivo.txt");
    }

    public static void crearArchivo(String nombreArchivo){
        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        } finally {
            System.out.println("FINALLY");
        }
    }

    public static void crearArchivo2(String nombreArchivo) throws IOException {
        FileWriter fileWriter = new FileWriter(nombreArchivo);
    }
}
