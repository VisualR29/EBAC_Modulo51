package com.ebac.modulo49;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class Streams {
    public static void main(String[] args) {

        //Stream Ejemplo
        streamEjemplo();

        //METODOS PARTE 1
        System.out.println("\nMETODOS PARTE 1\n");
        metodosParte1();

        //METODOS PARTE 2
        System.out.println("\nMETODOS PARTE 2\n");
        metodosParte2();

        //METODOS PARTE 3
        System.out.println("\nMETODOS PARTE 3\n");
        metodosParte3();

        //METODOS PARTE 4
        System.out.println("\nMETODOS PARTE 4\n");
        metodosParte4();
    }

    private static void streamEjemplo() {
        System.out.println("Stream Ejemplo");
        Stream<Integer> numeros = Stream.of(5,6,7,8);
        numeros.filter(n -> n > 6)
                .sorted()
                .map(n -> n*2)
                .forEach(System.out::println);
        System.out.println("-----------------------------------------------");
    }

    private static void metodosParte1() {
        //Stream.empty()
        System.out.println("\nStream.empty()");
        Stream<Integer> streamVacio = Stream.empty();
        streamVacio.forEach(System.out::println);

        //Stream.of()
        System.out.println("\nStream.of()");
        Stream<String> streamUnElemento = Stream.of("Hey Java");
        streamUnElemento.forEach(System.out::println);

        System.out.println("\nStream.of() con arreglo");
        Stream<String> streamArray = Stream.of("Hey", "Java", "!!!");
        streamArray.forEach(System.out::println);

        //collection.stream()
        System.out.println("\ncollection.stream()");
        List<Integer> integerList = List.of(1,2,3,4,4,5,6,7,7,8);
        Stream<Integer> streamCollection = integerList.stream();
        streamCollection.forEach(System.out::println);

        //Stream.generate(supplier)
        System.out.println("\nStream.generate(supplier)");
        Stream<Double> numerosAleatorios = Stream.generate(Math::random);
        numerosAleatorios.limit(5)
                .forEach(System.out::println);

        //Stream.iterative(seed, unaryOperator)
        System.out.println("\nStream.iterative(seed, unaryOperator)");
        Stream<Integer> streamIterativo = Stream.iterate(0, n -> n + 1);
        streamIterativo.limit(5).forEach(System.out::println);

        //Stream.iterative(seed, predicate, unaryOperator)
        System.out.println("\nStream.iterative(seed, predicate, unaryOperator)");
        Stream<Integer> streamIterativoPredicado = Stream.iterate(0,n -> n <= 5,n -> n + 1);
        streamIterativoPredicado.forEach(System.out::println);
        System.out.println("-----------------------------------------------");
    }

    public static String aux = "";
    private static void metodosParte2(){
        //filter()
        System.out.println("\nfilter()");
        Stream<String> filterStream = Stream.of("Luis", "Kevin", "Santiago", "Layla");
        filterStream.filter(str -> str.startsWith("L"))
                .forEach(System.out::println);

        //distinct()
        System.out.println("\ndistinct()");
        Stream<Integer> distinctStream = Stream.of(1,2,2,3,4,4,5,6,7,8,8);
        distinctStream.distinct()
                .forEach(System.out::println);

        //limit() y skip()
        System.out.println("\nlimit() y skip()");
        Stream<Double> limitStream = Stream.generate(Math::random);
        limitStream.limit(10).skip(5).forEach(System.out::println);

        //map()
        System.out.println("\nmap()");
        Stream<String> mapString = Stream.of("Luis", "Kevin", "Santiago", "Layla");
        mapString.map(String::length)
                .forEach(System.out::println);

        //sorted()
        System.out.println("\nsorted()");
        Stream<Integer> sortedStream = Stream.of(3,7,4,5,8,1,6);
        sortedStream.limit(6)
                .sorted()
                .skip(4)
                .forEach(System.out::println);

        //peek()
        System.out.println("\npeek()");
        Stream<Integer> sortedPeekStream = Stream.of(3,7,4,5,8,1,6,3,6,4);
        sortedPeekStream
                .peek(System.out::println)
                .distinct()
                .limit(6)
                .sorted()
                .skip(2)
                .forEach(x -> {
                    aux += x;
                });
        System.out.println("\nAuxiliar: "+aux);

        System.out.println("-----------------------------------------------");
    }

    private static void metodosParte3(){

        //count()
        System.out.println("\ncount()");
        Stream<String> stringStream = Stream.of("Nombre", "Luis", "Rojas", "Otros");
        System.out.println(stringStream.count());

        //min()
        System.out.println("\nmin()");
        Stream<Integer> integerStreamMin = Stream.of(5,6,2,7,8);
        Optional<Integer> optionalInteger = integerStreamMin.min(Comparator.naturalOrder());
        System.out.println(optionalInteger.orElse(0));

        //max()
        System.out.println("\nmax()");
        Stream<Integer> integerStreamMax = Stream.of(5,6,2,7,8);
        Optional<Integer> optionalIntegerMax = integerStreamMax.max(Comparator.naturalOrder());
        System.out.println(optionalIntegerMax.orElse(0));


        //findAny()
        System.out.println("\nfindAny()");
        Stream<Integer> integerStreamFindAny = Stream.of(5,6,2,7,8);
        System.out.println(integerStreamFindAny.findAny().orElse(0));

        //findFirst()
        System.out.println("\nfindFirst()");
        Stream<Integer> integerStreamFindFirst = Stream.of(5,6,2,7,8);
        System.out.println(integerStreamFindFirst.findFirst().orElse(0));


        //allMarch()
        System.out.println("\nallMarch()");
        Stream<Integer> integerStreamAllMatch = Stream.of(5,6,2,7,8);
        System.out.println(integerStreamAllMatch.allMatch(n -> n > 6));

        //anyMatch()
        System.out.println("\nanyMatch()");
        Stream<Integer> integerStreamAnyMatch = Stream.of(5,6,2,7,8);
        System.out.println(integerStreamAnyMatch.anyMatch(n -> n > 6));

        //noneMarch()
        System.out.println("\nnoneMarch()");
        Stream<Integer> integerStreamNoneMatch = Stream.of(5,6,2,7,8);
        System.out.println(integerStreamNoneMatch.anyMatch(n -> n > 6));

        //reduce()
        System.out.println("\nreduce()");
        Stream<Integer> integerStreamReduce = Stream.of(5,6,2,7,8);
        System.out.println(integerStreamReduce.reduce(Integer::sum).orElse(0));

        //collect()
        System.out.println("\ncollect()");
        Stream<Integer> integerStreamCollect = Stream.of(5,6,2,7,8);
        List<Integer> integerList = integerStreamCollect.collect(Collectors.toList());
        integerList.forEach(System.out::println);


        System.out.println("-----------------------------------------------");
    }

    private static void metodosParte4(){
        //Streams primitivos
        //IntStream
        System.out.println("\nIntStream");
        Stream<String> stringStream = Stream.of("Luneas", "Martes", "Jueves", "Viernes");
        IntStream intStream = stringStream.mapToInt(String::length);
        intStream.forEach(System.out::println);


        //LongStream
        System.out.println("\nLongStream");
        Stream<Integer> integerLongStream = Stream.of(1,5,6,2,7,4);
        LongStream longStream = integerLongStream.mapToLong(x -> (long) Math.pow(x,x));
        longStream.forEach(System.out::println);

        //DoubleStream
        System.out.println("\nDoubleStream");
        Stream<Integer> integerStream = Stream.of(1,5,6,2,7,4);
        DoubleStream doubleStream = integerStream.mapToDouble(x -> x);
        doubleStream.forEach(System.out::println);


        System.out.println("-----------------------------------------------");
    }
}