import javax.swing.*;

public class Ventana extends JFrame {
    public Ventana() {
        setTitle("Expendedor de Productos");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        add(new PanelPrincipal());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Ventana ventana = new Ventana();
            ventana.setVisible(true);
        });
    }
}
