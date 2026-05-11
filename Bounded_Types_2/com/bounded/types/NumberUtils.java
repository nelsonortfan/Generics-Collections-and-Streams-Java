package com.bounded.types;

public class NumberUtils {

    public static <T extends  Comparable<T> > T minimo(T item1, T item2){


        /*
        Si lo enviaramos asi sin restringir, con Strings por ejemplo
        la condicion < o > no tiene sentido
        if(item1 < item2){
            return item1;
        }
        return item2;
         */

        // Dado que estamos usando la interfaz generica Comparable<T>, podemos usar
        // sus metodos para comparar, si es menor devuelve -1,igual 0 y mayor 1.

        if(item1.compareTo(item2) < 0){
            return item1;
        }
        return item2;
    }

    /* sumar 2 numeros que pueden ser Integers, Doubles o float
         devolvemos double ya que necesitamos un tipo de retorno y este
          es compatible con los otros
         */
    public static  <T extends Number> double add(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }

    /* Toma un array generico T y cuenta cuantas veces cada uno de sus
    elementos es mayor al item T
     */
    public static <T extends Comparable<T>> int countGreaterItems(T[] items, T item) {
        int counter = 0;

        for(T itemArray: items){
            if(itemArray.compareTo(item) > 0){
                counter++;
            }
        }
        return counter;

    }

}
