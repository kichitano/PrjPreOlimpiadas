/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import PkgEntidad.ClsEquipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Corei7
 */
public class ClsMetodoEquipo {
    
    ClsMetodosVariados metodosVariados = new ClsMetodosVariados();
    
    public ClsMetodoEquipo() {
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
                    equipo.setEstadoEquipo(rs.getString(4).charAt(0));
                }
            }        
        }
        return equipo;
    }
    
}
