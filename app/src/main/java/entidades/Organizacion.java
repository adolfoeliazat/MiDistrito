package entidades;

/**
 * Created by Alejandro on 13/10/2015.
 */
public class Organizacion {

    private int organizacionId;
    private TipoOrganizacion tipo;
    private String nombre, telefono, descripcion, detalles;
    private Direccion direccion;
    private TipoOrganizacion tipoOrganizacion;

    public Organizacion(int organizacionId, TipoOrganizacion tipo, String nombre, String telefono, String descripcion, String detalles, Direccion direccion, TipoOrganizacion tipoOrganizacion) {
        this.organizacionId = organizacionId;
        this.tipo = tipo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.descripcion = descripcion;
        this.detalles = detalles;
        this.direccion = direccion;
        this.tipoOrganizacion = tipoOrganizacion;
    }

    public int getOrganizacionId() {
        return organizacionId;
    }

    public void setOrganizacionId(int organizacionId) {
        this.organizacionId = organizacionId;
    }

    public TipoOrganizacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoOrganizacion tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public TipoOrganizacion getTipoOrganizacion() {
        return tipoOrganizacion;
    }

    public void setTipoOrganizacion(TipoOrganizacion tipoOrganizacion) {
        this.tipoOrganizacion = tipoOrganizacion;
    }
}
