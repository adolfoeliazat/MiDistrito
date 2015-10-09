package entidades;

/**
 * Created by Sebastian on 08-10-2015.
 */
public class Direccion {
    private int idDireccion;
    private int nroCasa, nroCalle, areaLocal;
    private String ciudad, provincia, pais, otrosDetalles;

    public Direccion(String otrosDetalles, String pais, String provincia, String ciudad, int areaLocal, int nroCalle, int nroCasa, int idDireccion) {
        this.otrosDetalles = otrosDetalles;
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.areaLocal = areaLocal;
        this.nroCalle = nroCalle;
        this.nroCasa = nroCasa;
        this.idDireccion = idDireccion;
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
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
}