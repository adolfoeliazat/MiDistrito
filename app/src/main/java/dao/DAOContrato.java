package dao;


import entidades.Contrato;

/**
 * Created by Johan on 15-10-2015.
 */
public class DAOContrato{

    public static boolean sqlInsertar(Contrato contrato){
        String sql = String.format("Insert into contrato(contratoid , iniciocontra,fincontra,detalles, clienteId)"
                , contrato.getContratoId()
                , contrato.getInicioContra()
                , contrato.getFinContra()
                , contrato.getDetalles()
                , contrato.getCliente().getClienteId());
        return true;
    }

    public static boolean sqlActualizar(Contrato contrato){
        String sql =  String.format("update contrato set(inicioContra='{0}' ,finContra='{1}',detalles='{2}',clienteId='{3}') where contratoId={4}"
                , contrato.getInicioContra()
                , contrato.getFinContra()
                , contrato.getDetalles()
                , contrato.getCliente().getClienteId());
        return true;
    }

    public static boolean sqlEliminar(Contrato contrato){
        String sql = String.format("delete from contrato where contratoId='{0}'"
                ,contrato.getContratoId());
        return true;
    }

    public static boolean sqlSeleccionarUna(Contrato contrato){
        String sql =  String.format("select contratoid , iniciocontra,fincontra,detalles, clienteId from contrato where contratoId='{0}'"
                ,contrato.getContratoId());
        return true;
    }
}
