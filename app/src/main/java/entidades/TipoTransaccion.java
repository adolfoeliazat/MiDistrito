package entidades;

/**
 * Created by CITT2015 on 15/10/2015.
 */
public class TipoTransaccion {
    private int tipoTransaId;
    private String detalles;

    public TipoTransaccion(int tipoTransaId, String detalles) {
        this.tipoTransaId = tipoTransaId;
        this.detalles = detalles;
    }

    public int getTipoTransaId() {
        return tipoTransaId;
    }

    public void setTipoTransaId(int tipoTransaId) {
        this.tipoTransaId = tipoTransaId;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
