package org.example;

public class Comprador {
    private Producto productoComprado;
    private Moneda vuelto;

    public Comprador(Moneda moneda, int numDeposito, Expendedor expendedor) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        this.productoComprado = expendedor.comprarProducto(moneda, numDeposito);
        this.vuelto = expendedor.getVuelto();
    }

    public String queBebiste() {
        if (productoComprado instanceof Bebida) {
            return ((Bebida) productoComprado).beber();
        }
        return productoComprado.getNombre();
    }

    public Moneda cuantoVuelto() {
        return vuelto;
    }
}
