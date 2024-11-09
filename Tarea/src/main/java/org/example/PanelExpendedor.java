package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelExpendedor extends JPanel {
    private Expendedor expendedor;
    private int productoSeleccionado = -1;

    public PanelExpendedor(Expendedor expendedor) {
        this.expendedor = expendedor;
        setBackground(Color.LIGHT_GRAY);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                productoSeleccionado = obtenerProductoPorPosicion(e.getX(), e.getY());
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GRAY);
        g.fillRect(50, 50, 200, 300);

        // Dibujar productos con su nombre
        g.setColor(Color.BLACK);
        g.drawString("CocaCola", 60, 70);
        g.drawString("Sprite", 60, 90);
        g.drawString("Fanta", 60, 110);
        g.drawString("Snickers", 60, 130);
        g.drawString("Super8", 60, 150);

        // Indicar producto seleccionado
        if (productoSeleccionado != -1) {
            g.setColor(Color.RED);
            g.drawRect(55, 55 + (productoSeleccionado * 20), 190, 20);
        }
    }

    private int obtenerProductoPorPosicion(int x, int y) {
        if (x >= 50 && x <= 250) {
            if (y >= 60 && y <= 80) {
                return 0; // CocaCola
            } else if (y >= 80 && y <= 100) {
                return 1; // Sprite
            } else if (y >= 100 && y <= 120) {
                return 2; // Fanta
            } else if (y >= 120 && y <= 140) {
                return 3; // Snickers
            } else if (y >= 140 && y <= 160) {
                return 4; // Super8
            }
        }
        return -1; // No se seleccionó ningún producto
    }

    public int getProductoSeleccionado() {
        return productoSeleccionado;
    }
}
