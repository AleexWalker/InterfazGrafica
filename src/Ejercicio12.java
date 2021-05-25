import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio12 {
    private JPanel pnlPrincipal;
    private JTextField txtEdad;
    private JTextField txtPeso;
    private JTextField txtEstatura;
    private JButton btnCalcular;
    private JTextField lblMensaje;
    private JLabel lblEdad;
    private JLabel lblPeso;
    private JLabel lblEstatura;
    private JLabel lblResultado;
    private double IMC;

    public Ejercicio12() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });
        txtEdad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });
        txtEstatura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });
        txtPeso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });
    }
    public void calcularIMC(){
        if (Integer.parseInt(txtEdad.getText()) < 18)
            lblMensaje.setText("La edad debe ser igual o superior a 18");
        else if (Double.parseDouble(txtPeso.getText()) < 0)
            lblMensaje.setText("No puede ser peso 0 ni negativo");
        else if (Double.parseDouble(txtEstatura.getText() ) < 1.5)
            lblMensaje.setText("La altura debe ser igual o superior a 1.5 metros");
        else
            IMC = Double.parseDouble(txtPeso.getText()) / (Double.parseDouble(txtEstatura.getText()) * Double.parseDouble(txtEstatura.getText()));

        if (IMC < 18.5)
            lblMensaje.setText("Peso inferior al normal");
        else if (IMC < 24.9)
            lblMensaje.setText("Peso normal");
        else if (IMC < 29.9)
            lblMensaje.setText("Peso superior al normal");
        else
            lblMensaje.setText("Obesidad");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio12");
        frame.setContentPane(new Ejercicio12().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
