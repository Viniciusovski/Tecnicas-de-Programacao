package aula1;

import java.awt.*;
import javax.swing.*;

public class Janela2 extends JFrame {

    // Declaração e instanciação do objeto texto

    JTextArea texto = new JTextArea(" Texto ");

    public Janela2() {
        setTitle(" Exemplo 2");
        setSize(200, 200);
        setVisible(true);
        // Cor da fonte
        texto.setForeground(Color.red);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Adiciona o componente no container
        getContentPane().add(texto);

    }

    public static void main(String[] args) {
        new Janela2();
    }
}
