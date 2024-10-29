package org.example;



public class Comprador {
    private String sabor;
    private int totalVuelto;

    public Comprador(Moneda moneda, int numDeposito, Expendedor expendedor)
            throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        Producto producto = expendedor.comprarProducto(moneda, numDeposito);
        this.sabor = producto.getNombre();

        Moneda vuelto;
        while ((vuelto = expendedor.getVuelto()) != null) {
            totalVuelto += vuelto.getValor();
        }
    }

    public String queBebiste() {
        return sabor;
    }

    public int cuantoVuelto() {
        return totalVuelto;
    }
}
