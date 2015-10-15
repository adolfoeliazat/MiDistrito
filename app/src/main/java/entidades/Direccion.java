package entidades;

/**
 * Created by Sebastian on 08-10-2015.
 */
public class Direccion {
    private int direccionId;
    private int nroCasa, nroCalle, areaLocal;
    private String ciudad, provincia, pais, otrosDetalles;
    private Persona persona;

    public Direccion(int direccionId, int nroCasa, int nroCalle, int areaLocal, String ciudad, String provincia, String pais, String otrosDetalles, Persona persona) {
        this.direccionId = direccionId;
        this.nroCasa = nroCasa;
        this.nroCalle = nroCalle;
        this.areaLocal = areaLocal;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.pais = pais;
        this.otrosDetalles = otrosDetalles;
        this.persona = persona;
    }

    public int getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(int direccionId) {
        this.direccionId = direccionId;
    }

    public int getNroCasa() {
        return nroCasa;
    }

    public void setNroCasa(int nroCasa) {
        this.nroCasa = nroCasa;
    }

    public int getNroCalle() {
        return nroCalle;
    }

    public void setNroCalle(int nroCalle) {
        this.nroCalle = nroCalle;
    }

    public int getAreaLocal() {
        return areaLocal;
    }

    public void setAreaLocal(int areaLocal) {
        this.areaLocal = areaLocal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getOtrosDetalles() {
        return otrosDetalles;
    }

    public void setOtrosDetalles(String otrosDetalles) {
        this.otrosDetalles = otrosDetalles;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}