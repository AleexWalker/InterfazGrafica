import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio18 {
    private JPanel pnlPrincipal;
    private JComboBox cmbGeneraciones;
    private JPanel pnlMaestro;
    private JPanel pnlDetalle;
    private JCheckBox[] arrayCheckBoxGeneraciones;

    public Ejercicio18() {
        pnlDetalle.setLayout(new GridLayout(10,1));
        arrayCheckBoxGeneraciones = new JCheckBox[10];
        cmbGeneraciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlDetalle.removeAll();
                switch (cmbGeneraciones.getSelectedIndex()+1) {
                    case 1:
                        dibujarPanelDetalle(1);
                        break;
                    case 2:
                        dibujarPanelDetalle(2);
                        break;
                }
                pnlDetalle.doLayout();
            }
        });
    }

    public void dibujarPanelDetalle(int generacion){
        pnlDetalle.removeAll();
        for (int i = 1 ; i <= 10 ; i++){
            JCheckBox checkBox = new JCheckBox();
            checkBox.setText("Generación " + generacion + " - Pokemon " + i);
            pnlDetalle.add(checkBox);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio18");
        frame.setContentPane(new Ejercicio18().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(100 , 100 , 854 , 480);
    }
}
