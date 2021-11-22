package aula1;

import javax.swing.*;
import java.awt.*;

public class Janela5 extends JFrame {

    private JButton N, S, E, W, C;

    public Janela5() {
        getContentPane().setLayout(new BorderLayout(5, 5));

        N = new JButton(" Norte ");
        S = new JButton("Sul ");
        E = new JButton(" Leste ");
        W = new JButton(" Oeste ");
        C = new JButton(" Centro ");

        getContentPane().add(N, BorderLayout.NORTH);
        getContentPane().add(S, BorderLayout.SOUTH);
        getContentPane().add(E, BorderLayout.EAST);
        getContentPane().add(W, BorderLayout.WEST);
        getContentPane().add(C, BorderLayout.CENTER);

        setTitle(" Janela 5.0");
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Janela5();
    }
}
