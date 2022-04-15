package calculadora;

import javax.swing.JFrame;

public class Calculadora {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora");
        frame.setBounds(450, 50, 0, 0);
        frame.add(new PanelPrincipal());

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

    }

}
