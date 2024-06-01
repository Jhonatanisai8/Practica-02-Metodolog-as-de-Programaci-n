package org.jhonatan.appPrincipal.Clasess;

/**
 *
 * @author Jhonatan
 */
public class Docente extends Persona {

    private int grado;
    private int horas;
    private double costoHora;

    public Docente(int idPersona, String nombre, String apellidos, String categoria,
            int grado, int horas, double costoHora) {
        super(idPersona, nombre, apellidos, categoria);
        this.grado = grado;
        this.horas = horas;
        this.costoHora = costoHora;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(double costoHora) {
        this.costoHora = costoHora;
    }

    //metodos
    public double calcularSueldo() {
        double sueldo = 0;
        switch (this.getCategoria()) {
            case "A" -> sueldo = (horas * 80);
            case "B" -> sueldo = (horas * 70);
            case "C" -> sueldo = (horas * 50);
        }
        return sueldo;
    }
}
