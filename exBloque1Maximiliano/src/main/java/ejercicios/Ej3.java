package ejercicios;

import javax.swing.JOptionPane;

public class Ej3 {

    public static void main(String[] args) {
        double solucion;
        double solucion2;
        int valorANumero = 0;
        int valorBNumero = 0;
        int valorCNumero = 0;
        boolean parar = true;
        boolean parar2 = true;

        do {
            do {
                try {
                    String valorA = JOptionPane.showInputDialog("Introduce el valor de a:");
                    valorANumero = Integer.parseInt(valorA);
                    parar = false;
                } catch (NumberFormatException nfe) {
                    System.out.println("El dato introducido no es valido, vuleve a empezar");
                }

            } while (parar);
            parar = true;
            do {
                try {
                    String valorB = JOptionPane.showInputDialog("Introduce el valor de b:");
                    valorBNumero = Integer.parseInt(valorB);
                    parar = false;
                } catch (NumberFormatException nfe) {
                    System.out.println("El dato introducido no es valido, vuleve a empezar");
                }

            } while (parar);
            parar = true;
            do {
                try {
                    String valorC = JOptionPane.showInputDialog("Introduce el valor de c:");
                    valorCNumero = Integer.parseInt(valorC);
                    parar = false;
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, 
                            "El dato introducido no es valido, intoducelo de nuevo");
                }
            } while (parar);
            if ((valorBNumero * valorBNumero) - 4 * valorANumero * valorCNumero < 0) {
                JOptionPane.showMessageDialog(null, "Tendras que volver a introducir los datos");
            } else {
                parar2 = false;
            }
        } while (parar2);
        if (valorANumero == 0 && valorBNumero == 0) {
            System.out.println("La ecuaci??n no tiene soluci??n.");
        } else if (valorANumero == 0 && valorBNumero != 0) {
            solucion = -valorCNumero / valorBNumero;
            System.out.println("La unica solucion es: " + solucion);
        } else {
            solucion = (-valorBNumero + Math.sqrt(Math.pow(valorBNumero, 2)
                    - 4 * valorANumero * valorCNumero)) / 2 * valorANumero;
            solucion2 = (-valorBNumero - Math.sqrt(Math.pow(valorBNumero, 2)
                    - 4 * valorANumero * valorCNumero)) / 2 * valorANumero;
            System.out.println("Las soluciones son: " + solucion + " y " + solucion2);
        }

    }

}
