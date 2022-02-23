package com.mycompany.bancomaxi;

import java.util.Scanner;

public class ProgramaViabilidad {

    /*
 	debe decidir si un cliente es "apto" para ser timado por el banco o por el
	contrario, según los datos aportados por el cliente, el banco lo rechaza y
	lo declara "no apto" por no ser rentable.
    
            solicitar su edad y su sueldo bruto mensual
            tener en cuenta que no se conceden préstamos a menores de edad y a mayores de 65 años.
    
	Si la edad es válida,
            solicita cantidad total de pasta que necesita para su hipoteca
            Si esa cantidad que se solicita supera la cantidad resultante de multiplicar
            el sueldo bruto anual del cliente por el factor multiplicativo, entonces la
            hipoteca se rechaza.
	factor multiplicativo es de 5,85
	ejemplo, si un cliente gana al año 30000 pavos, no podría pedir más de 30000*5,85.
    
	Si el cliente ha pasado el filtro de edad y el filtro de la cantidad
            solicita el número de años en los que quiere devolver la hipoteca
            no concede hipotecas a más de 30 años y a menos de cinco
    	si la edad de la persona sumada a los años a devolver el préstamo supera
    	los 75 años, el préstamo se rechaza
     */
    public static void main(String[] args) {
        //Delaramos e inicializamos las constantes
        final double factorMultiplicativo = 5.85;

        Scanner datos = new Scanner(System.in);

        //Preguntamos la edad
        System.out.println("Escibe tu edad: ");
        int edad = datos.nextInt();

        //Comporbamos si esta en el rango de edad valido para continuar
        if (!(edad < 18 || edad > 65)) {
            //Preguntamos el sueldo bruto mensual y
            //la cantidad de dinero que necesita para su hipoteca
            System.out.println("Escribe tu sueldo bruto mensual: ");
            double sueldoMensual = datos.nextDouble();
            System.out.println("Escribe cuanto dinero necesita para su hiopoteca: ");
            double dineroHipoteca = datos.nextDouble();

            if (!(dineroHipoteca > (sueldoMensual * 12) * factorMultiplicativo)) {

                //pedimos los años en los que quiere devolver la hipoteca
                System.out.println("Escribe los años en los que quiere devolver "
                        + "la hipoteca: ");
                int anosHipoteca = datos.nextInt();

                //Conprobamos si el rango de años es aceptable y si la edad 
                //más los años de prestamo no supera los 75
                if (!(anosHipoteca < 5 || anosHipoteca > 30) && edad + anosHipoteca <= 75) {
                    System.out.println("Henorabuena, usted cumple los requisitos"
                            + " para ser timado");

                    //Si los años de devolucion no estan entre 5 y 30 o la edad de 
                    //la persona sumada a los años a devolver el préstamo supera 
                    //los 75 años, el préstamo se rechaza
                } else {
                    System.out.println("NO es apto, no es rentable para el timo");
                }
                //si el dinero que pide es mas que el dinero que cobra al año por el 
                //factor multiplicativo no es apto
            } else {
                System.out.println("NO es apto, no es rentable para el timo");
            }
            //si no esta en el rango de edad no es apto
        } else {
            System.out.println("NO es apto, no es rentable para el timo");
        }

    }
}
