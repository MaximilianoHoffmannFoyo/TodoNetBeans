package com.mycompany.ejluzmaximiliano;

import java.util.Scanner;

public class ParteA {

    public static void main(String[] args) {
        /*
        La idea es que realices una calculadora de consumo eléctrico, de forma 
        que se pueda introducir el consumo en vatios de un aparato 
        (entre 1 y 4500), las horas que está funcionando al día y el precio 
        del kWh (entre 0.1 y 0.45) para saber cuántos € hay que pagar por el 
        consumo de ese aparato.

        Por ejemplo, una lavadora consume 450Wh y tarda 2.5h en hacer la colada, 
        en total consume 1.12kW en esas dos horas y media. Suponiendo un precio 
        de 0.30€/kWh entonces la lavadora ha gastado en lavar la ropa: 
        1.12kW*0.3€/kWh = 0.33€.        
        */
        
        //Declaracion de variables
        int valorBucle;
        int consumoVatios;
        double horasFuncionamiento;
        double precioKWH;
        int x=2;
        
        //Declaracion de Scanner
        Scanner entrada = new Scanner(System.in);
        
        do {
            //Menu inicial para bucle
            
            System.out.print("Pulsa 1 para ejecutar el programa");
            System.out.println(" o pulsa 0 para acabar: ");
            valorBucle = entrada.nextInt();
            
            
            if(valorBucle == 0){//Acaba con el programa
                System.out.println("Ha querido acabar el programa");
            }else{//Sigue el programa
                
                do{
                    System.out.println("Introduce el consumo en vatios del aparato (De 1 a 4500)");
                    consumoVatios = entrada.nextInt();
                } while(consumoVatios < 1 && consumoVatios > 4500);
                
                System.out.println("Introduce las horas que funciona el aparato");
                horasFuncionamiento = entrada.nextDouble();
                double totalConsumo = (consumoVatios/1000)*horasFuncionamiento;
                
                do{
                    System.out.println("Introduce el precio en centimos del kWh(De 0,1 a 0,45)");
                    precioKWH = entrada.nextDouble();
                } while(precioKWH < 0.1 && precioKWH > 0.45);
                
                double gasto = totalConsumo * precioKWH;
                System.out.println(gasto);
                
                } 
           
        } while (3<x);
    }
}
  
        