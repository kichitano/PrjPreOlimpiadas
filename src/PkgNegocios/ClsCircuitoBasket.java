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
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Vera
 */
public class ClsCircuitoBasket {
    ClsConexion conexion = new ClsConexion();
    Connection con = null;
    
    public boolean AgregarCircuitoBasket(PkgEntidad.ClsCircuitoBasket bsk, Connection _Con) {
        
        CallableStatement cstm = null;
        boolean resp = true;
       
        try {
            //con = conexion.getConecion();
            _Con.setAutoCommit(false);
            cstm = _Con.prepareCall("insert into tbCircuitoBasket (idEquipo, puntajeEquipo) values (?,?);");
            cstm.setInt(1, bsk.getIdEquipo());
            cstm.setInt(2, bsk.getPuntajeEquipo());
            resp = cstm.execute();
            _Con.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //conexion.Cerrar1(con, cstm);
        }
        return resp;
    }
    
    public int BorrarDatosBasket()
    {
        con = conexion.getConecion();
        int id = 0;        
        PreparedStatement pst = null;
        String sqlQuery = "delete tbCircuitoBasket"; 
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
        String sqlQuery = "insert into tbCircuitoBasket values (?,?,?)";
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
        String sql = "update tbCircuitoBasket set puntajeEquipo = ? where idEquipo = ?";
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
   
    public List<PkgEntidad.ClsCircuitoBasket> listado() {
        int cont=1;
        CallableStatement cstm = null;
        ResultSet rs = null;
        List<PkgEntidad.ClsCircuitoBasket> lista = null;
        try {
            lista = new ArrayList<>();
            con = conexion.getConecion();
            cstm = con.prepareCall("select cb.idEquipo, cb.posicionEquipo, cb.puntajeEquipo, e.detalleEquipo\n" +
            "from tbCircuitoBasket as cb inner join tbEquipo as e\n" +
            "on cb.idEquipo = e.idEquipo\n" +
            "order by cb.puntajeEquipo DESC");
            rs = cstm.executeQuery();
            PkgEntidad.ClsCircuitoBasket bsk = null;
            while (rs.next()) {
                bsk = new PkgEntidad.ClsCircuitoBasket();
                bsk.setIdEquipo(rs.getInt("idEquipo"));
                bsk.setPuntajeEquipo(rs.getInt("puntajeEquipo"));
                bsk.setPosicionEquipo(cont+" puesto");
                bsk.setDetalleEquipo(rs.getString("detalleEquipo"));
                lista.add(bsk);
                cont++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conexion.Cerrar2(cstm, rs);
        }
        return lista;
    }

    
    /*
    public DefaultComboBoxModel getValues(int _idSerie){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try{
             con = conexion.getConecion();
             String sql = "select eq.detalleEquipo \n" +
                " from tbEquipo eq \n" +
                " inner join tbAnio an on eq.idAnio = an.idAnio\n" +
                " inner join tbSerie ser on an.idSerie = ser.idSerie\n" +
                " where an.idSerie = '"+_idSerie+"'";
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 modelo.addElement(rs.getString(1));
             }
             con.close();
             rs.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return modelo;
    }
    */
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
                        " where apo.estadoApoderado = 'A' and apo.idDisciplina = 5 and eq.idEquipo = '"+_idEquipo+"'";
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
