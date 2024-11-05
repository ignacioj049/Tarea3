package org.example;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador panelComprador;

    public PanelPrincipal() {
        setLayout(new BorderLayout());
        panelComprador = new PanelComprador();
        add(panelComprador, BorderLayout.CENTER);
    }
}
