package aula1;

import javax.swing.*;
import java.awt.*;

public class Janela4 extends JFrame {

    private JLabel texto;
    private JButton salvar;
    private JButton cancelar;

    public Janela4() {
        getContentPane().setLayout(new GridLayout(2, 2));
        // getContentPane().setLayout (new GridLayout (2 ,2 ,5 ,5) ); --> Para gerar espaços entre os elementos
        texto = new JLabel(" Opções :");
        salvar = new JButton(" Salvar ");
        cancelar = new JButton(" Cancelar ");

        getContentPane().add(texto);
        getContentPane().add(salvar);
        getContentPane().add(cancelar);

        setTitle(" Janela 4.0");
        setSize(300, 70);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Janela4();
    }
}
