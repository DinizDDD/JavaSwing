import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class EditorDeTextoSimples extends JFrame {

    private JTextArea areaTexto;
    private JFileChooser seletorArquivo;

    public EditorDeTextoSimples() {
        super("Editor de Texto Simples");

        // Área de texto
        areaTexto = new JTextArea();
        JScrollPane rolagem = new JScrollPane(areaTexto);
        add(rolagem, BorderLayout.CENTER);

        // Menu
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuArquivo = new JMenu("Arquivo");

        JMenuItem novoItem = new JMenuItem("Novo");
        JMenuItem abrirItem = new JMenuItem("Abrir");
        JMenuItem salvarItem = new JMenuItem("Salvar");
        JMenuItem sairItem = new JMenuItem("Sair");

        // Ações dos itens do menu
        novoItem.addActionListener(e -> areaTexto.setText(""));

        abrirItem.addActionListener(e -> abrirArquivo());

        salvarItem.addActionListener(e -> salvarArquivo());

        sairItem.addActionListener(e -> System.exit(0));

        // Adiciona itens ao menu
        menuArquivo.add(novoItem);
        menuArquivo.add(abrirItem);
        menuArquivo.add(salvarItem);
        menuArquivo.addSeparator();
        menuArquivo.add(sairItem);

        barraMenu.add(menuArquivo);
        setJMenuBar(barraMenu);

        // Configuração da janela
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza
        setVisible(true);

        seletorArquivo = new JFileChooser();
    }

    private void abrirArquivo() {
        int resultado = seletorArquivo.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File arquivo = seletorArquivo.getSelectedFile();
            try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
                areaTexto.read(leitor, null);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao abrir arquivo: " + ex.getMessage());
            }
        }
    }

    private void salvarArquivo() {
        int resultado = seletorArquivo.showSaveDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File arquivo = seletorArquivo.getSelectedFile();
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo))) {
                areaTexto.write(escritor);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar arquivo: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EditorDeTextoSimples::new);
    }
}
