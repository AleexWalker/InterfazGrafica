import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio8 {
    private JComboBox cmbNúmeros;
    private JPanel pnlPrincipal;
    private JButton btnPares;
    private JButton btnImpares;
    private JLabel lblMensaje;

    public Ejercicio8() {
        btnPares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Número 0");
                modelo.addElement("Número 2");
                modelo.addElement("Número 4");
                modelo.addElement("Número 6");
                modelo.addElement("Número 8");
                modelo.addElement("Número 10");

                cmbNúmeros.setModel(modelo);
            }
        });
        btnImpares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                modelo.addElement("Número 1");
                modelo.addElement("Número 3");
                modelo.addElement("Número 5");
                modelo.addElement("Número 7");
                modelo.addElement("Número 9");

                cmbNúmeros.setModel(modelo);
            }
        });
        cmbNúmeros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensaje.setText(cmbNúmeros.getSelectedItem().toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio8");
        frame.setContentPane(new Ejercicio8().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

