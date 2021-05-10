import javax.swing.*;

public class Ejercicio2 {
    private JPanel pnlColores;
    private JRadioButton rojoRadioButton;
    private JRadioButton verdeRadioButton;
    private JRadioButton azulRadioButton;
    private JButton aceptarButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio2");
        frame.setContentPane(new Ejercicio2().pnlColores);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
}

