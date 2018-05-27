/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;
import PkgEntidad.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Corei7
 */
public class ClsTenisMesa {

    ClsMetodosVariados metodosVariados = new ClsMetodosVariados();
    
    public ClsTenisMesa() {
    }
    
    public ClsPartidoTenisMesa partidoTenisMesa(int idPartido) throws SQLException{
        ClsPartidoTenisMesa partidoTenisMesa = new ClsPartidoTenisMesa();
        try (Connection connection = metodosVariados.MtdConexion()){
                PreparedStatement pst;
                String sql = "select * from tbPartidoTenisMesa where idPartidoTenisMesa = ?";
                pst = connection.prepareCall(sql);
                pst.setInt(1, idPartido);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    partidoTenisMesa.setIdPartidoTenisMesa(rs.getInt(1));
                    partidoTenisMesa.setIdApoderado(rs.getInt(2));
                    partidoTenisMesa.setIdEquipoLocal(rs.getInt(3));
                    partidoTenisMesa.setIdEquipoVisitante(rs.getInt(4));
                    partidoTenisMesa.setRonda(rs.getInt(5));
                    partidoTenisMesa.setEstadoPartido(rs.getString(6).charAt(0));
                }
            }
        return partidoTenisMesa;
    }
    
    public List<ClsPartidoTenisMesa> listaPartidos(int idSerie) throws SQLException{
        List<ClsPartidoTenisMesa> lista = new ArrayList<>();
        if(idSerie != 0){
            try (Connection connection = metodosVariados.MtdConexion()){
                PreparedStatement pst;
                String sql = "select ptmesa.idPartidoTenisMesa, \n" +
"		ptmesa.idApoderado,\n" +
"		ptmesa.idEquipoLocal,\n" +
"		ptmesa.idEquipoVisitante,\n" +
"		ptmesa.ronda, \n" +
"		ptmesa.estadoPartido,\n" +
"		ser.descripcionSerie \n" +
"                    from tbPartidoTenisMesa ptmesa \n" +
"                    inner join tbEquipo eq on ptmesa.idEquipoLocal = eq.idEquipo\n" +
"                    inner join tbSerie ser on eq.idSerie = ser.idSerie\n" +
"                    where ser.idSerie = ? AND ptmesa.estadoPartido = P";
                pst = connection.prepareCall(sql);
                pst.setInt(1, idSerie);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    ClsPartidoTenisMesa partidoTenisMesa = new ClsPartidoTenisMesa();
                    partidoTenisMesa.setIdPartidoTenisMesa(rs.getInt(1));
                    partidoTenisMesa.setIdApoderado(rs.getInt(2));
                    partidoTenisMesa.setIdEquipoLocal(rs.getInt(3));
                    partidoTenisMesa.setIdEquipoVisitante(rs.getInt(4));
                    partidoTenisMesa.setRonda(rs.getInt(5));
                    partidoTenisMesa.setEstadoPartido(rs.getString(6).charAt(0));
                    lista.add(partidoTenisMesa);
                }
            }        
        }
        return lista;
    }
}
