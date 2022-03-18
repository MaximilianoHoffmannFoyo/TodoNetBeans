package act12;

import act3.Persona;

/*CuentaCorriente: Cuenta con un interés fijo del 1.5% y un saldo mínimo. 
Incluir métodos getter, setters y toString(). 
 */
public class CuentaCorriente extends Cuenta {
    
    private final double INTERES = 1.5;
    private final double SALDOMINIMO = 100;

    public CuentaCorriente(Persona cliente) {
        super(cliente);
    }
    
    
    @Override
    public void actualizarSaldo(){
        if(this.getSaldo()>=1000){
            this.setSaldo(this.getSaldo()+(SALDOMINIMO*(INTERES/100)));
        }else{
            this.setSaldo(this.getSaldo()+(this.getSaldo()*(INTERES/100)));
        }
    }

    @Override
    public void retirar(double gasto){
        if(this.getSaldo()-gasto>=100){
            this.setSaldo(this.getSaldo()-gasto);
        }
    }

    public double getINTERES() {
        return INTERES;
    }

    public double getSALDOMINIMO() {
        return SALDOMINIMO;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "INTERES=" + INTERES + ", SALDOMINIMO=" + SALDOMINIMO + '}';
    }
    
}
