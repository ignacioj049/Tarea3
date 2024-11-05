package org.example;

import java.util.ArrayList;
import java.util.List;

public class Deposito<T extends Producto> {
    private List<T> productos = new ArrayList<>();

    public void addProducto(T producto) {
        productos.add(producto);
    }

    public T getProducto() throws NoHayProductoException {
        if (productos.isEmpty()) {
            throw new NoHayProductoException("No hay productos disponibles");
        }
        return productos.remove(0);
    }
}
