import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TST {

    public static void main(String[] args){
        // componente JFrame
        JFrame miJFrame = new JFrame("Ejemplo - Java Swing");
        miJFrame.setSize(500,300); 

        // componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);

        JButton botanzin = new JButton("buttanzin");
        // usamos este diseño para centrar los componentes de JPanel
        JTextArea miJTextArea = new JTextArea(5,20); 

        JLabel miJLabel = new JLabel();
        miJLabel.setText("Swing:   ");
        
        botanzin.addActionListener(e -> {

            miJPanel.add(miJLabel);
        });
        miJPanel.setLayout(new GridBagLayout());

        // componente JTextField
       

        // componente JTextArea
        

        // conecta los componentes JLabel y JTextField en JPanel
        
        miJPanel.add(botanzin);
        // conectar Jpanel a JFrame
        miJFrame.add(miJPanel);

        // hacer visible JFrame
        miJFrame.setVisible(true);
    }
}
