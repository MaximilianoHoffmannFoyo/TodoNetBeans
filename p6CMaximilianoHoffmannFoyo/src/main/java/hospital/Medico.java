package hospital;

public class Medico extends Empleado{
    
    public String especialidad;

    public Medico() {
    }

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
    public void tratar(Paciente paciente, String medicina){
        System.out.println("El medico "+this.getNombre()+" a tratado al paciente "+paciente+" con "+medicina);
    }
    
    public double calcularIRPF(){
        if(this.especialidad.equals("cirugía")){
            return this.getSalario()*1.25;
        }else{
            return this.getSalario()*1.235;
        }
    }
}
