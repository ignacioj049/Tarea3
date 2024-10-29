package org.example;
abstract class Bebida extends Producto {
    public Bebida(int serie, String nombre, PrecioProducto precio) {
        super(serie, nombre, precio);
    }

    public abstract String beber();
}

class Sprite extends Bebida {
    public Sprite(int serie) {
        super(serie, "Sprite", PrecioProducto.SPRITE);
    }

    public String beber() {
        return "sprite";
    }
}

class CocaCola extends Bebida {
    public CocaCola(int serie) {
        super(serie, "CocaCola", PrecioProducto.COCACOLA);
    }

    public String beber() {
        return "cocacola";
    }
}

class Fanta extends Bebida {
    public Fanta(int serie) {
        super(serie, "Fanta", PrecioProducto.FANTA);
    }

    public String beber() {
        return "fanta";
    }
}



