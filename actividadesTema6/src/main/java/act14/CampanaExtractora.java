package act14;

/*Añadir la clase CampanaExtractora, que extiende de Electrodoméstico. No implementa la interfaz Silencioso.
Tiene un atributo que indica los decibelios(dB) que emite en funcionamiento, teniendo en cuenta que no puede 
ser inferior a 50dB. Incluye constructores, getters, setters y toString.
 */
public class CampanaExtractora extends Electrodomestico {
    
    private double decibelios;

    public CampanaExtractora(double decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        if (decibelios > 50) {
            this.decibelios = decibelios;
        }else{
            this.decibelios = 50;
        }
    }

    public double getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(double decibelios) {
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        return "CampanaExtractora{" + "decibelios=" + decibelios + '}';
    }
    
    
}
