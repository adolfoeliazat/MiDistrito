package entidades;

import java.util.Date;

/**
 * Created by CITT2015 on 15/10/2015.
 */
public class Contrato {
    private int contratoId;
    private Date inicioContra, finContra;
    private String detalles;
    private Cliente cliente;

    public Contrato(int contratoId, Date inicioContra, Date finContra, String detalles, Cliente cliente) {
        this.contratoId = contratoId;
        this.inicioContra = inicioContra;
        this.finContra = finContra;
        this.detalles = detalles;
        this.cliente = cliente;
    }

    public int getContratoId() {
        return contratoId;
    }

    public void setContratoId(int contratoId) {
        this.contratoId = contratoId;
    }

    public Date getInicioContra() {
        return inicioContra;
    }

    public void setInicioContra(Date inicioContra) {
        this.inicioContra = inicioContra;
    }

    public Date getFinContra() {
        return finContra;
    }

    public void setFinContra(Date finContra) {
        this.finContra = finContra;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
