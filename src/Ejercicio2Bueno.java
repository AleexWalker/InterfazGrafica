import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2Bueno {
    private JPanel pnlColores;
    private JRadioButton rbnRojo;
    private JRadioButton rbnVerde;
    private JRadioButton rbnAzul;
    private JButton btnAceptar;
    private JPanel pnlPrincipal;
    private JLabel lblMensaje;

    public Ejercicio2Bueno() {

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje="Color elegido: ";
                if (rbnRojo.isSelected()) {
                    mensaje=mensaje+"Rojo";
                }
                else if (rbnVerde.isSelected()) {
                    mensaje=mensaje+"Verde";
                }
                else if (rbnAzul.isSelected()) {
                    mensaje=mensaje+"Azul";
                }
                lblMensaje.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio2Bueno");
        frame.setContentPane(new Ejercicio2Bueno().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}
