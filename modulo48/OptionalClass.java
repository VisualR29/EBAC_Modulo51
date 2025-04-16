package com.ebac.modulo48;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalClass {
    public static void main(String[] args) throws Exception {
        Optional<String> optional = Optional.of("Que tal, Mundo!");

        System.out.println("Valor con get(): " + optional.get());

        System.out.println("¿Tiene valor? " + optional.isPresent());

        System.out.println("¿Está vacío? " + optional.isEmpty());

        System.out.println("Valor con orElse(): " + optional.orElse("En otro caso"));

        Supplier<String> s = () -> "Valor por Supplier";
        System.out.println("Valor con orElseGet(): " + optional.orElseGet(s));

        System.out.println("Valor con orElseThrow(): " + optional.orElseThrow(() -> new Exception("Error personalizado")));
    }
}
