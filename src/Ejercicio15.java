import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio15 extends JFrame implements ActionListener {

    private JMenuBar mnb1;
    private JMenu mnuControles;
    private JMenu mnuTamaño;
    private JMenu mnuColor;
    private JMenuItem mnuItmAltaRes;
    private JMenuItem mnuItmBajaRes;
    private JMenuItem mnuItmRojo;
    private JMenuItem mnuItmVerde;

    public Ejercicio15(){
        mnb1 = new JMenuBar();
        mnuControles = new JMenu();
        mnuTamaño = new JMenu();
        mnuColor = new JMenu();
        mnuItmAltaRes = new JMenuItem();
        mnuItmBajaRes = new JMenuItem();
        mnuItmRojo = new JMenuItem();
        mnuItmVerde = new JMenuItem();

        setJMenuBar(mnb1);

        mnb1.add(mnuControles);

        mnuControles.add(mnuTamaño);
        mnuControles.add(mnuColor);

        mnuTamaño.add(mnuItmAltaRes);
        mnuTamaño.add(mnuItmBajaRes);
        mnuColor.add(mnuItmRojo);
        mnuColor.add(mnuItmVerde);

        mnuItmAltaRes.addActionListener(this);
        mnuItmBajaRes.addActionListener(this);
        mnuItmRojo.addActionListener(this);
        mnuItmVerde.addActionListener(this);

        mnuControles.setText("Controles");
        mnuTamaño.setText("Tamaño de la ventana");
        mnuColor.setText("Color de fondo");
        mnuItmBajaRes.setText("854x480");
        mnuItmAltaRes.setText("1280x720");
        mnuItmRojo.setText("Rojo");
        mnuItmVerde.setText("Verde");
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == mnuItmRojo){
            getContentPane().setBackground(new Color(255, 0 , 0));
        }
        if (e.getSource() == mnuItmVerde){
            getContentPane().setBackground(new Color(0, 255 , 0));
        }
        if (e.getSource() == mnuItmAltaRes){
            setSize(250, 250);
        }
        if (e.getSource() == mnuItmBajaRes){
            setSize(100, 100);
        }
    }

    public static void main(String[] args) {
        Ejercicio15 frm1 = new Ejercicio15();
        frm1.setTitle("EjercicioX");
        frm1.setBounds(100,100,250,250);
        frm1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frm1.setVisible(true);
    }
}

