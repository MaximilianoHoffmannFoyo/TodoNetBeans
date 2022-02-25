package traductor;

/*
Realiza una clase conteniendo el main() y 10 registros en tu traductor. 
Prueba los métodos realizados.
 */
public class pruebaTraductor {

    public static void main(String[] args) {
        Traductor tra = new Traductor();
        tra.guardarEntrada("river", "río");
        tra.guardarEntrada("song", "canción");
        tra.guardarEntrada("telephone", "teléfono");
        tra.guardarEntrada("booth", "puesto");
        tra.guardarEntrada("police", "policia");
        tra.guardarEntrada("box", "caja");
        tra.guardarEntrada("screwdriver", "destornillador");
        tra.guardarEntrada("sonic", "sonico");
        tra.guardarEntrada("hat", "gorro");
        tra.guardarEntrada("bow tie", "pajarita");

        tra.mostrarContenido();
        
        tra.borrarEntrada("bow tie", "pajarita");
        System.out.println("-------------");
        tra.mostrarContenido();
        
        tra.modificarEntrada("hat", "gorro", "sombrero");
        System.out.println("-------------");
        tra.mostrarContenido();
        
        System.out.println("-------------");
        tra.mostrarPalabrasEspañol();
        System.out.println("-------------");
        tra.mostrarPalabrasIngles();
        
        
        
    }

}
