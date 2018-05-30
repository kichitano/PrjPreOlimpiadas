/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import PkgEntidad.ClsApoderado;
import PkgEntidad.ClsEquipo;
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
                    equipo.setIdAnio(rs.getInt(5));
                }
            }        
        }
        return equipo;
    }
    
    public List<ClsApoderado> listaParticipantesEquipo(int idDisciplina, int idAnio) throws SQLException{
        List<ClsApoderado> participantesEquipo = new ArrayList<>();
        try (Connection connection = metodosVariados.MtdConexion()){
            PreparedStatement pst;
            String sql = "select tbap.* from tbApoderado as tbap \n" +
                            "inner join tbAnio as tban on tbap.idAnio = tban.idAnio\n" +
                            "where tbap.idDisciplina = ? and tban.idAnio = ?";
            pst = connection.prepareCall(sql);
            pst.setInt(1, idDisciplina);
            pst.setInt(2, idAnio);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                ClsApoderado apoderado = new ClsApoderado();
                apoderado.setIdApoderado(rs.getInt(1));
                apoderado.setIdAnio(rs.getInt(2));
                apoderado.setIdDisciplina(rs.getInt(3));
                apoderado.setDni(rs.getString(4));
                apoderado.setApePaterno(rs.getString(5));
                apoderado.setApeMaterno(rs.getString(6));
                apoderado.setNombres(rs.getString(7));
                apoderado.setEstadoApoderado(rs.getString(8).charAt(0));
                participantesEquipo.add(apoderado);
            }
        }
        return participantesEquipo;
    }
    
}
