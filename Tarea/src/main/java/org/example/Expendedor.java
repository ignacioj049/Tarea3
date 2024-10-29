package org.example;
public class Expendedor {
    private Deposito<Producto>[] depositos;
    private Deposito<Moneda> depositoVuelto;

    public Expendedor(int cantidad) {
        this.depositos = new Deposito[5]; // 3 bebidas y 2 dulces

        // Llenar mágicamente los depósitos con productos
        this.depositos[0] = new Deposito<>();
        for (int i = 0; i < cantidad; i++) {
            depositos[0].addProducto(new CocaCola(100 + i));
        }

        this.depositos[1] = new Deposito<>();
        for (int i = 0; i < cantidad; i++) {
            depositos[1].addProducto(new Sprite(200 + i));
        }

        this.depositos[2] = new Deposito<>();
        for (int i = 0; i < cantidad; i++) {
            depositos[2].addProducto(new Fanta(300 + i));
        }

        this.depositos[3] = new Deposito<>();
        for (int i = 0; i < cantidad; i++) {
            depositos[3].addProducto(new Snickers(400 + i));
        }

        this.depositos[4] = new Deposito<>();
        for (int i = 0; i < cantidad; i++) {
            depositos[4].addProducto(new Super8(500 + i));
        }

        this.depositoVuelto = new Deposito<>();
    }

    public Producto comprarProducto(Moneda moneda, int numDeposito) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        if (moneda == null) {
            throw new PagoIncorrectoException("Moneda es nula");
        }

        if (numDeposito < 0 || numDeposito >= depositos.length) {
            throw new NoHayProductoException("Número de depósito inválido");
        }

        Producto producto = depositos[numDeposito].getProducto();
        if (producto == null) {
            depositoVuelto.addMoneda(moneda);
            throw new NoHayProductoException("No hay producto disponible");
        }

        if (moneda.getValor() < producto.getPrecio()) {
            depositoVuelto.addMoneda(moneda); // Devolver la moneda como vuelto
            throw new PagoInsuficienteException("Pago insuficiente");
        }

        int vuelto = moneda.getValor() - producto.getPrecio();
        while (vuelto >= 100) {
            depositoVuelto.addMoneda(new Moneda.Moneda100());
            vuelto -= 100;
        }

        return producto;
    }

    public Moneda getVuelto() {
        return depositoVuelto.getMoneda();
    }
}