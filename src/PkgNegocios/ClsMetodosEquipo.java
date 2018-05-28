/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;
import PkgEntidad.ClsEquipo;
import PkgNegocios.ClsMetodosVariados;
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
public class ClsMetodosEquipo {
    
    ClsMetodosVariados metodosVariados = new ClsMetodosVariados();
    
    public ClsMetodosEquipo() {
    }
    
    public ClsEquipo Equipo(int idEquipo) throws SQLException{
        ClsEquipo equipo = new ClsEquipo();
        if(idEquipo != 0){
            try (Connection connection = metodosVariados.MtdConexion()){
                PreparedStatement pst;
                String sql = "select * from tbEquipo where idEquipo = ?";
                pst = connection.prepareCall(sql);
                pst.setInt(1, idEquipo);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                    equipo.setIdEquipo(rs.getInt(1));
                    equipo.setNombreEquipo(rs.getString(2));
                    equipo.setDetalleEquipo(rs.getString(3));
                    equipo.setEstadoEquipo(rs.getString(4));
                    equipo.setIdSerie(rs.getInt(5));
                }
            }        
        }
        return equipo;
    }
    
    
}