package daw.maximiliano;

import javax.swing.JOptionPane;

public class Prueba {

    public static void main(String[] args) {/**/
/*Crea dos libros con el constructor por defecto. Muestra por consola 
        los datos de estos libros usando el método toString. */
        LibroElectronico libro1 = new LibroElectronico();
        LibroElectronico libro2 = new LibroElectronico();

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

/*Crea dos libros con el constructor parametrizado, con los datos que tú quieras.
Usando JOption y toString, muestra los datos estos objetos.*/
        LibroElectronico libro3 = new LibroElectronico(
                "El castillo ambulante", 500, 7);
        LibroElectronico libro4 = new LibroElectronico(
                "La piedra filosofal", 280, 4);

        JOptionPane.showMessageDialog(null, libro3.toString());
        JOptionPane.showMessageDialog(null, libro4.toString());

/*Prueba a crear un nuevo libro con 12000 páginas y 12 MB. Muestra los datos 
        de este objeto usando la consola y toString*/        
        LibroElectronico libro5 = new LibroElectronico(
                "El motorista fantasma", 12000, 12);
        System.out.println(libro5.toString());

/*Establece 13000 páginas en el primer libro creado. Muestra los datos de 
        este objeto usando la consola y toString.*/        
        libro1.setNumeroTotalPaginas(13000);
        System.out.println(libro1.toString());

/*Establece como tamaño 15MB en el segundo libro creado. Muestra los datos de
        este objeto usando la consola y toString.*/        
        libro2.setTamanoLibroMB(15);
        System.out.println(libro2.toString());

/*Prueba los métodos pasarPagina(), retrocederPagina() y saltar(int) con 
        cualquiera de los libros creados y muestra los datos por consola 
        para comprobar su funcionamiento.*/        
        //pruebas basicas
        System.out.println("\nlibro 3:");
        
        //pasarPagina
        libro3.pasarPagina();
        System.out.println("pasarPagina");
        System.out.println(libro3.getNumeroPaginaActual());
        
        //retrocederPagina
        libro3.retrocederPagina();
        System.out.println("retrocederPagina");
        System.out.println(libro3.getNumeroPaginaActual());
        
        //Saltar hacia delante
        libro3.saltar(50);
        System.out.println("saltar(50)");
        System.out.println(libro3.getNumeroPaginaActual());
        
        //Saltar hacia atras
        libro3.saltar(-25);
        System.out.println("saltar(-25)");
        System.out.println(libro3.getNumeroPaginaActual());
        
        
        //pruebas para sobrepasarse
        System.out.println("\nlibro 4:");
        
        libro4.saltar(279);
        System.out.println("actual "+libro4.getNumeroPaginaActual());
        System.out.println("pasarPagina");
        libro4.pasarPagina();
        System.out.println("despues "+libro4.getNumeroPaginaActual());
        
        libro4.saltar(-279);
        System.out.println("actual "+libro4.getNumeroPaginaActual());
        System.out.println("retrocederPagina");
        libro4.retrocederPagina();
        System.out.println("despues "+libro4.getNumeroPaginaActual());
        
        libro4.saltar(279);
        System.out.println("actual "+libro4.getNumeroPaginaActual());
        System.out.println("saltar(50)");
        libro4.saltar(50);
        System.out.println("despues "+libro4.getNumeroPaginaActual());
        
        libro4.saltar(-279);
        System.out.println("actual "+libro4.getNumeroPaginaActual());
        System.out.println("saltar(-50)");
        libro4.saltar(-50);
        System.out.println("despues "+libro4.getNumeroPaginaActual());
    }
}
