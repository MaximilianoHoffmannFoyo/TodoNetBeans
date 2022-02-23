package daw.maximiliano;

import org.apache.commons.lang3.RandomStringUtils;

public class LibroElectronico {//Definicion de la clase

    //Atributos de la clase:
    private String identificador;
    private String titulo;
    private int numeroTotalPaginas;
    private int tamanoLibroMB;
    private int numeroPaginaActual;

    //Metodos:
    //Metodo constructor por defecto:
    public LibroElectronico() {
        this.identificador = RandomStringUtils.randomNumeric(3);
        this.titulo = "Don Quijote de la Mancha";
        this.numeroTotalPaginas = 1435;
        this.tamanoLibroMB = 5;
        this.numeroPaginaActual = 1;
    }

    //Metodo Constructor parametrizado:
    public LibroElectronico(String titulo,
            int numeroTotalPaginas, int tamanoLibroMB) {
        this.identificador = RandomStringUtils.randomNumeric(3);;
        this.titulo = titulo;
        this.numeroPaginaActual = 1;
        if (numeroTotalPaginas < 0) {
            if (numeroTotalPaginas > 9999) {
                this.numeroTotalPaginas = 0;
            } else {
                this.numeroTotalPaginas = numeroTotalPaginas;
            }
        } else {
            this.numeroTotalPaginas = 0;
        }
        if (tamanoLibroMB < 0) {
            if (tamanoLibroMB > 10) {
                this.tamanoLibroMB = 0;
            } else {
                this.tamanoLibroMB = tamanoLibroMB;
            }
        } else {
            this.tamanoLibroMB = 0;
        }
    }

    //Metodos Getter y Setter:
    public String getIdentificador() {
        return identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTotalPaginas() {
        return numeroTotalPaginas;
    }

    public void setNumeroTotalPaginas(int numeroTotalPaginas) {
        if (numeroTotalPaginas < 0) {
            if (numeroTotalPaginas > 9999) {
                this.numeroTotalPaginas = 0;
            } else {
                this.numeroTotalPaginas = numeroTotalPaginas;
            }
        } else {
            this.numeroTotalPaginas = 0;
        }
    }

    public int getTamanoLibroMB() {
        return tamanoLibroMB;
    }

    public void setTamanoLibroMB(int tamanoLibroMB) {
        if (tamanoLibroMB < 0) {
            if (tamanoLibroMB > 10) {
                this.tamanoLibroMB = 0;
            } else {
                this.tamanoLibroMB = tamanoLibroMB;
            }
        } else {
            this.tamanoLibroMB = 0;
        }
    }

    public int getNumeroPaginaActual() {
        return numeroPaginaActual;
    }

    //Metodo toString:
    @Override
    public String toString() {
        return "LibroElectronico{" + "identificador=" + identificador + ", titulo=" + titulo + ", numeroTotalPaginas=" + numeroTotalPaginas + ", tamanoLibroMB=" + tamanoLibroMB + ", numeroPaginaActual=" + numeroPaginaActual + '}';
    }

    //Otros metodos:
    public void pasarPagina() {
        if (this.numeroPaginaActual != this.numeroTotalPaginas) {
            this.numeroPaginaActual++;
        }
    }

    public void retrocederPagina() {
        if (this.numeroPaginaActual != 1) {
            this.numeroPaginaActual--;
        }
    }

    public void saltar(int numero) {
        if (numero > 0) {
            if ((this.numeroPaginaActual + numero) <= this.numeroTotalPaginas) {
                this.numeroPaginaActual += numero;
            }
        } else {
            if ((this.numeroPaginaActual + numero) >= 1) {
                this.numeroPaginaActual += numero;
            }
        }
    }
    /*
    La utilidad de los modificadores public y private es que el modificador 
    public permite ver y usar los atributos y metodos que lo sean fuera de su
    clase y los private es que no permite ver o modificar los atributos y metodos
    directamente, fuera de la clase
     */

}
