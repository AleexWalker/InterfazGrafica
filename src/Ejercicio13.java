import javax.swing.*;
import java.awt.event.ComponentAdapter;

public class Ejercicio13 {
    private JPanel pnlPrincipal;
    private JScrollPane scpImagen;
    private JLabel lblImagen;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio13");
        frame.setContentPane(new Ejercicio13().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(550, 550 ,550, 550);
        frame.setVisible(true);
    }
}
