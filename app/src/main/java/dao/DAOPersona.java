package dao;


import entidades.Persona;

/**
 * Created by Johan on 15-10-2015.
 */
public class DAOPersona {

    public static boolean sqlInsertar(Persona persona){
        String sql = String.format("Insert into persona(rut, fechaInscripcion,primerNombre,segundoNombre,apellidoPaterno" +
                ",apellidoMaterno,genero,fechaNacimiento,detalles)"
                ,persona.getRut()
                ,persona.getFechaInscripcion()
                ,persona.getPrimerNombre()
                ,persona.getSegundoNombre()
                ,persona.getApellidoPaterno()
                ,persona.getApellidoMaterno()
                ,persona.getGenero()
                ,persona.getFechaNacimiento()
                ,persona.getDetalles());
        return true;
    }

    public static boolean sqlActualizar(Persona persona){
        String sql =  String.format("update persona set(fechaInscripcion='{0}',primerNombre'{1}',segundoNombre='{2}',apellidoPaterno='{3}'," +
                "apellidoMaterno='{4}',genero='{5}',fechaNacimiento='{6}',detalles='{7}') where rut='{8}'"
                ,persona.getFechaInscripcion()
                ,persona.getPrimerNombre()
                ,persona.getSegundoNombre()
                ,persona.getApellidoPaterno()
                ,persona.getApellidoMaterno()
                ,persona.getGenero()
                ,persona.getFechaNacimiento()
                ,persona.getDetalles()
                ,persona.getRut());
        return true;
    }

    public static boolean sqlEliminar(Persona persona){
        String sql = String.format("delete from persona where rut='{0}'"
                ,persona.getRut());
        return true;
    }

    public static boolean sqlSeleccionarUna(Persona persona){
        String sql =  String.format("select rut,fechaInscripcion,primerNombre,segundoNombre,apellidoPaterno,apellidoMaterno,genero" +
                ",fechaNacimiento,private String detalles from persona where rut={0}"
                ,persona.getRut());
        return true;
    }
}
