package entidades;

import java.util.Date;

/**
 * Created by Sebastian on 08-10-2015.
 */
public class Evento {
    private int eventoId;
    private Date fechaInicio, fechaTermino;
    private String nombre, objetivo, descripcion, resultado, otrosDetalles;
    private TipoEvento tipo;
    private Direccion direccion;
    private Organizacion organizacion;
    private TipoEvento tipoEvento;

    public Evento(int eventoId, Date fechaInicio, Date fechaTermino, String nombre, String objetivo, String descripcion, String resultado, String otrosDetalles, TipoEvento tipo, Direccion direccion, Organizacion organizacion, TipoEvento tipoEvento) {
        this.eventoId = eventoId;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.descripcion = descripcion;
        this.resultado = resultado;
        this.otrosDetalles = otrosDetalles;
        this.tipo = tipo;
        this.direccion = direccion;
        this.organizacion = organizacion;
        this.tipoEvento = tipoEvento;
    }

    public int getEventoId() {
        return eventoId;
    }

    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getOtrosDetalles() {
        return otrosDetalles;
    }

    public void setOtrosDetalles(String otrosDetalles) {
        this.otrosDetalles = otrosDetalles;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
}
