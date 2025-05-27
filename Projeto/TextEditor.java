package Projeto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TextEditor extends JFrame {
    private JTextArea text;
    private JFileChooser selectfile;

    public TextEditor() {
        text = new JTextArea();
        selectfile = new JFileChooser();

        this.add(new JScrollPane(text), BorderLayout.CENTER);

        this.setTitle("Editor de Texto");
        this.setBounds(0, 0, 600, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("Arquivo");

        JMenuItem newarq = new JMenuItem("Novo");
        JMenuItem openarq = new JMenuItem("Abrir");
        JMenuItem savearq = new JMenuItem("Salvar");
        JMenuItem exit = new JMenuItem("Sair");


        menu.add(newarq);
        menu.add(openarq);
        menu.add(savearq);
        menu.addSeparator();
        menu.add(exit);

        bar.add(menu);
        this.setJMenuBar(bar);


        newarq.addActionListener(e -> text.setText(""));
        openarq.addActionListener(e -> OpenNewFile());
        exit.addActionListener(e -> System.exit(0));
    }

    private void OpenNewFile() {
        int result = selectfile.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File arq = selectfile.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(arq))) {
                text.read(reader, null);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Não foi possível abrir o arquivo: " + ex.getMessage());
            }
        }
    }

    private void SaveFile() {
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TextEditor frame = new TextEditor();
            frame.setVisible(true);
        });
    }
}
