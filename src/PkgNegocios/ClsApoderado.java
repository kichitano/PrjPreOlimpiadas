/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import PkgEntidad.ClsAnio;
import PkgEntidad.ClsDisciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vera
 */
public class ClsApoderado {
   ClsConexion conexion = new ClsConexion();
   Connection con = null;

     public boolean verificarPertenenciaDisciplina(String _dni) throws SQLException{
        // sirve para comprobar que ResultSet retorne datos
        int datos = 0;
        boolean perteneceDisciplina = false;
        con = conexion.getConecion();
        String query = "select *\n" +
"        from tbApoderado where\n" +
"        (estadoApoderado = 'A' or estadoApoderado ='J') \n" +
"        and dni= '" +_dni+ "'";
       
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
             datos=1; // es que retorna datos 
                PkgEntidad.ClsApoderado apoderado = new PkgEntidad.ClsApoderado();
                apoderado.setIdApoderado(rs.getInt(1));
                apoderado.setIdAnio(rs.getInt(2));
                apoderado.setIdDisciplina(rs.getInt(3));
                apoderado.setDni(rs.getString(4));
                apoderado.setApePaterno(rs.getString(5));
                apoderado.setApeMaterno(rs.getString(6));
                apoderado.setNombresApoderado(rs.getString(7));
                apoderado.setEstadoApoderado(rs.getString(8));
              //  apoderados.add(apoderado);
        }
        con.close();
        rs.close();
        
        //if con boolean resumido.
        perteneceDisciplina = datos == 1;
       
        return perteneceDisciplina;
    }
    
    //metodo insertar nuevo participante o apoderado
     public void InsertarApoderado(
             int _idAnio ,int _idDisciplina, String _dni, 
             String _apePaterno, String _apeMaterno, String _nombresApoderado, String _estadoApoderado
             )
    {
        con = conexion.getConecion();
        PreparedStatement pst = null;
        String sqlQuery = "insert into tbApoderado values (?,?,?,?,?,?,?)";
        try
        {
            pst = con.prepareStatement(sqlQuery);
            pst.setInt(1, _idAnio);
            pst.setInt(2, _idDisciplina);
            pst.setString(3, _dni);
            pst.setString(4, _apePaterno);
            pst.setString(5, _apeMaterno);
            pst.setString(6, _nombresApoderado);
            pst.setString(7, _estadoApoderado);
            pst.executeUpdate();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    // metodo cargar todas las Disciplinas
     public List<ClsDisciplina> listaDisciplinas() throws SQLException{
        List<ClsDisciplina> disciplinas = new ArrayList<>();
        con = conexion.getConecion();
        String sql = "select * from tbDisciplina";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
                ClsDisciplina dis = new ClsDisciplina();
                dis.setIdDisciplina(rs.getInt(1));
                dis.setDescripcionDisciplina(rs.getString(2));
                disciplinas.add(dis);
             }
             con.close();
             rs.close();
        return disciplinas;
    }
    // metodo para cargar todos los Años
    public List<ClsAnio> listaAnios() throws SQLException{
        List<ClsAnio> anios = new ArrayList<>();
        con = conexion.getConecion();
        String sql = "select * from tbAnio";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
                ClsAnio anio = new ClsAnio();
                anio.setIdAnio(rs.getInt(1));
                anio.setDescripcionAnio(rs.getString(2));
                anio.setIdSerie(rs.getInt(1));
                anios.add(anio);
             }
             con.close();
             rs.close();
        return anios;
    }
   
}

