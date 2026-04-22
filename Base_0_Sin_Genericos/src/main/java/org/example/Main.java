package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        add(31.5, 78.2);

        Store store = new Store();
        store.setItem(30);
        // Evitar estas conversiones
        Integer item = (Integer) store.getItem();
        System.out.println("El valor del item es " + item);

        Store store1 = new Store();
        store1.setItem(30.4);
        Double item2 = (Double) store1.getItem();
        System.out.println("El valor del item es " + item2);

        // Generamos un error, pasando un dato Float y convirtiendolo en Double:
        Store store2 = new Store();
        store1.setItem(30.4f);
        Double item3 = (Double) store1.getItem();
        System.out.println("El valor del item es " + item3);


    }

    // sobrecarga de metodos para la misma funcionalidad

    public static void add(int num1, int num2){
        int result = num1 + num2;
        System.out.println("El resultado de la suma entre el numero 1: "
        + num1 + " y el numero2" + num2 +" es " + result );
    }

    public static void add(double num1, double num2){
        double result = num1 + num2;
        System.out.println("El resultado de la suma entre el numero 1: "
                + num1 + " y el numero2" + num2 +" es " + result );
    }

}