package org.example;


// Usar la anotacion diamante y en ella la T para que
// pueda ser usada la variable o metodo asociado
public class Store <T>{

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
