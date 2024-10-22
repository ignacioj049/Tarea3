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