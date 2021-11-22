package aula1;

import javax.swing.*;
import java.awt.*;

public class Janela3 extends JFrame {

    private JLabel texto;
    private JButton salvar;
    private JButton cancelar;

    public Janela3() {
        getContentPane().setLayout(new FlowLayout());
        texto = new JLabel(" Opções :");
        salvar = new JButton(" Salvar ");
        cancelar = new JButton(" Cancelar ");

        getContentPane().add(texto);
        getContentPane().add(salvar);
        getContentPane().add(cancelar);

        setTitle(" Janela 3.0");
        setSize(300, 70);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Janela3();
    }
}
