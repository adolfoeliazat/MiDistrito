package entidades;

/**
 * Created by CITT2015 on 15/10/2015.
 */
public class Transaccion {
    private int transaccionId;
    private String detalles;
    private TipoTransaccion tipoTransaccion;

    public Transaccion(int transaccionId, String detalles, TipoTransaccion tipoTransaccion) {
        this.transaccionId = transaccionId;
        this.detalles = detalles;
        this.tipoTransaccion = tipoTransaccion;
    }

    public int getTransaccionId() {
        return transaccionId;
    }

    public void setTransaccionId(int transaccionId) {
        this.transaccionId = transaccionId;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
}
