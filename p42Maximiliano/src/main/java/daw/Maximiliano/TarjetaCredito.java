package daw.Maximiliano;

import java.time.YearMonth;
import java.lang.Character;
import java.time.DateTimeException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maxi
 */
public class TarjetaCredito {

    private String entidadEmisora;
    private String numero;
    private YearMonth fechaCaducidad;
    private String titular;
    private boolean estado;
    private int pin;
    private double limiteCredito;

    public TarjetaCredito() {
        this.entidadEmisora = "NBank";
        Random aleatorio = new Random();
        String numero = aleatorio.nextInt(16) + "";
        this.numero = numero;
        this.fechaCaducidad = YearMonth.of(2023, 3);
        this.estado = false;
        Random aleatorio2 = new Random();
        int pin = aleatorio2.nextInt(4);
        this.pin = pin;
        this.limiteCredito = 500;
    }

    public TarjetaCredito(String entidadEmisora, String numero, YearMonth fechaCaducidad, String titular, boolean estado, int pin, double limiteCredito) {
        this.entidadEmisora = entidadEmisora;

        if (Comprobar(numero)) {
            this.numero = numero;
        } else {
            Random aleatorio = new Random();
            numero = aleatorio.nextInt(16) + "";
            this.numero = numero;
        }

        boolean resultado = false;
        try {
            YearMonth aux = fechaCaducidad;
            resultado = true;
        } catch (DateTimeException die) {
            resultado = false;
        }
        if (resultado) {
            this.fechaCaducidad = fechaCaducidad;
        } else {
            this.fechaCaducidad = YearMonth.of(2023, 3);
        }

        this.titular = titular;

        this.estado = false;

        String pinS = pin + "";
        if (pinS.length() == 4) {
            this.pin = pin;
        }
        Random aleatorio2 = new Random();
        int pinAleatorio = aleatorio2.nextInt(4);
        this.pin = pinAleatorio;

        if (limiteCredito > 500 && limiteCredito < 3000) {
            this.limiteCredito = limiteCredito;
        }
    }

    private static boolean Comprobar(String numero) {
        boolean resultado = false;
        int si = 0;
        if (numero.length() == 16) {
            for (int i = 0; i < 16; i++) {
                Character a = numero.charAt(i);

                if (Character.isDigit(a)) {
                    si++;
                    if (si == 16) {
                        resultado = true;
                    }
                }
            }
        } else {
            resultado = false;
        }
        return resultado;
    }

    private void Activar() {
        this.estado = true;
    }

    private void Anular() {
        this.estado = false;
    }

    private void Pagar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el pin de la tarjeta:");
        int pin = teclado.nextInt();
        System.out.println("Introduce la cantidad a pagar:");
        double pago = teclado.nextDouble();

        boolean estado = this.estado == true;
        boolean saldo = this.limiteCredito >= pago;
        boolean fecha = this.fechaCaducidad.isBefore(YearMonth.now());
        boolean pinB = this.pin == pin;
        if (estado) {
            if (saldo) {
                if (fecha) {
                    if (pinB) {
                        this.limiteCredito = this.limiteCredito - pago;
                        System.out.println("Se a realizado el pago correctamente");
                    } else {
                        System.out.println("El pin es incoreccto");
                    }
                } else {
                    System.out.println("La tarjeta esta caducada");
                }
            } else {
                System.out.println("No hay suficiente saldo");
            }
        } else {
            System.out.println("La tarjeta está anulada");
        }
    }

    @Override
    public String toString() {
        return "\t" + titular + "\t" + entidadEmisora + "\n"
                + "\t" + fechaCaducidad + "\t" + limiteCredito + "\n"
                + "\t" + numero;
    }

    private static TarjetaCredito Copiar(TarjetaCredito aux) {
        TarjetaCredito aux2 = new TarjetaCredito(aux.entidadEmisora, aux.numero, aux.fechaCaducidad,
                aux.titular, aux.estado, aux.pin, aux.limiteCredito);
        return aux2;
    }
}
