package act3;

/*B) Empleado, especialización de Persona.

Atributos: salario
Métodos: 
- Getter y Setter.
- Constructores (por defecto y parametrizado)
- Método toString(), que sobrescribe el método toString() de la superclase, añadiendo además de los atributos de persona los propios de empleado.
- Un método que permita aumentar el salario en una cantidad que sería pasada como parámetro.

 */
public class Empleado extends Persona{
    
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado() {
    }

    public Empleado(double salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + ", salario=" + salario ;
    }
    
    public void aumentarSalario(double aumento){
        this.salario += aumento;
    }
}
