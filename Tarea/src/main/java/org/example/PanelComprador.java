import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    public PanelComprador() {
        setBackground(Color.LIGHT_GRAY);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar la interfaz de selección del comprador
        g.setColor(Color.BLUE);
        g.drawString("Seleccione el producto y moneda", 10, 20);
        // Aquí se agregarán más elementos gráficos para representar la selección de productos
    }
}
