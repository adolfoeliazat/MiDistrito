package entidades;

/**
 * Created by Alejandro on 13/10/2015.
 */
public class TipoEvento {

    private int tipoEvenId;
    private String descripcion;

    public TipoEvento(int tipoEvenId, String descripcion) {
        this.tipoEvenId = tipoEvenId;
        this.descripcion = descripcion;
    }

    public int getTipoEvenId() {
        return tipoEvenId;
    }

    public void setTipoEvenId(int tipoEvenId) {
        this.tipoEvenId = tipoEvenId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
