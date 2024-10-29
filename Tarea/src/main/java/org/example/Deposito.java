package org.example;
import java.util.ArrayList;

public class Deposito<T> {
    private ArrayList<T> items;

    public Deposito() {
        items = new ArrayList<>();
    }

    public void addProducto(T item) {
        items.add(item);
    }

    public T getProducto() {
        if (items.isEmpty()) {
            return null;
        }
        return items.remove(0);
    }

    public void addMoneda(T item) {
        items.add(item);
    }

    public T getMoneda() {
        if (items.isEmpty()) {
            return null;
        }
        return items.remove(0);
    }
}