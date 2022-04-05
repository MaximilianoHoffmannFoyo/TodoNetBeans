package tienda;

import java.util.ArrayList;
import java.util.Collections;

public class MiTienda {

    public static void main(String[] args) {

        //1º Crea una lista de productos y añade dos objetos de cada tipo de producto distinto (de los posibles) a la misma.
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Pantalon("XL", "levis", "001", 20, 14, "son azules"));//conversion implicita
        listaProductos.add(new Pantalon("M", "levis", "002", 21, 14, "son negros"));//conversion implicita
        listaProductos.add(new Musica("Gun's and Roses", "003", 14, 7, "rock and roll"));//conversion implicita
        listaProductos.add(new Musica("Jonas Brothers", "004", 16, 8, "pop"));//conversion implicita
        listaProductos.add(new LibroDigital(23, "54478325cb6", "008", 11, 10, "libro de aventuras"));//conversion implicita
        listaProductos.add(new LibroDigital(23, "45h624985", "009", 13, 10, "libro de Ci-Fi"));//conversion implicita
        listaProductos.add(new LibroPapel(100, "54b3625435c9", "010", 12, 10, "libro de cocina"));//conversion implicita
        listaProductos.add(new LibroPapel(50, "uvnc8973092", "011", 10, 10, "libro infantil"));//conversion implicita

        //2º Muestra los datos de los productos usando un foreach y el método toString(). Contesta usando un comentario en el código: ¿es toString() un método polimórfico? 
        for (Producto p : listaProductos) {
            System.out.println(p.toString() + "\n");
        }
        /* toString si es un metodo polimorfico, porque es un metodo que se 
        sobre escribe siempre para afectar a la clase donde se encuentra de manera
        diferente a las demas clases donde tambien esta.*/

        //3º Ordena la lista de productos según el precio, haciendo uso de <<Comparator>> y una expresión lambda.
//        Collections.sort(listaProductos, (Producto p1,Producto p2)->p1.getPrecio().compareTo(p2.getPrecio()));
        
        //4º Muestra la lista de productos ordenados por precio.
        System.out.println("\nOrdenados por precio\n");
        for (Producto p : listaProductos) {
            System.out.println(p.getClass() + " " + p.getPrecio() + "\n");
        }

        //5º Ordena la lista de productos según el código, haciendo uso de <<Comparator>> y una expresión lambda.
        Collections.sort(listaProductos, (Producto p1, Producto p2) -> p1.getCodigo().compareTo(p2.getCodigo()));

        //6º Muestra la lista de productos ordenados por código.
        System.out.println("\nOrdenados por codigo\n");
        for (Producto p : listaProductos) {
            System.out.println(p.getClass() + " " + p.getPrecio() + "\n");
        }

        //7º Realiza la búsqueda binaria según su código de algún producto que exista dentro de la lista y otro que no exista, mostrando la posición que ocupa en la lista.
        System.out.println("\nBusqueda binaria producto existente\n");
        System.out.println(
                Collections.binarySearch(listaProductos, listaProductos.get(2), (Producto p1, Producto p2) -> p1.getCodigo().compareTo(p2.getCodigo()))
        );
        System.out.println("\nBusqueda binaria producto no existente\n");
        System.out.println(
                Collections.binarySearch(listaProductos, new Musica("a", "a", 0, 0, "uwe"), (Producto p1, Producto p2) -> p1.getCodigo().compareTo(p2.getCodigo()))
        );

        //8º Recorre la lista de productos y guarda todos los libros en una lista de libros.
        ArrayList<Libro> listaLibros = new ArrayList<>();
        for (Producto p : listaProductos) {
            if (p instanceof Libro) {
                listaLibros.add((Libro) p);//Conversion explicita
            }
        }

        //9º Muestra los datos de la lista de libros usando un foreach y el método toString(). 
        System.out.println("\nMuestra los datos de la lista de libros usando un foreach\n");
        for (Libro l : listaLibros) {
            System.out.println(l.toString() + "\n");
        }

        //10º Ordena los libros según ISBN, haciendo uso de <<Comparable>>.
        Collections.sort(listaLibros, (Libro p1, Libro p2) -> p1.getIsbn().compareTo(p2.getIsbn()));

        //11º Muestra la lista de libros ordenada.
        System.out.println("\nOrdenados por Isbn\n");
        for (Libro l : listaLibros) {
            System.out.println(l.getIsbn() + "\n");
        }

        //12º Recorre de nuevo la lista de libros y en cada iteración, ejecuta enviar() o descargar() en función del tipo de libro.
        System.out.println("\nejecutar enviar() o descargar() en función del tipo del libro\n");
        for (Libro l : listaLibros) {
            if (l instanceof LibroDigital) {
                ((LibroDigital) l).descargar();//Conversion explicita
            } else if (l instanceof LibroPapel) {
                ((LibroPapel) l).enviar("avenida azul nº2");//Conversion explicita
            }
        }

        //14º Utiliza el método contains(Object) sobre la lista de libros para comprobar si existe un libro o no existe.
        System.out.println("\ncomprobar si existe un libro usando contains\n"
                + listaLibros.contains(new LibroPapel(50, "uvnc8973092", "011", 10, 10, "libro infantil"))
        );

        //15º Usando la lista de productos inicial, crea una nueva lista con todos los objetos del tipo <<SeEnvía>>.
        ArrayList<SeEnvia> listaSeEnvia = new ArrayList<>();
        for (Producto p : listaProductos) {
            if (p instanceof SeEnvia) {
                listaSeEnvia.add((SeEnvia) p);//Conversion explicita
            }
        }

        //16º Recorre la lista de objetos <<SeEnvía>> y llama al método de la interfaz.
        System.out.println("\nrecorrer array de SeEnvia y llamar al metodo enviar\n");
        for (SeEnvia s : listaSeEnvia) {
            s.enviar("una calle cualquiera de la mancha");
        }

    }

}
