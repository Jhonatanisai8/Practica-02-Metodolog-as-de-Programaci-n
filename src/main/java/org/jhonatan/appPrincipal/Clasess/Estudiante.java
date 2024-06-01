package org.jhonatan.appPrincipal.Clasess;

/**
 *
 * @author Jhonatan
 */
public class Estudiante extends Persona {

    //atributos
    private String escuela;

    //constructor
    public Estudiante(int idPersona, String nombre, String apellidos, String categoria, String escuela) {
        super(idPersona, nombre, apellidos, categoria);
        this.escuela = escuela;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

}
