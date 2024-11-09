package org.example;

public abstract class Producto {
    private int serie;
    private String nombre;
    private PrecioProducto precio;

    public Producto(int serie, String nombre, PrecioProducto precio) {
        this.serie = serie;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSerie() {
        return serie;
    }

    public int getPrecio() {
        return precio.getPrecio();
    }

    @Override
    public String toString() {
        return nombre + " (Serie: " + serie + ")";
    }

    public enum PrecioProducto {
        COCACOLA(700), SPRITE(600), FANTA(500), SNICKERS(400), SUPER8(300);

        private final int precio;

        PrecioProducto(int precio) {
            this.precio = precio;
        }

        public int getPrecio() {
            return precio;
        }
    }
}
