package Estructuras_De_Seleccion;

public class Act3 {

    public static void main(String[] args) {
        //a)  Devuelve valor1
        boolean unaCondicion = true;
        String resultado = unaCondicion ? "valor1" : "valor2";

        //b)  Devuelve 100
        int x = 10;
        int y = (x > 9) ? 100 : 200;

        //c)  Devuelve Esta todo vendido
        int publico = 19500;
        int vendidas = 19000;
    int aforo = 2000;
        String status = (publico < aforo) ? "Cabe mas gente": 
        (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
    
    }
    
}
