import javax.swing.*;
import java.awt.*;

public class TextEditor extends JFrame {
    private static JTextArea text;
    private static JFileChooser selectFile;

    public static void main(String[] args) {
        TextEditor frame = new TextEditor();
        frame.setSize(600, 500);
        frame.setVisible(true);
        frame.setTitle("Editor de Texto");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Text area
        text = new JTextArea();
        JScrollPane scroll = new JScrollPane(text);
        frame.add(scroll, BorderLayout.CENTER);

        // Menu bar
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("Arquivo"); // Agora com título

        JMenuItem newarq = new JMenuItem("Novo");
        JMenuItem openarq = new JMenuItem("Abrir");
        JMenuItem savearq = new JMenuItem("Salvar");
        JMenuItem exit = new JMenuItem("Sair");

        newarq.addActionListener(e -> text.setText(""));
        exit.addActionListener(e -> System.exit(0));

        // Organiza o menu
        menu.add(newarq);
        menu.add(openarq);
        menu.add(savearq);
        menu.addSeparator(); // Linha separadora
        menu.add(exit);

        bar.add(menu);
        frame.setJMenuBar(bar);
    }
}
