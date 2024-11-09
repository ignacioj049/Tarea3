package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelComprador extends JPanel {
    private JLabel lblInfo;
    private JTextField txtDinero;
    private JButton btnComprar;
    private Expendedor expendedor;
    private PanelExpendedor panelExpendedor;

    public PanelComprador(Expendedor expendedor, PanelExpendedor panelExpendedor) {
        this.expendedor = expendedor;
        this.panelExpendedor = panelExpendedor;
        setBackground(Color.LIGHT_GRAY);
        setLayout(new FlowLayout());

        lblInfo = new JLabel("Ingrese el dinero y haga la compra:");
        txtDinero = new JTextField(10);
        btnComprar = new JButton("Comprar");

        add(lblInfo);
        add(txtDinero);
        add(btnComprar);

        btnComprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarCompra();
            }
        });
    }

    private void realizarCompra() {
        try {
            int dinero = Integer.parseInt(txtDinero.getText());
            Moneda moneda;
            if (dinero == 1000) {
                moneda = new Moneda.Moneda1000();
            } else if (dinero == 500) {
                moneda = new Moneda.Moneda500();
            } else if (dinero == 100) {
                moneda = new Moneda.Moneda100();
            } else {
                throw new IllegalArgumentException("Monto no válido");
            }

            int productoSeleccionado = panelExpendedor.getProductoSeleccionado();
            if (productoSeleccionado != -1) {
                Producto producto = expendedor.comprarProducto(moneda, productoSeleccionado);
                int vuelto = expendedor.calcularVuelto(dinero, producto.getPrecio());

                String mensajeVuelto = (vuelto > 0) ? "Vuelto: " + vuelto + " pesos" : "Sin vuelto";

                JOptionPane.showMessageDialog(this, "Compra realizada con éxito. Producto: " + producto.getNombre() + "\n" + mensajeVuelto);
            } else {
                JOptionPane.showMessageDialog(this, "No ha seleccionado un producto.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un monto válido.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
