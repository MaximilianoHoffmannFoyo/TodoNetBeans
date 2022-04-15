package interfaces;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
Usando lo aprendido el proyecto de la tarea anterior, realiza los siguientes cambios:
a. Incluye un botón nuevo, con el texto "Generar Aleatorio".
b. Incluye una etiqueta (JLabel) en la que inicialmente se muestre el texto "Número"
c. Añade al botón "Generar Aleatorio" un controlador de eventos, usando clases internas anónimas, de forma 
que al pulsar sobre él, se genere un número aleatorio entre 0 y 10 y se muestre en la etiqueta (JLabel).
d. Añade al botón "Generar Aleatorio" un controlador de eventos del tipo MouseListener, implementado solamente los
métodos mouseEntered y mouseExited, de forma que cuando el ratón se sitúe sobre el botón cambie de color 
(elige uno que te guste) y cuando el ratón salga de la zona del botón, vuelva a su color original.
 */
// Se implementa la interfaz
public class Saludo extends JPanel implements ActionListener {

    private JButton botonNombre, botonApellidos, botonAleatorio;
    private JTextArea texto;
    private JLabel numero;

    public Saludo() {
        initComponents();
    }

    private void initComponents() {

        botonNombre = new JButton("Nombre");
        botonApellidos = new JButton("Apellidos");
        botonAleatorio = new JButton("Generar Aleatorio");
        numero = new JLabel("Número");
        texto = new JTextArea(1, 25);
        texto.setBackground(Color.ORANGE);

        this.setLayout(new FlowLayout());

        this.add(botonNombre);
        this.add(botonApellidos);
        this.add(botonAleatorio);
        this.add(numero);
        this.add(texto);

        // Clase anónima (sin nombre) anidada (dentro de un método)
        botonAleatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonAleatorio1Al10(e);
            }
        });
        botonNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               botonNombreActionPerformed(e);
            }
        });
        botonApellidos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonApellidosActionPerformed(e);
            }
        });
        botonAleatorio.addMouseListener(new MouseListener() {
            public void actionPerformed(ActionEvent e) {
                botonAleatorio1Al10(e);
            }
//mouseEntered y mouseExited, de forma que cuando el ratón se sitúe sobre el botón cambie de color 
//(elige uno que te guste) y cuando el ratón salga de la zona del botón, vuelva a su color original
            @Override
            public void mouseEntered(MouseEvent e) {
                botonAleatorio.setBackground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                botonAleatorio.setBackground(getForeground());
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }
        });

    }

   @Override
    public void actionPerformed(ActionEvent e) {}

    private void botonAleatorio1Al10(ActionEvent e) {
        Random aleatorio = new Random();
        numero.setText((aleatorio.nextInt(10) + 1) + "");
    }

    private void botonNombreActionPerformed(ActionEvent e) {
        texto.setText("Maximiliano");
        texto.setBackground(Color.WHITE);
    }

    private void botonApellidosActionPerformed(ActionEvent e) {
        texto.setText("Hoffmann Foyo");
        texto.setBackground(Color.BLUE);
    }

    

}
