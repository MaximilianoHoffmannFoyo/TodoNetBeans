
package tareaclase5d;

/*Crea una clase de prueba para tu clase Ejército, donde se hagan uso de los métodos anteriores.
 */
public class PruebaEjercitoOrdenado {

    public static void main(String[] args) {
        Soldado s1 = new Soldado("12345678S", "Jorge", "Lopez", "Arteño", 22);
        Soldado s2 = new Soldado("12345679D", "Facundo", "Flores", "Añejo", 22);
        Soldado s3 = new Soldado("12376679A", "Kevin", "Cast", "Gapo", 22);
        Soldado s4 = new Soldado("16737679G", "Pepe", "Guerra", "Añejo", 22);
        
        EjercitoOrdenado e1 = new EjercitoOrdenado();
        
        System.out.println("tiene soldados:"+e1.tieneSoldados());
        System.out.println("numero soldados:"+e1.numeroSoldados());
        
        e1.alistarSoldado(s1);
        e1.alistarSoldado(s2);
        e1.alistarSoldado(s3);
        
        System.out.println("tiene soldados:"+e1.tieneSoldados());
        System.out.println("numero soldados:"+e1.numeroSoldados());
        
        System.out.println("¿esta s1 en el ejercito?:"+e1.siSoldadoEnEjercito(s1));
        System.out.println("¿esta s4 en el ejercito?:"+e1.siSoldadoEnEjercito(s4));

        e1.desmatricularSoldado(s1);
        System.out.println("¿esta s1 en el ejercito?:"+e1.siSoldadoEnEjercito(s1));        
    }
    
}
