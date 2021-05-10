import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio6y7 {
    private JList lstGeneraciones;
    private JPanel panel1;
    private JLabel lblMensaje;
    private JButton btnGeneracion6;
    private JButton btnGeneracion7;
    private JScrollPane pnlPrincipal;
    private JButton btnVaciar;

    public Ejercicio6y7() {
        btnGeneracion6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel modelo = new DefaultListModel();
                modelo.addElement("Greninja");
                modelo.addElement("Sylveon");
                modelo.addElement("Aegislash");
                lstGeneraciones.setModel(modelo);
            }
        });
        btnGeneracion7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel modelo = new DefaultListModel();
                modelo.addElement("Mimikyu");
                modelo.addElement("Rowlet");
                modelo.addElement("Decidueye");
                lstGeneraciones.setModel(modelo);
            }
        });

        lstGeneraciones.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //lblMensaje.setText(lstGeneraciones.getSelectedValuesList().toString());
                String mensaje;
                mensaje = lstGeneraciones.getSelectedValuesList().toString();
                lblMensaje.setText(mensaje);

            }
        });

        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel modelo = new DefaultListModel();
                lstGeneraciones.setModel(modelo);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio6y7");
        frame.setContentPane(new Ejercicio6y7().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
