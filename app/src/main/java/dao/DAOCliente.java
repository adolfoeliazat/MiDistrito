package dao;


import entidades.Cliente;

/**
 * Created by Johan on 15-10-2015.
 */
public class DAOCliente {

    public static boolean sqlInsertar(Cliente cliente){
        String sql = String.format("Insert into cliente(clienteId, detalles,rut,organizacionId)"
                , cliente.getClienteId()
                , cliente.getDetalles()
                , cliente.getPersona().getRut()
                , cliente.getOrganizacion().getOrganizacionId());
        return true;
    }

    public static boolean sqlActualizar(Cliente cliente){
        String sql =  String.format("update cliente set(detalles='{0}',rut='{1}' ,organizacionId='{2}') where clienteId={3}"
                , cliente.getDetalles()
                , cliente.getPersona().getRut()
                , cliente.getOrganizacion().getOrganizacionId()
                , cliente.getClienteId());
        return true;
    }

    public static boolean sqlEliminar(Cliente cliente){
        String sql = String.format("delete from cliente where clienteId='{0}'"
                ,cliente.getClienteId());
        return true;
    }

    public static boolean sqlSeleccionarUna(Cliente cliente){
        String sql =  String.format("select clienteId, detalles, rut ,organizacionId from cliente where clienteId ='{0}'"
                ,cliente.getClienteId());
        return true;
    }
}
