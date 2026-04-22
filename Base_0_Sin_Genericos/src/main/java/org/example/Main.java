package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        add(31.5, 78.2);
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