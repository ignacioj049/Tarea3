package org.example;
abstract class Dulce extends Producto {
    public Dulce(int precio, String nombre) {
        super(precio, nombre);
    }
}

class Snickers extends Dulce {
    public Snickers() {
        super(500, "Snickers");
    }
}

class Super8 extends Dulce {
    public Super8() {
        super(300, "Super8");
    }
}


