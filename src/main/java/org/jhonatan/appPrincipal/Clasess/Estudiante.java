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

    //metodos
    //variables
    private final double montoMedicina = 1500;
    private final double montoDerecho = 650;
    private final double montoSistemas = 600;

    public double calcularMonto() {
        double monto = 0;
        switch (this.getCategoria()) {
            case "A":
                switch (this.escuela) {
                    case "Medicina":
                        monto = montoMedicina;
                        break;
                    case "Derecho":
                        monto = montoDerecho;
                        break;
                    case "Sistemas":
                        monto = montoSistemas;
                        break;
                }
                break;
            case "B":
                switch (this.escuela) {
                    case "Medicina":
                        monto = (montoMedicina) - (montoMedicina * 0.80);
                        break;
                    case "Derecho":
                        monto = (montoDerecho) - (montoDerecho * 0.80);
                        break;
                    case "Sistemas":
                        monto = (montoSistemas) - (montoSistemas * 0.80);
                        break;
                }
                break;
            case "C":
                switch (this.escuela) {
                    case "Medicina":
                        monto = (montoMedicina) - (montoMedicina * 0.50);
                        break;
                    case "Derecho":
                        monto = (montoDerecho) - (montoDerecho * 0.50);
                        break;
                    case "Sistemas":
                        monto = (montoSistemas) - (montoSistemas * 0.50);
                        break;
                }
                break;
        }
        return monto;
    }
}
