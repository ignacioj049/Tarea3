package org.example;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private Expendedor expendedor;

    public Ventana() {

        setTitle("Expendedor de Productos");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear un expendedor con la cantidad de productos deseada
        expendedor = new Expendedor(5);

        // Configurar el layout principal
        setLayout(new BorderLayout());

        // Añadir el panel principal y el panel de comprador
        add(new PanelPrincipal(expendedor), BorderLayout.CENTER);
        add(new PanelComprador(), BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ventana ventana = new Ventana();
            ventana.setVisible(true);
        });
    }
}
