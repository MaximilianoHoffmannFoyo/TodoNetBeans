package act12;

import act3.Persona;
import java.util.ArrayList;
import java.util.Random;

/*
Define una clase abstracta Cuenta con los siguientes atributos:

▪     numeroCuenta : String
▪     saldo : double
▪     cliente : atributo de la clase Persona (que tiene nombre y apellidos, y NIF).

La clase Cuenta tiene los siguientes métodos:

▪     Constructor parametrizado que recibe un cliente. El saldo inicial será 0 y 
el número de cuenta se asignará automáticamente en función de algún algoritmo o 
criterio que tú desarrolles. Es evidente que no puede haber números de cuenta duplicados. 
Ten en cuenta que un número de cuenta tiene 20 dígitos.
▪     Getters y setters.
▪     void actualizarSaldo(double). No se implementa, dependerá del tipo de cuenta.
▪    void  retirar(double). No  se implementa, dependerá del tipo de cuenta.

Define las subclases de Cuenta que se describen a continuación:

▪    CuentaCorriente: Cuenta con un interés fijo del 1.5% y un saldo mínimo. 
Incluir métodos getter, setters y toString(). 
▪    CuentaAhorro: Esta cuenta tiene como atributos el interés variable y la 
comisión anual que se cobra por mantenimiento. Incluir métodos getters, setters y toString().

Abonar el interés consiste en incrementar el saldo actual con  la cantidad 
resultante de aplicar el tanto por ciento del interés sobreal saldo de la cuenta. 
Crea un programa que cree varias cuentas y pruebe sus características.

El diagrama UML quedaría así:



 */
public abstract class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private Persona cliente;// : atributo de la clase Persona (que tiene nombre y apellidos, y NIF);

    private static ArrayList<String> numerosCuentaUsados;

    public Cuenta(Persona cliente) {
        this.numeroCuenta = generarNumeroCuenta();
        this.saldo = 0;
        this.cliente = cliente;
    }

    public static String generarNumeroCuenta() {
        Random r = new Random();
        String s = "";
        for (int i = 0; i < 20; i++) {
            s += r.nextInt(10) + 1;
        }

        if (numerosCuentaUsados.contains(s)) {
            return generarNumeroCuenta();
        }else{
            numerosCuentaUsados.add(s);
        }
        return s;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public abstract void actualizarSaldo();

    public abstract void retirar(double saldo);

}
