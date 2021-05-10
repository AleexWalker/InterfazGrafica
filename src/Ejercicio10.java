import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ComponentAdapter;

public class Ejercicio10 {

    private JSpinner spnValor;
    private JPanel pnlPrincipal;
    private JLabel lblMensaje;

    public Ejercicio10() {
        spnValor.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblMensaje.setText("El valor es: " + spnValor.getValue().toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio10");
        frame.setContentPane(new Ejercicio10().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
