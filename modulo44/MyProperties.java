package com.ebac.modulo44;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class MyProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("nombre", "Andres");
        properties.setProperty("correo", "Andres@gmail.com");
        properties.setProperty("genero", "Masculino");
        properties.setProperty("direccion", "Centro 31200");

        System.out.println("Properties inicial: " + properties);

        properties.forEach((k, v) -> System.out.println("Clave: " + k + " | Valor: " + v));
        System.out.println("-----------------------");

        System.out.println("Valores: " + properties.values());
        System.out.println("Claves: " + properties.keySet());
        System.out.println("-----------------------");

        System.out.println("Número de elementos: " + properties.size());
        System.out.println("Eliminando clave 3: " + properties.remove("3"));
        System.out.println("¿Existe la clave 2?: " + properties.containsKey("2"));
        System.out.println("Valor de la clave 4: " + properties.getProperty("4"));
        System.out.println("¿Contiene el valor 'Negro'?: " + properties.containsValue("Negro"));
        System.out.println("Valor por defecto cuando no existe clave 99: " + properties.getProperty("99", "No encontrado"));

        properties.setProperty("5", "Blanco");
        System.out.println("Después de reemplazar clave 5: " + properties);

        properties.putIfAbsent("6", "Gris");
        System.out.println("Después de agregar clave 6 si estaba ausente: " + properties);

        System.out.println("-----------------------");

        properties.store(new FileWriter("archivo.properties"), "Archivo de properties");
        properties.storeToXML(new FileOutputStream("archivo.xml"),"archivo.properties.xml");


        Properties archivoProperties = new Properties();
        archivoProperties.load(new FileReader("archivo.properties"));
        archivoProperties.forEach((k,v) -> System.out.println("archivoXML" + k + " - " + v));
    }
}
