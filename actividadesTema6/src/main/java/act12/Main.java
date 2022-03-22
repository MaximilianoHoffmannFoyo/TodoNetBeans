
package act12;

import act3.Persona;

public class Main {

    public static void main(String[] args) {
        
        Persona p = new Persona("ache", "4326654g", 21);
        
        CuentaCorriente uno = new CuentaCorriente(p); 
        CuentaAhorro dos = new CuentaAhorro(p);
        
        System.out.println(uno.getNumeroCuenta());
//        System.out.println(dos.toString());
        
            
         
    }
    
}
