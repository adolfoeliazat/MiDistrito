package entidades;

import java.util.Date;

/**
 * Created by Sebastian on 08-10-2015.
 */
public class Evento {
    private int idEvento;
    private Date fechaInicioE, fechaTerminoE;
    private String nombreE, objetivoE, descripcionE, resultadoE, otrosDetallesE;

    public Evento(int idEvento, Date fechaInicioE, Date fechaTerminoE, String nombreE, String objetivoE, String descripcionE, String resultadoE, String otrosDetallesE) {
        this.idEvento = idEvento;
        this.fechaInicioE = fechaInicioE;
        this.fechaTerminoE = fechaTerminoE;
        this.nombreE = nombreE;
        this.objetivoE = objetivoE;
        this.descripcionE = descripcionE;
        this.resultadoE = resultadoE;
        this.otrosDetallesE = otrosDetallesE;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public Date getFechaInicioE() {
        return fechaInicioE;
    }

    public void setFechaInicioE(Date fechaInicioE) {
        this.fechaInicioE = fechaInicioE;
    }

    public Date getFechaTerminoE() {
        return fechaTerminoE;
    }

    public void setFechaTerminoE(Date fechaTerminoE) {
        this.fechaTerminoE = fechaTerminoE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getObjetivoE() {
        return objetivoE;
    }

    public void setObjetivoE(String objetivoE) {
        this.objetivoE = objetivoE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getResultadoE() {
        return resultadoE;
    }

    public void setResultadoE(String resultadoE) {
        this.resultadoE = resultadoE;
    }

    public String getOtrosDetallesE() {
        return otrosDetallesE;
    }

    public void setOtrosDetallesE(String otrosDetallesE) {
        this.otrosDetallesE = otrosDetallesE;
    }
}
