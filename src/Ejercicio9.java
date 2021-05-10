import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio9 {

    private JSlider sldNivel;
    private JPanel pnlPrincipal;
    private JLabel lblMensaje;

    public Ejercicio9() {


        sldNivel.addComponentListener(new ComponentAdapter() {
        });
        sldNivel.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblMensaje.setText("El nivel del Pokémon es: " + sldNivel.getValue());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio9");
        frame.setContentPane(new Ejercicio9().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
