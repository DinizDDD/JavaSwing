package Projeto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextEditor extends JFrame {
    private static JTextArea text;
    private static JFileChooser choose; 
    public static void main(String[] args) throws Exception{
        TextEditor frame = new TextEditor();
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); 
        frame.setTitle("Editor de Texto");

        frame.getContentPane().add(text);
        JScrollPane roll = new JScrollPane(text);
        add(roll, BorderLayout.CENTER);
        
        JMenuBar menu = new JMenuBar();
        JMenu files = new JMenu("Arquivo");
        JMenuItem newarq = new JMenuItem("Novo Arquvio");
        JMenuItem openarq = new JMenuItem("Abrir Arquivo");
        JMenuItem savearq = new JMenuItem("Salvar Arquivo");
        JSeparator line =  new JSeparator();
        JMenuItem exit = new JMenuItem("Sair");
        
        files.add(newarq);
        files.add(openarq);
        files.add(savearq);
        files.add(line);
        files.add(exit);

        menu.add(files);


        




        frame.getContentPane().add(menu);

        




        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
