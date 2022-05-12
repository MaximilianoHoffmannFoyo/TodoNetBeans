package ejercicio4;

import java.util.ArrayList;

public class Precipitaciones {

    private ArrayList<Integer> fecha;
    private String estacionMeteorologica;
    private String provincia;
    private double precipitacion;

    public Precipitaciones() {
    }

    public Precipitaciones(ArrayList<Integer> fecha, String estacionMeteorologica, String provincia, double precipitacion) {
        this.fecha = fecha;
        this.estacionMeteorologica = estacionMeteorologica;
        this.provincia = provincia;
        this.precipitacion = precipitacion;
    }

    public double getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(double precipitacion) {
        this.precipitacion = precipitacion;
    }

    public ArrayList<Integer> getFecha() {
        return fecha;
    }

    public void setFecha(ArrayList<Integer> fecha) {
        this.fecha = fecha;
    }

    public String getEstacionMeteorologica() {
        return estacionMeteorologica;
    }

    public void setEstacionMeteorologica(String estacionMeteorologica) {
        this.estacionMeteorologica = estacionMeteorologica;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Precipitaciones{" + "fecha=" + fecha + ", estacionMeteorologica=" + estacionMeteorologica + ", provincia=" + provincia + ", precipitacion=" + precipitacion + '}';
    }

}
