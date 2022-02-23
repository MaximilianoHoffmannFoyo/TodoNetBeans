package com.mycompany.ejluzmaximiliano;

import java.util.Scanner;

public class ParteB {

    public static void main(String[] args) {
        
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
  
        