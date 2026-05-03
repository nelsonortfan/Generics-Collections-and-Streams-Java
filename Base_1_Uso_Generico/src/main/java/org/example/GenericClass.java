package org.example;

public class GenericClass {

    public <T> void myGenericMethod(T item){
        System.out.println("El valor del item es " +  item.toString());
    }

    public <T, V> void multipleParametersGeneric(T item1, V item2){
        System.out.println("El valor del item 1 es " + item1.toString());
        System.out.println("El valor del item 2 es " + item2.toString());
    }

    public <T> T returnGeneric(T item){
        System.out.println("El valor del item a retonar es " + item.toString());
        return item;
    }

    public <T> void printGenericArray(T[] array){
        for(T element: array){
            System.out.println(element);
        }
    }

}

