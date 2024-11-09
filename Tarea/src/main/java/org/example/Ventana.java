package org.example;

import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana() {
        setTitle("Expendedor de Productos");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Expendedor expendedor = new Expendedor(5);
        add(new PanelPrincipal(expendedor));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ventana ventana = new Ventana();
            ventana.setVisible(true);
        });
    }
}
