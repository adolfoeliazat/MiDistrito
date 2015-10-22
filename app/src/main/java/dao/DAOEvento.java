package dao;

import entidades.Evento;

/**
 * Created by Johan on 22-10-2015.
 */
public class DAOEvento {
    public static boolean sqlInsertar(Evento evento){
        String sql = String.format("Insert into evento(eventoId,fechaInicio, fechaTermino,nombre, objetivo, descripcion, resultado, " +
                "otrosDetalles,tipo,direccion,organizacion,tipoEvento)"
                , evento.getEventoId()
                , evento.getFechaInicio()
                , evento.getFechaTermino()
                , evento.getNombre()
                , evento.getObjetivo()
                , evento.getDescripcion()
                , evento.getResultado()
                , evento.getOtrosDetalles()
                , evento.getTipo()
                , evento.getDescripcion()
                , evento.getOrganizacion().getOrganizacionId()
                , evento.getTipoEvento());
        return true;
    }

    public static boolean sqlActualizar(Evento evento){
        String sql =  String.format("update evento set(fechaInicio={0} ,fechaTermino='{1}',nombre='{2}',objetivo='{3}',descripcion='{4}'," +
                "resultado'{5}',otrosDetalles='{6}',tipo='{7}',direccion='{8}',organizacion='{9}',tipoEvento='{10}') where eventoId={11}"
                , evento.getFechaInicio()
                , evento.getFechaTermino()
                , evento.getNombre()
                , evento.getObjetivo()
                , evento.getDescripcion()
                , evento.getResultado()
                , evento.getOtrosDetalles()
                , evento.getTipo()
                , evento.getDescripcion()
                , evento.getOrganizacion().getOrganizacionId()
                , evento.getTipoEvento()
                , evento.getEventoId());
        return true;
    }

    public static boolean sqlEliminar(Evento evento){
        String sql = String.format("delete from evento where eventoid='{0}'"
                ,evento.getEventoId());
        return true;
    }

    public static boolean sqlSeleccionarUna(Evento evento){
        String sql =  String.format("select eventoId,fechaInicio, fechaTermino,nombre, objetivo, descripcion, resultado, " +
                "otrosDetalles,tipo,direccion,organizacion,tipoEvento from evento where eventoId='{0}'"
                ,evento.getEventoId());
        return true;
    }
}
