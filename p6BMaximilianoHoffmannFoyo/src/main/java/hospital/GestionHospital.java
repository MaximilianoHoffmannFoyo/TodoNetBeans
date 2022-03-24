package hospital;

public class GestionHospital {
    
    private Hospital hospital;
    
    public static void main(String[] args) {
        
    }
    
    public Paciente crearPaciente(){
        return new Paciente();
    }
    
    public Medico crearMedico(){
        return new Medico();
    }
    
    public Administrativo crearPersoanlPAS(){
        return new Administrativo();
    }
}
