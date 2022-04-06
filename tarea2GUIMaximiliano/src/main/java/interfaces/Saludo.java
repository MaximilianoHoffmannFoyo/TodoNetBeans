package interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.event.*;

public class Saludo extends JPanel {

    // Componentes gráficos: un botón y un área de texto
    private JButton botonSaludar, botonDespedir;
    private JTextArea texto;

    public Saludo() {
        initComponents();
    }

    private void initComponents() {
        // Tamaño del panel
        this.setPreferredSize(new Dimension(600, 200));

        // Borde del panel
        this.setBorder(new TitledBorder("Borde del panel"));

        // Creamos el botón, con un texto a mostrar
        botonSaludar = new JButton("Saludar");
        botonDespedir = new JButton("Saludar");

        // Creamos el textArea de una fila por 25 columnas
        texto = new JTextArea(1, 25);

        // Establecemos el color de fondo del textArea
        texto.setBackground(Color.ORANGE);

        // Posicionamiento de componentes con FlowLayout
        this.setLayout(new FlowLayout());

        // Añadimos los componentes al panel
        this.add(botonSaludar);
        this.add(texto);

        // Se le indica al objeto boton que escuche eventos tipo click
        // y se pasa como argumento una referencia de tipo ActionListener
        // En este caso se pasa this que es el panel sobre el 
        // que está el botón y que implementa la interfaz ActionListener
        botonSaludar.addActionListener((ActionListener) this);

        // Añadimos el botón al panel
        this.add(botonDespedir);
        // Controlador del evento
        botonDespedir.addActionListener((ActionListener) this);

    }

    public void actionPerformed(ActionEvent ae) {

        // Este ejemplo es tan básico que no hemos usado el objeto ae
        // Indicamos el texto que queremos mostrar en el área de texto
        
        // Si el botón pulsado es botonSaludar
        if(ae.getSource() == botonSaludar){
            texto.setText("Hola amigos!!");
        } else { 
            texto.setText("Adios amigos!!");
        }

    }

}
