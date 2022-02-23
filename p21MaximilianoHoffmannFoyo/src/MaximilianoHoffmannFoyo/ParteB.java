
package MaximilianoHoffmannFoyo;
import javax.swing.JOptionPane;

public class ParteB {

    public static void main(String[] args) {
        //Declaración de las Constantes
        final double HORAS_MAXIMAS_CLASE_PROFESOR_ANO = 150;
        
        
        //Preguntamos el número de Masteres que se van a inpartir para veriguar 
        //el numero de profesores que necesitamos
        //Usamos el JOptionPane para preguntar y luego convertimos a double el 
        //sitring que nos a dado el JOption
        String masteresTotalesTexto = JOptionPane.showInputDialog("¿Cuantos "
                + "másteres va a inpartir la universidad?");
        double masteresTotales = Double.parseDouble(masteresTotalesTexto);
        
        String HorasMaximasClaseMastersAnoTexto = JOptionPane.showInputDialog
                ("¿Cuantos másteres va a inpartir la universidad?");        
        double HorasMaximasClaseMastersAno = Double.parseDouble
                (HorasMaximasClaseMastersAnoTexto);
        
        //Calculamos el número de profesores multiplicando el total de másteres
        // por el numero de horas de cada master y despues dividiendo eso entre 
        // las horas maximas de clase de cada profesor 
        double profesoresTotales = (masteresTotales*HorasMaximasClaseMastersAno)
                /HORAS_MAXIMAS_CLASE_PROFESOR_ANO;
        
        //Redondeamos el resultado de la division anterior con Math.ceil para
        // que se redonde hacia arriba 
        profesoresTotales = Math.ceil(profesoresTotales);
        
        //Mostramos por pantalla el resultado 
        JOptionPane.showMessageDialog(null, "El total de profesores necesarios es: "
                +profesoresTotales);
         
    }
    
}
