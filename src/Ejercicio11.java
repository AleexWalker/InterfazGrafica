import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio11 {
    private JButton btnSumar;
    private JPanel pnlPrincipal;
    private JButton btnBajar;
    private JButton btnReiniciar;
    private JTextField txtCuadro;
    private int contador = 0;


    public Ejercicio11() {
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++;
                txtCuadro.setText("" + contador);
                if (contador >= 21) {
                    txtCuadro.setText("¡HAS ALCANZADO EL LÍMITE!");
                    contador = 20;
                }
            }
        });
        btnBajar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador--;
                txtCuadro.setText("" + contador);
                if (contador < 0 ) {
                    txtCuadro.setText("¡NO PUEDES QUITAR MÁS PASAJEROS!");
                    contador = 0;
                }
            }
        });
        btnReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador = 0;
                txtCuadro.setText("" + 0);
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio11");
        frame.setContentPane(new Ejercicio11().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
