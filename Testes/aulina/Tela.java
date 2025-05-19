package aulina;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tela  implements ActionListener{
    public Tela(){
    JFrame Tela = new JFrame();

    Tela.setVisible(true);
    Tela.setSize(800,500);
    Tela.setTitle("Bulebebe");
    Tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Tela.setResizable(false);
    Tela.setLocationRelativeTo(null);
    Tela.setLayout(null);

    JButton botao = new JButton("botao");
    botao.setBounds(400,250,150,70);
    botao.setFont(new Font("Arial", Font.ITALIC,20));
    botao.setForeground(new Color(25,255,200));
    botao.setBackground(new Color(20,20,190));
     
    
    JButton botao_baixo = new JButton("botao");
    botao_baixo.setBounds(200,250,150,70);
    botao_baixo.setFont(new Font("Arial", Font.ITALIC,20));
    botao_baixo.setForeground(new Color(25,255,200));
    botao_baixo.setBackground(new Color(20,20,190));

    Tela.add(botao);
    Tela.add(botao_baixo);

    botao.addActionListener(this);
    botao_baixo.addActionListener(this::func);

    }
    public void func(ActionEvent actionEvent){
        JOptionPane.showMessageDialog(null, actionEvent, "NAO", JOptionPane.ERROR_MESSAGE);
    };

    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog( null,"Boraaa");
    }
}
