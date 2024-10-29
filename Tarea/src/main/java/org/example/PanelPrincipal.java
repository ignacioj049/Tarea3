import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelExpendedor panelExpendedor;
    private PanelComprador panelComprador;

    public PanelPrincipal() {
        setBackground(Color.WHITE);
        panelExpendedor = new PanelExpendedor();
        panelComprador = new PanelComprador();

        setLayout(new BorderLayout());
        add(panelExpendedor, BorderLayout.CENTER);
        add(panelComprador, BorderLayout.SOUTH);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        panelExpendedor.paintComponent(g);
        panelComprador.paintComponent(g);
    }
}
