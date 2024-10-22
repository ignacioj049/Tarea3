abstract class Dulce extends Producto {
    public Dulce(int serie, String nombre, PrecioProducto precio) {
        super(serie, nombre, precio);
    }
}

class Snickers extends Dulce {
    public Snickers(int serie) {
        super(serie, "Snickers", PrecioProducto.SNICKERS);
    }
}

class Super8 extends Dulce {
    public Super8(int serie) {
        super(serie, "Super8", PrecioProducto.SUPER8);
    }
}