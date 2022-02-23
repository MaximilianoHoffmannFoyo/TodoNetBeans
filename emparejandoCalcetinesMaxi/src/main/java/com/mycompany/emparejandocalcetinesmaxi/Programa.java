
package com.mycompany.emparejandocalcetinesmaxi;

import java.util.Random;

public class Programa {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        System.out.println(0%2);
        
        CajonCalcetines cajon1 = new CajonCalcetines
        (Calcetin.generarNCalcetinesAleatorios(aleatorio.nextInt(11)+10));
        
        Calcetin.mostrarArrayCalcetines(cajon1.siEmparejados());
//        Calcetin.mostrarArrayCalcetines(Calcetin.generarNCalcetinesAleatorios(10));
        
        
    }
    
}
