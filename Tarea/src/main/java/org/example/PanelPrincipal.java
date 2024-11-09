package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelPrincipal extends JPanel {
    private PanelExpendedor panelExpendedor;
    private PanelComprador panelComprador;

    public PanelPrincipal(Expendedor expendedor) {
        setLayout(new BorderLayout());

        panelExpendedor = new PanelExpendedor(expendedor);
        panelComprador = new PanelComprador(expendedor, panelExpendedor);

        add(panelExpendedor, BorderLayout.CENTER);
        add(panelComprador, BorderLayout.SOUTH);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Point point = e.getPoint();
                if (panelExpendedor.contains(point)) {
                } else if (panelComprador.contains(point)) {
                }
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
