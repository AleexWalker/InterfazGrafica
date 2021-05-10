import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio3y4 {
    private JPanel pnlPrincipal;
    private JList lstHabilidades;
    private JLabel lblMensaje;

    /*public Ejercicio3y4() {
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje;mensaje = "La/s habilidad/es seleccionada/s es/son: "
                        + lstHabilidades.getSelectedValuesList().toString();lblMensaje.setText(mensaje);
            }
        });
    }*/


    public Ejercicio3y4() {
        lstHabilidades.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String mensaje;mensaje = "La/s habilidad/es seleccionada/s es/son: "
                        + lstHabilidades.getSelectedValuesList().toString();lblMensaje.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio3y4");
        frame.setContentPane(new Ejercicio3y4().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
