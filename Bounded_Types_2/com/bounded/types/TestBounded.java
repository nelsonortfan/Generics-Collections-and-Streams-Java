package com.bounded.types;

public class TestBounded {

    public static void main(String[] args) {

        // prueba con Integers
        System.out.println(NumberUtils.minimo(12,78));

        // prueba con float
        System.out.println(NumberUtils.minimo(26.7,14.6));

        // prueba con Strings, devuelve la cadena menor en orden alfabetico
        // en este caso funciona porque la clase String implementa por default Comparable
        System.out.println(NumberUtils.minimo("adriana","edwin"));

        // prueba con la clase Person
        System.out.println(NumberUtils.minimo(new Person("Lucas", 14),
                new Person("Bugs Bunny", 16)));

        // prueba de suma con integers
        System.out.println("La suma de enteros es " + NumberUtils.add(12,78));

        // prueba de suma con float
        System.out.println("La suma de floats es " +NumberUtils.add(23.8f,96.7));

        // prueba de suma con double
        System.out.println("La suma de double es " + NumberUtils.add(45.3d,18.2));

        // prueba contador generico
        // con enteros
        Integer [] numeros = {1, 2, 3, 4, 5};
        Integer item = 3;
        System.out.println("El valor de count con enteros es: ");
        System.out.println(NumberUtils.countGreaterItems(numeros, item));

        // prueba contador con doubles
        Double [] numerosDouble = {1.4, 2.1, 3.9, 4.3, 5.1};
        Double itemDouble = 2.0;
        System.out.println("El valor de count con double es: ");
        System.out.println(NumberUtils.countGreaterItems(numerosDouble, itemDouble));

        // prueba contador con String
        String [] letras = {"a", "b", "f", "d", "e"};
        String letra = "c";
        System.out.println("El valor de count con string es: ");
        System.out.println(NumberUtils.countGreaterItems(letras, letra));

    }

}
