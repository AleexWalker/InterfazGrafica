import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio5 {
    private JComboBox cmbModoDeJuego;
    private JPanel pnlPrincipal;
    private JLabel lblMensaje;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio5");
        frame.setContentPane(new Ejercicio5().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Ejercicio5() {
        cmbModoDeJuego.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = "El modo de juego elegido es: ";
                mensaje = mensaje+cmbModoDeJuego.getSelectedItem().toString();lblMensaje.setText(mensaje);
            }
        });
    }
}
