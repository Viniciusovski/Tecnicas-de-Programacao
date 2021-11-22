package aula1;

import java.awt.*;
import javax.swing.*;

public class Janela1 extends JFrame {

    public Janela1() {
        // define Título
        setTitle(" Exemplo ");
        // define Tamanho ( largura , altura )

        setSize(300, 200);
        // define Localização (x,y);

        setLocation(300, 200);
        // Visibilidade : default = false

        setVisible(true);
        // Cor de fundo

        getContentPane().setBackground(Color.red);
        // Fecha a aplicação

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Janela1();
    }
}
