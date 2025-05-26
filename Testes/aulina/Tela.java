package aulina;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Tela extends JFrame{

    private static JLabel directionlLabel = new JLabel("Inisira");
    private static JLabel outputLabel = new JLabel("");
    private static JTextField nameBox = new JTextField(25);
    public static JButton nameButton = new JButton("crica me");
    public Tela(){
    JFrame Tela = new JFrame();

    
    Tela.setVisible(true);
    Tela.setBounds(0,0,800,500);
    Tela.setTitle("Bulebebe");
    Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//operação de fechar
    Tela.setResizable(false);//sem isso a pagina pode mudar de tamanho
    Tela.setLocationRelativeTo(null);//deixa centralizado
    Tela.setLayout(new FlowLayout());//isso deixa tudo alinhado :)

    //muda o icone
   //ImageIcon icon = new ImageIcon(getClass().getResource("bobs.png"));    
    //Image image = icon.getImage();
    //Tela.setIconImage(image);


           //adiciona um action listener pra fazer ações 
        nameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                buttonClick(e);
            }
        });

        

        //adiciona aqui os obj
        //Tela.setLayout(new GridLayout(3,2));
        // Linhas , Colunas

        //cor do fundo
        Tela.getContentPane().setBackground(new Color(253,240,213));
        //Cor do fundo do text area
        nameBox.setBackground(new Color(0,48,73));
        //cor da letra do text area
        nameBox.setForeground(new Color(250,250,250 ));
        //muda fonte
        directionlLabel.setFont(new Font("Mono",Font.ITALIC,18));
        

        directionlLabel.setHorizontalAlignment(JLabel.CENTER);
        Tela.getContentPane().add(directionlLabel);
        Tela.getContentPane().add(nameBox);

        //linha Vazia
        Tela.getContentPane().add(new JLabel());
        Tela.getContentPane().add(new JLabel());
        Tela.getContentPane().add(nameButton);
        Tela.getContentPane().add(outputLabel);

     

    }
    public static void buttonClick(ActionEvent e){
        //aqui é a ação realizada
       //JOptionPane.showMessageDialog(null, "funfa butao","deu ruim", JOptionPane.ERROR_MESSAGE);
       String seu_nome = nameBox.getText();
       String output_message = "gozando no "+seu_nome;
       outputLabel.setText(output_message);
    }
}
