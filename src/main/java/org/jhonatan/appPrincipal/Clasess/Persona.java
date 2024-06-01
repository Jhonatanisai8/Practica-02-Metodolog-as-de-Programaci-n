package org.jhonatan.appPrincipal.Clasess;

/**
 *
 * @author Jhonatan
 */
public class Persona {

    //atributos
    private int idPersona;
    private String nombre;
    private String apellidos;
    private String categoria;

    public Persona(int idPersona, String nombre, String apellidos, String categoria) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.categoria = categoria;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String mostrarDatos() {
        return """
               Persona 
               id: Persona=""" + idPersona
                + "\nNombre=" + nombre
                + "\nApellidos=" + apellidos
                + "\nCategoria=" + categoria;
    }

}
