package dao;


import entidades.Direccion;

/**
 * Created by Johan on 15-10-2015.
 */
public class DAODireccion{

    public static boolean sqlInsertar(Direccion direccion){
        String sql = String.format("Insert into direccion (direccionId, nroCasa, nroCalle, areaLocal,ciudad, provincia, pais," +
                " otrosDetalles,rut)"
                , direccion.getDireccionId()
                , direccion.getNroCasa()
                , direccion.getNroCalle()
                , direccion.getAreaLocal()
                , direccion.getCiudad()
                , direccion.getProvincia()
                , direccion.getPais()
                , direccion.getOtrosDetalles()
                , direccion.getPersona().getRut());
        return true;
    }

    public static boolean sqlActualizar(Direccion direccion){
        String sql =  String.format("update direccion set(nroCasa='{0}' ,nroCalle='{1}',areaLocal='{2}',ciudad='{3}', provincia='{4}'" +
                ",pais='{5}',otrosDetalles'{6}',rut='{7}' where direccionId={8}"
                , direccion.getNroCasa()
                , direccion.getNroCalle()
                , direccion.getAreaLocal()
                , direccion.getCiudad()
                , direccion.getProvincia()
                , direccion.getPais()
                , direccion.getOtrosDetalles()
                , direccion.getPersona().getRut()
                , direccion.getDireccionId());
        return true;
    }

    public static boolean sqlEliminar(Direccion direccion){
        String sql = String.format("delete from direccion where direccionId='{0}'"
                ,direccion.getDireccionId());
        return true;
    }

    public static boolean sqlSeleccionarUna(Direccion direccion){
        String sql =  String.format("select direccionId, nroCasa, nroCalle, areaLocal,ciudad, provincia, pais,otrosDetalles,rut"
                ,direccion.getDireccionId());
        return true;
    }
}
