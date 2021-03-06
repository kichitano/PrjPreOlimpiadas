/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import PkgEntidad.ClsUsuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Corei7
 */
public class ClsMetodosVariados {

    public ClsMetodosVariados() {
    }
        
    public Connection MtdConexion() throws SQLException{
        Connection con = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=dbPreOlimpiada;user=sa;password=123456"; 
            con = DriverManager.getConnection(url);
        }catch(ClassNotFoundException e){ }
        return con;
    }
    
    public boolean MtdIniciarSesion(String nomusu, String passusu) throws SQLException{
        ClsUsuario usuario = new ClsUsuario();
        boolean paso;
        try (Connection connection = MtdConexion()) {
            PreparedStatement pst;
            String sql="SELECT dbo.tbApoderado.idApoderado, dbo.tbApoderado.idAnio, dbo.tbApoderado.idDisciplina, dbo.tbApoderado.dni, "
                    + "dbo.tbApoderado.apePaterno, dbo.tbApoderado.apeMaterno, dbo.tbApoderado.nombres, dbo.tbApoderado.estado,dbo.tbApoderado.idEquipo,"
                    + " dbo.tbUsuario.idUsuario, dbo.tbUsuario.nombUsuario, dbo.tbUsuario.estadoUsuario FROM dbo.tbApoderado INNER JOIN dbo.tbUsuario "
                    + "ON dbo.tbApoderado.idApoderado = dbo.tbUsuario.idApoderado WHERE dbo.tbUsuario.nombUsuario = ? AND dbo.tbUsuario.passUsuario = ? AND dbo.tbUsuario.estadoUsuario != 0";
            pst = connection.prepareStatement(sql);
            pst.setString(1,nomusu);
            pst.setString(2,passusu);
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                usuario.setIdApoderado(rs.getInt(1));
                usuario.setIdAnio(rs.getInt(2));
                usuario.setIdDisciplina(rs.getInt(3));
                usuario.setDni(rs.getString(4));
                usuario.setApePaterno(rs.getString(5));
                usuario.setApeMaterno(rs.getString(6));
                usuario.setNombres(rs.getString(7));
                usuario.setEstadoApoderado(rs.getString(8).charAt(0));
                usuario.setIdEquipo(rs.getInt(9));
                usuario.setIdUsuario(rs.getInt(10));
                usuario.setNombUsuario(rs.getString(11));
                usuario.setEstadoUsuario(rs.getString(12).charAt(0));
                paso = true;
            }
            else
            {
                paso = false;
            }
        }
        return paso;
    }
}
