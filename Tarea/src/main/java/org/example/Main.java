public class Main {
    public static void main(String[] args) {
        try {
            Expendedor expendedor = new Expendedor(5); // Sin precio fijo

            Comprador comprador1 = new Comprador(new Moneda.Moneda1000(), 0, expendedor);
            System.out.println("Comprador 1 bebió: " + comprador1.queBebiste());
            System.out.println("Comprador 1 tiene de vuelto: " + comprador1.cuantoVuelto());

            Comprador comprador2 = new Comprador(new Moneda.Moneda500(), 1, expendedor);
            System.out.println("Comprador 2 bebió: " + comprador2.queBebiste());
            System.out.println("Comprador 2 tiene de vuelto: " + comprador2.cuantoVuelto());

            // Compras de dulces
            Comprador comprador3 = new Comprador(new Moneda.Moneda1000(), 3, expendedor);
            System.out.println("Comprador 3 compró: " + comprador3.queBebiste());
            System.out.println("Comprador 3 tiene de vuelto: " + comprador3.cuantoVuelto());

            Comprador comprador4 = new Comprador(new Moneda.Moneda100(), 4, expendedor);
            System.out.println("Comprador 4 compró: " + comprador4.queBebiste());
            System.out.println("Comprador 4 tiene de vuelto: " + comprador4.cuantoVuelto());

            Comprador comprador5 = new Comprador(null, 2, expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException | PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}