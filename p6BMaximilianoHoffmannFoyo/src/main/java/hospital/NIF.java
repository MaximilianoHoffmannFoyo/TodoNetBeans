package hospital;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NIF {
    
    private String numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public NIF(String numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.letra = calcularLetra();
        this.fechaCaducidad = fechaCaducidad;
    }
    
    private char calcularLetra(){
        int numeroBueno = Integer.parseInt(numero);
        int resto = numeroBueno % 23;
        
        switch (resto) {
            case 0:
                this.letra = 'T';
                break;
            case 1:
                this.letra = 'R';
                break;
            case 2:
                this.letra = 'W';
                break;
            case 3:
                this.letra = 'A';
                break;
            case 4:
                this.letra = 'G';
                break;
            case 5:
                this.letra = 'M';
                break;
            case 6:
                this.letra = 'Y';
                break;
            case 7:
                this.letra = 'F';
                break;
            case 8:
                this.letra = 'P';
                break;
            case 9:
                this.letra = 'D';
                break;
            case 10:
                this.letra = 'X';
                break;
            case 11:
                this.letra = 'B';
                break;
            case 12:
                this.letra = 'N';
                break;
            case 13:
                this.letra = 'J';
                break;
            case 14:
                this.letra = 'Z';
                break;
            case 15:
                this.letra = 'S';
                break;
            case 16:
                this.letra = 'Q';
                break;
            case 17:
                this.letra = 'V';
                break;
            case 18:
                this.letra = 'H';
                break;
            case 19:
                this.letra = 'L';
                break;
            case 20:
                this.letra = 'C';
                break;
            case 21:
                this.letra = 'K';
                break;
            case 22:
                this.letra = 'E';
                break;
        }
        return this.letra;
    }
    
    public void renovar(LocalDate fechaSolicitudRenovacion){
        this.fechaCaducidad = fechaSolicitudRenovacion.plus(10, ChronoUnit.YEARS);
    }
}
