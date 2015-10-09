package entidades;

/**
 * Created by Sebastian on 08-10-2015.
 */
public class organizacion {
    private int idOrganizacion;
    private String nombreO, descripcionO, otrosDetallesO;
    private int fonoO;

    public organizacion(int idOrganizacion, String nombreO, String descripcionO, String otrosDetallesO, int fonoO) {
        this.idOrganizacion = idOrganizacion;
        this.nombreO = nombreO;
        this.descripcionO = descripcionO;
        this.otrosDetallesO = otrosDetallesO;
        this.fonoO = fonoO;
    }

    public int getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(int idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    public String getNombreO() {
        return nombreO;
    }

    public void setNombreO(String nombreO) {
        this.nombreO = nombreO;
    }

    public String getDescripcionO() {
        return descripcionO;
    }

    public void setDescripcionO(String descripcionO) {
        this.descripcionO = descripcionO;
    }

    public String getOtrosDetallesO() {
        return otrosDetallesO;
    }

    public void setOtrosDetallesO(String otrosDetallesO) {
        this.otrosDetallesO = otrosDetallesO;
    }

    public int getFonoO() {
        return fonoO;
    }

    public void setFonoO(int fonoO) {
        this.fonoO = fonoO;
    }
}
