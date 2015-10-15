package entidades;

/**
 * Created by Alejandro on 13/10/2015.
 */
public class Cliente {

    private int clienteId;
    private String detalles;
    private Persona persona;
    private Organizacion organizacion;

    public Cliente(int clienteId, String detalles, Persona persona, Organizacion organizacion) {
        this.clienteId = clienteId;
        this.detalles = detalles;
        this.persona = persona;
        this.organizacion = organizacion;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }
}
