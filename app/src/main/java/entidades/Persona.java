package entidades;

import java.util.Date;

/**
 * Created by Alejandro on 13/10/2015.
 */
public class Persona {

    private int rut;
    private Date fechaInscripcion;
    private String primerNombre,segundoNombre,apellidoPaterno,apellidoMaterno;
    private String genero;
    private Date fechaNacimiento;
    private String detalles;

    public Persona(int rut, Date fechaInscripcion, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String genero, Date fechaNacimiento, String detalles) {
        this.rut = rut;
        this.fechaInscripcion = fechaInscripcion;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.detalles = detalles;
    }
}
