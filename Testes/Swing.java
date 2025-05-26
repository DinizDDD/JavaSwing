import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Swing extends JFrame {
    private static JLabel directionsLabel = new JLabel("Enter your name:");
    private static JLabel outputLabel = new JLabel();
    private static JTextField nameBox = new JTextField(25);
    private static JButton nameButton = new JButton("Click Me!!");
    public static void main(String[] args) throws Exception{
        Swing frame = new Swing();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("Test in Swing");

        //frame.setLayout(new FlowLayout());
        frame.setLayout(new GridLayout(3, 2));

        frame.getContentPane().setBackground(new Color(200, 0 , 200 ));
        nameBox.setForeground(new Color(255, 255, 255));

        directionsLabel.setFont(new Font("Poppins", Font.BOLD, 20));

        frame.getContentPane().add(directionsLabel);
        frame.getContentPane().add(nameBox);
        frame.getContentPane().add(nameButton);
        frame.getContentPane().add(outputLabel);

        frame.pack(); //basically margin: fit-content

        nameButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ButtonClick(e);
            }

        });



        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    public static void ButtonClick(ActionEvent e){
        //JOptionPane.showMessageDialog(null, "Button Pressed!!", "Hi!",JOptionPane.INFORMATION_MESSAGE);

        String yourname = nameBox.getText();
        String outputMessage = "Hello there " + yourname;
        outputLabel.setText(outputMessage);
    
    
    }
}

