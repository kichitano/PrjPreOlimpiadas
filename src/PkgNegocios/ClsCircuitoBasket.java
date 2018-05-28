/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vera
 */
public class ClsCircuitoBasket {
    ClsConexion conexion = new ClsConexion();
    
    public boolean AgregarCircuitoBasket(PkgEntidad.ClsCircuitoBasket bsk) {
        Connection con = null;
        CallableStatement cstm = null;
        boolean resp = true;
       
        try {
             con = conexion.getConecion();
            con.setAutoCommit(false);
            cstm = con.prepareCall("insert into tbCircuitoBasket (idEquipo, puntajeEquipo, posicionEquipo) values (?,?,?);");
            cstm.setInt(1, bsk.getIdEquipo());
            cstm.setInt(2, bsk.getPuntajeEquipo());
            cstm.setString(3, bsk.getPosicionEquipo());
            resp = cstm.execute();
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conexion.Cerrar1(con, cstm);
        }
        return resp;
    }
    
    public List<PkgEntidad.ClsCircuitoBasket> listado() {
        Connection con = null;
        CallableStatement cstm = null;
        ResultSet rs = null;
        List<PkgEntidad.ClsCircuitoBasket> lista = null;
        try {
            lista = new ArrayList<>();
            con = conexion.getConecion();
            cstm = con.prepareCall("select * from tbCircuitoBasket order by puntajeEquipo DESC");
            rs = cstm.executeQuery();
            PkgEntidad.ClsCircuitoBasket bsk = null;
            while (rs.next()) {
                bsk = new PkgEntidad.ClsCircuitoBasket();
                bsk.setIdEquipo(rs.getInt("idEquipo"));
                bsk.setPuntajeEquipo(rs.getInt("puntajeEquipo"));
                bsk.setPosicionEquipo(rs.getString("posicionEquipo"));
                lista.add(bsk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conexion.Cerrar2(cstm, rs);
        }
        return lista;
    }
}
