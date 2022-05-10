package com.mycompany.tarea7cmaximiliano;

import java.util.Objects;

public class HoraDeClase {

    private int identificador;
    private String curso;
    private String profesor;
    private String asignatura;
    private String aula;
    private int diaDeLaSemana;
    private int horaDelDia;

    public HoraDeClase() {
    }

    public HoraDeClase(int identificador, String curso, String profesor, String asignatura, String aula, int diaDeLaSemana, int horaDelDia) {
        this.identificador = identificador;
        this.curso = curso;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.aula = aula;
        this.diaDeLaSemana = diaDeLaSemana;
        this.horaDelDia = horaDelDia;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getDiaDeLaSemana() {
        return diaDeLaSemana;
    }

    public void setDiaDeLaSemana(int diaDeLaSemana) {
        this.diaDeLaSemana = diaDeLaSemana;
    }

    public int getHoraDelDia() {
        return horaDelDia;
    }

    public void setHoraDelDia(int horaDelDia) {
        this.horaDelDia = horaDelDia;
    }

    @Override
    public String toString() {
        return identificador + ";" + curso + ";" + profesor + ";" + asignatura + ";" + aula + ";" + diaDeLaSemana + ";" + horaDelDia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.identificador;
        hash = 79 * hash + Objects.hashCode(this.curso);
        hash = 79 * hash + Objects.hashCode(this.profesor);
        hash = 79 * hash + Objects.hashCode(this.asignatura);
        hash = 79 * hash + Objects.hashCode(this.aula);
        hash = 79 * hash + this.diaDeLaSemana;
        hash = 79 * hash + this.horaDelDia;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HoraDeClase other = (HoraDeClase) obj;
        if (this.identificador != other.identificador) {
            return false;
        }
        if (this.diaDeLaSemana != other.diaDeLaSemana) {
            return false;
        }
        if (this.horaDelDia != other.horaDelDia) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Objects.equals(this.profesor, other.profesor)) {
            return false;
        }
        if (!Objects.equals(this.asignatura, other.asignatura)) {
            return false;
        }
        if (!Objects.equals(this.aula, other.aula)) {
            return false;
        }
        return true;
    }

}
