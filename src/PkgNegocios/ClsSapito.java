/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import PkgEntidad.ClsEquipo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vera
 */
public class ClsSapito {
    ClsConexion conexion = new ClsConexion();
    Connection con = null;
    
     public boolean AgregarPuntajeSapito(PkgEntidad.ClsSapito sap, Connection _Con) {
        
        CallableStatement cstm = null;
        boolean resp = true;
       
        try {
            //con = conexion.getConecion();
            _Con.setAutoCommit(false);
            cstm = _Con.prepareCall("insert into tbSapito (idEquipo, puntajeEquipo) values (?,?);");
            cstm.setInt(1, sap.getIdEquipo());
            cstm.setInt(2, sap.getPuntajeEquipo());
            resp = cstm.execute();
            _Con.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //conexion.Cerrar1(con, cstm);
        }
        return resp;
    }
    public int BorrarDatosSapito()
    {
        con = conexion.getConecion();
        int id = 0;        
        PreparedStatement pst = null;
        String sqlQuery = "delete tbSapito"; 
        try 
        {
            pst = con.prepareStatement(sqlQuery); 
            pst.executeUpdate();
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(ClsCircuitoBasket.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    public void InsertarPosicion(int _IdEquipo, int _PuntajeEquipo ,String _PosicionEquipo)
    {
        con = conexion.getConecion();
        PreparedStatement pst = null;
        String sqlQuery = "insert into tbSapito values (?,?,?)";
        try
        {
            pst = con.prepareStatement(sqlQuery);
            pst.setInt(1, _IdEquipo);
            pst.setInt(2, _PuntajeEquipo);
            pst.setString(3, _PosicionEquipo);
            pst.executeUpdate();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        
    }
    public int UpdatePuntaje(int _IdEquipo, int _PuntajeEquipo){
        con = conexion.getConecion();
        int exitosa=0;
        PreparedStatement pst = null;
        String sql = "update tbSapito set puntajeEquipo = ? where idEquipo = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, _PuntajeEquipo);
            pst.setInt(2, _IdEquipo);
            exitosa= pst.executeUpdate();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return exitosa;
    }
     public int UpdateEstadoApoderado(int _idApoderado){
        con = conexion.getConecion();
        int exitosa=0;
        PreparedStatement pst = null;
        String sql = "update tbApoderado \n" +
        " set estadoApoderado = 'J'\n" +
        " where idApoderado = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, _idApoderado);
            exitosa= pst.executeUpdate();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return exitosa;
    }
    public List<PkgEntidad.ClsSapito> listado() {
        int cont=1;
        CallableStatement cstm = null;
        ResultSet rs = null;
        List<PkgEntidad.ClsSapito> lista = null;
        try {
            lista = new ArrayList<>();
            con = conexion.getConecion();
            cstm = con.prepareCall("select sa.idEquipo, sa.posicionEquipo, sa.puntajeEquipo, e.detalleEquipo\n" +
            "from tbSapito as sa inner join tbEquipo as e\n" +
            "on sa.idEquipo = e.idEquipo\n" +
            "order by sa.puntajeEquipo DESC");
            rs = cstm.executeQuery();
            PkgEntidad.ClsSapito sap = null;
            while (rs.next()) {
                sap = new PkgEntidad.ClsSapito();
                sap.setIdEquipo(rs.getInt("idEquipo"));
                sap.setPuntajeEquipo(rs.getInt("puntajeEquipo"));
                sap.setPosicionEquipo(cont+" puesto");
                sap.setDetalleEquipo(rs.getString("detalleEquipo"));
                lista.add(sap);
                cont++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conexion.Cerrar2(cstm, rs);
        }
        return lista;
    }
     public List<ClsEquipo> listaEquipos(int _idSerie) throws SQLException{
        List<ClsEquipo> equipos = new ArrayList<>();
        con = conexion.getConecion();
        String sql = "select eq.*\n" +
                        " from tbEquipo eq \n" +
                        " inner join tbAnio an on eq.idAnio = an.idAnio\n" +
                        " inner join tbSerie ser on an.idSerie = ser.idSerie\n" +
                        " where an.idSerie = '"+_idSerie+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
                ClsEquipo equipo = new ClsEquipo();
                equipo.setIdEquipo(rs.getInt(1));
                equipo.setNombreEquipo(rs.getString(2));
                equipo.setDetalleEquipo(rs.getString(3));
                equipo.setEstadoEquipo(rs.getString(4));
                equipo.setIdAnio(rs.getInt(5));
                equipos.add(equipo);
             }
             con.close();
             rs.close();
        return equipos;
    }
    public List<ClsEquipo> listaParticipantesEquipo(int _idEquipo) throws SQLException{
        List<ClsEquipo> equipos = new ArrayList<>();
        con = conexion.getConecion();
        String sql = "select eq.*, apo.apePaterno ,apo.apeMaterno , apo.nombresApoderado, apo.idApoderado \n" +
                        " from tbEquipo eq\n" +
                        " inner join tbAnio an on eq.idAnio = an.idAnio\n" +
                        " inner join tbApoderado apo on an.idAnio = apo.idAnio\n" +
                        " where apo.estadoApoderado = 'A' and apo.idDisciplina = 3 and eq.idEquipo = '"+_idEquipo+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
                ClsEquipo equipo = new ClsEquipo();
                equipo.setIdEquipo(rs.getInt(1));
                equipo.setNombreEquipo(rs.getString(2));
                equipo.setDetalleEquipo(rs.getString(3));
                equipo.setEstadoEquipo(rs.getString(4));
                equipo.setIdAnio(rs.getInt(5));
                equipo.setApePaterno(rs.getString(6));
                equipo.setApeMaterno(rs.getString(7));
                equipo.setNombresApoderado(rs.getString(8));
                equipo.setIdApoderado(rs.getInt(9));
                equipos.add(equipo);
             }
             con.close();
             rs.close();
        return equipos;
    }
    public List<ClsEquipo> listaParticipantesEquipoEmpate(int _idEquipo) throws SQLException{
        List<ClsEquipo> equipos = new ArrayList<>();
        con = conexion.getConecion();
        String sql = "select eq.*, apo.apePaterno ,apo.apeMaterno , apo.nombresApoderado, apo.idApoderado, apo.estadoApoderado\n" +
                     " from tbEquipo eq\n" +
                     " inner join tbAnio an on eq.idAnio = an.idAnio\n" +
                     " inner join tbApoderado apo on an.idAnio = apo.idAnio\n" +
                     " where apo.estadoApoderado = 'J' \n" +
                     " and apo.idDisciplina = 3\n" +
                     " and eq.idEquipo = '"+_idEquipo+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
         while(rs.next()){
                ClsEquipo equipo = new ClsEquipo();
                equipo.setIdEquipo(rs.getInt(1));
                equipo.setNombreEquipo(rs.getString(2));
                equipo.setDetalleEquipo(rs.getString(3));
                equipo.setEstadoEquipo(rs.getString(4));
                equipo.setIdAnio(rs.getInt(5));
                equipo.setApePaterno(rs.getString(6));
                equipo.setApeMaterno(rs.getString(7));
                equipo.setNombresApoderado(rs.getString(8));
                equipo.setIdApoderado(rs.getInt(9));
                equipos.add(equipo);
             }
             con.close();
             rs.close();
        return equipos;
    }

}
