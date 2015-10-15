package entidades;

/**
 * Created by Alejandro on 13/10/2015.
 */
public class TipoOrganizacion {

    private int tipoOrganId;
    private String nombre, descripcion;

    public TipoOrganizacion(int tipoOrganId, String nombre, String descripcion) {
        this.tipoOrganId = tipoOrganId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getTipoOrganId() {
        return tipoOrganId;
    }

    public void setTipoOrganId(int tipoOrganId) {
        this.tipoOrganId = tipoOrganId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
