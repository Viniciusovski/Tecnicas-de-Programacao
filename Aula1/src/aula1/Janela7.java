package aula1;

import javax.swing.*;
import java.awt.*;

public class Janela7 extends JFrame {

    private JPanel painel1, painel2;
    private JButton salvar, cancelar;
    private JTextArea texto;
    private JLabel mensagem;

    public Janela7() {
        getContentPane().setLayout(new BorderLayout());

        painel1 = new JPanel(new FlowLayout());
        painel2 = new JPanel(new GridLayout(1, 2));

        salvar = new JButton(" Salvar ");
        cancelar = new JButton(" Cancelar ");

        texto = new JTextArea(" Entre com seu texto aqui ..", 10, 20);
        mensagem = new JLabel(" Texto :");

        painel1.add(salvar);
        painel1.add(cancelar);

        painel2.add(mensagem);
        painel2.add(texto);

        getContentPane().add(painel1, BorderLayout.NORTH);
        getContentPane().add(painel2, BorderLayout.CENTER);

        setTitle("Meu Painel ");
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Janela7();
    }
}
