package interfaces;

import javax.swing.JFrame;

public class Test {

    public static void main(String[] args) {
        // Construimos la ventana
        JFrame frame = new JFrame("Datos");
        // La ventana no se puede redimensionar
        frame.setResizable(false);
        // Posición de la ventana
        frame.setLocationRelativeTo(null);
        // Incluimos el panel en la ventana
        frame.add(new Saludo());
        // Ajusta el frame al contenido
//        frame.pack();
        frame.setSize(800, 600);
        // Hacemos visible la ventana
        frame.setVisible(true);
        //Acción por defecto al pulsar el botón de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
