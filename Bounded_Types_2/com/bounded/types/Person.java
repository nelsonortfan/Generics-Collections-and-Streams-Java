package com.bounded.types;

/*
Hacemos que la clase implemente la interfaz Comparable
para que pueda ser pasada como generico.
 */
public class Person implements Comparable<Person> {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.getAge());
    }
}
