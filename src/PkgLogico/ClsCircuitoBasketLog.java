/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgLogico;

import PkgEntidad.ClsEquipo;
import PkgNegocios.ClsCircuitoBasket;
import java.sql.Connection;
import java.sql.SQLException;

import java.util.List;

/**
 *
 * @author Vera
 */
public class ClsCircuitoBasketLog {
     ClsCircuitoBasket bsk = new ClsCircuitoBasket();

    public boolean AgregarCircuitoBasket(PkgEntidad.ClsCircuitoBasket bsq, Connection _con) {
        return bsk.AgregarCircuitoBasket(bsq,_con);
    }

    public List<PkgEntidad.ClsCircuitoBasket> listado() {
      return bsk.listado();
    }
    public List<ClsEquipo> listaEquipos(int _idSerie) throws SQLException{
        return bsk.listaEquipos(_idSerie);
    }
    public List<ClsEquipo> listaParticipantesEquipo(int _idEquipo) throws SQLException{
        return bsk.listaParticipantesEquipo(_idEquipo);
    }
   
    public int BorrarDatosBasket() {
        return bsk.BorrarDatosBasket();
    }
    
    public void InsertarPosicion(int _IdEquipo,int _PuntajeEquipo,String _PosicionEquipo) {
        bsk.InsertarPosicion(_IdEquipo,_PuntajeEquipo, _PosicionEquipo);
    }
    public int UpdatePuntaje(int _IdEquipo, int _PuntajeEquipo){
         return bsk.UpdatePuntaje(_IdEquipo, _PuntajeEquipo);
    }
    public int UpdateEstadoApoderado(int _idApoderado){
        return bsk.UpdateEstadoApoderado(_idApoderado);
    }
}
