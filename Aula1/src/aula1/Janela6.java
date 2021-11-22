package aula1;

import javax.swing.*;
import java.awt.*;

public class Janela6 extends JFrame {

    JButton x = new JButton("OK");

    public Janela6() {
        getContentPane().setLayout(null);
        setVisible(true);
        setSize(200, 200);

        getContentPane().add(x);
        x.setBounds(10, 10, 100, 30);
    }
    public static void main(String[] args) {
        new Janela6();
    }
}
