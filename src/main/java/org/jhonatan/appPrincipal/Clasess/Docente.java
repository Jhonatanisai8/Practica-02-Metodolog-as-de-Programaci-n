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

}
