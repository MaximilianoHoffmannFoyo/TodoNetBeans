package act12;

import act3.Persona;

/*CuentaAhorro: Esta cuenta tiene como atributos el interés variable y la 
comisión anual que se cobra por mantenimiento. Incluir métodos getters, setters y toString().
 */
public class CuentaAhorro extends Cuenta {

    private double interes;
    private double comision;

    public CuentaAhorro(Persona cliente) {
        super(cliente);
    }

    public CuentaAhorro(double interes, double comision, Persona cliente) {
        super(cliente);
        this.interes = interes;
        this.comision = comision;
    }

    @Override
    public void actualizarSaldo() {
        this.setSaldo((this.getSaldo()+(this.getSaldo()*(this.interes/100)))-this.comision);
    }

    @Override
    public void retirar(double gasto) {
        if (this.getSaldo() > 0) {
            if (this.getSaldo() - gasto >= 0) {
                this.setSaldo(this.getSaldo() - gasto);
            }else{
                System.out.println("Intentas sacar más de lo que tienes");
            }
        } else {
            System.out.println("No te queda dinero, no se retiro nada");
        }
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "interes=" + interes + ", comision=" + comision + '}';
    }

}
