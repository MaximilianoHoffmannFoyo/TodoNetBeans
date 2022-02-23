package ejercicios;

import javax.swing.JOptionPane;

public class Ej1 {

    public static void main(String[] args) {
        double solucion;
        double solucion2;
        String valorA = JOptionPane.showInputDialog("Introduce el valor de a:");
        String valorB = JOptionPane.showInputDialog("Introduce el valor de b:");
        String valorC = JOptionPane.showInputDialog("Introduce el valor de c:");
        int valorANumero = Integer.parseInt(valorA);
        int valorBNumero = Integer.parseInt(valorB);
        int valorCNumero = Integer.parseInt(valorC);

        if (valorANumero == 0 && valorBNumero == 0) {
            System.out.println("La ecuación no tiene solución.");
        } else if (valorANumero == 0 && valorBNumero != 0) {
            solucion = -valorCNumero / valorBNumero;
            System.out.println("La unica solucion es: " + solucion);
        } else {
            solucion = (-(valorBNumero) + (Math.sqrt(Math.pow(valorBNumero, 2)
                    - 4 * valorANumero * valorCNumero))) / (2 * valorANumero);
            solucion2 = (-valorBNumero - Math.sqrt(Math.pow(valorBNumero, 2)
                    - 4 * valorANumero * valorCNumero)) / 2 * valorANumero;
            System.out.println("Las soluciones son: " + solucion + " y " + solucion2);
        }

    }

}
