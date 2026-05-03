package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Store<String> cadena = new Store<>(); // no es obligatorio pasar el String en el new
        cadena.setItem("Hola Lola");
        String item = cadena.getItem();
        System.out.println("El item obtenido es " + item);

        Store<Integer> numero = new Store<>();
        numero.setItem(12345);
        int item2 = numero.getItem();
        System.out.println("El item obtenido es " + item2);

        // probando multiples genericos
        MyHashTable <String, Integer> myHashTable = new MyHashTable<>("Id",12345);
        System.out.println();
        System.out.println("El valor String del objeto creado es:");
        System.out.println(myHashTable);
        System.out.println();

        // usando metodos genericos
        GenericClass genericClass = new GenericClass();
        genericClass.myGenericMethod(12.4);
        genericClass.myGenericMethod("Una cadena de prueba");
        genericClass.myGenericMethod(76.4F);
        System.out.println();
        // pasando multiples parametros
        genericClass.multipleParametersGeneric("Nombre", "Nelson");
        System.out.println();
        genericClass.multipleParametersGeneric("Edad", 37);
        System.out.println();
        genericClass.multipleParametersGeneric("Casado", false);
        System.out.println();
        // devolviendo parametro Generico
        genericClass.returnGeneric("Lucas");
        System.out.println();
        genericClass.returnGeneric(25.9);

    }
}