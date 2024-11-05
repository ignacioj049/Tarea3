package org.example;

public abstract class Bebida implements Producto {
    private int precio;
    private String nombre;

    public Bebida(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}

class Sprite extends Bebida {
    public Sprite() {
        super(1000, "Sprite");
    }
}

class CocaCola extends Bebida {
    public CocaCola() {
        super(1200, "CocaCola");
    }
}

class Fanta extends Bebida {
    public Fanta() {
        super(1100, "Fanta");
    }
}
