package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelPrincipal extends JPanel implements ActionListener {

    // Atributos de la clase (privados)
    private PanelBotones botonera;
    private JTextArea areaTexto;
    private JTextArea historial;
    private int tipoOperacion;
    static private boolean cambioNumero = false;
    static private String numero1 = "";
    static private String numero2 = "";

    // Constructor
    public PanelPrincipal() {
        initComponents();
        tipoOperacion = -1; // No hay operaciones en la calculadora
    }

    // Se inicializan los componentes gráficos y se colocan en el panel
    private void initComponents() {
        // Creamos el panel de botones
        botonera = new PanelBotones();
        // Creamos el área de texto
        areaTexto = new JTextArea(3, 10);
        areaTexto.setEditable(false);
        areaTexto.setBackground(Color.white);
        // Creamos el historial
        historial = new JTextArea(10, 30);
        historial.setEditable(false);
        historial.setBackground(Color.lightGray);

        //Establecemos layout del panel principal
        this.setLayout(new BorderLayout());
        // Colocamos la botonera y el área texto
        this.add(areaTexto, BorderLayout.CENTER);
        this.add(historial, BorderLayout.NORTH);
        this.add(botonera, BorderLayout.SOUTH);

        for (JButton boton : this.botonera.getgrupoBotones()) {
            boton.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        

        // Se obtiene el objeto que desencadena el evento
        Object o = ae.getSource();
        // Si es un botón
        if (o instanceof JButton) {
            areaTexto.setText(areaTexto.getText() + ((JButton) o).getText());
        }

        if (areaTexto.getText().contains("C")) {
            cambioNumero = false;
            areaTexto.setText("");
            numero1 = "";
            numero2 = "";
        }

        if (areaTexto.getText().endsWith("0") || areaTexto.getText().endsWith("1") || areaTexto.getText().endsWith("2") || areaTexto.getText().endsWith("3")
                || areaTexto.getText().endsWith("4") || areaTexto.getText().endsWith("5") || areaTexto.getText().endsWith("6") || areaTexto.getText().endsWith("7")
                || areaTexto.getText().endsWith("8") || areaTexto.getText().endsWith("9")) {

            if (cambioNumero) {
                numero2 += ((JButton) o).getText();
                System.out.println(numero2);
            } else {
                numero1 += ((JButton) o).getText();
                System.out.println(numero1);
            }
        }

        if (areaTexto.getText().endsWith("+") || areaTexto.getText().endsWith("-") || areaTexto.getText().endsWith("*") || areaTexto.getText().endsWith("/")) {
            cambioNumero = true;
        }

        if (areaTexto.getText().endsWith("=")) {
            cambioNumero = false;

            if (areaTexto.getText().contains("+")) {
                historial.setText(historial.getText() + numero1 + "+" + numero2 + " = " + (Double.parseDouble(numero1) + Double.parseDouble(numero2))+"\n");
            } else if (areaTexto.getText().contains("-")) {
                historial.setText(historial.getText() + numero1 + "-" + numero2 + " = " + (Double.parseDouble(numero1) - Double.parseDouble(numero2))+"\n");
            } else if (areaTexto.getText().contains("*")) {
                historial.setText(historial.getText() + numero1 + "*" + numero2 + " = " + (Double.parseDouble(numero1) * Double.parseDouble(numero2))+"\n");
            } else if (areaTexto.getText().contains("/")) {
                historial.setText(historial.getText() + numero1 + "/" + numero2 + " = " + (Double.parseDouble(numero1) / Double.parseDouble(numero2))+"\n");
            }

            areaTexto.setText("");
            numero1 = "";
            numero2 = "";
        }
    }
}
