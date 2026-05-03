package org.example;

//  Podemos usar multiples tipos genericos, separados por comas. Por notacion, los denotamos como letras mayusculas
//  pero no necesariamente tienen que ser letras, pueden ser cadenas como "Key" y "Value" por ejemplo.
public class MyHashTable <K, V> {

    private K key;
    private V value;

    public MyHashTable(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyHashTable{" +  "key=" + key + ", value=" + value + '}';
    }
}
