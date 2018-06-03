/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgLogico;

import PkgNegocios.ClsRecogedorPelotas;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Vera
 */
public class ClsRecogedorPelotasLog {
    ClsRecogedorPelotas rpneg = new ClsRecogedorPelotas();
    
     public boolean AgregarRecogedorPelotas(PkgEntidad.ClsRecogedorPelotas bsq, Connection _con) {
        return rpneg.AgregarRecogedorPelotas(bsq,_con);
    }
     public List<PkgEntidad.ClsRecogedorPelotas> listado() {
      return rpneg.listado();
    }
    public int BorrarDatosRecogedorPelotas(){
           return rpneg.BorrarDatosRecogedorPelotas();
    }
    public void InsertarPosicion(int _IdEquipo,int _PuntajeEquipo,String _PosicionEquipo) {
        rpneg.InsertarPosicion(_IdEquipo,_PuntajeEquipo, _PosicionEquipo);
    }
    public int UpdatePuntaje(int _IdEquipo, int _PuntajeEquipo){
        return rpneg.UpdatePuntaje(_IdEquipo, _PuntajeEquipo);
    }
}
