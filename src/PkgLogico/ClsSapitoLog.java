/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgLogico;

import PkgEntidad.ClsEquipo;
import PkgNegocios.ClsSapito;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Vera
 */
public class ClsSapitoLog {
    ClsSapito sapitoNeg = new ClsSapito();
    
    public boolean AgregarPuntajeSapito(PkgEntidad.ClsSapito sap, Connection _Con) 
    {
        return sapitoNeg.AgregarPuntajeSapito(sap, _Con);
    }
    public int BorrarDatosSapito(){
       return sapitoNeg.BorrarDatosSapito();
    }
    public void InsertarPosicion(int _IdEquipo, int _PuntajeEquipo ,String _PosicionEquipo)
     {
         sapitoNeg.InsertarPosicion(_IdEquipo, _PuntajeEquipo, _PosicionEquipo);
     }
    public int UpdatePuntaje(int _IdEquipo, int _PuntajeEquipo){
          return sapitoNeg.UpdatePuntaje(_IdEquipo, _PuntajeEquipo);
    }
    public int UpdateEstadoApoderado(int _idApoderado){
        return sapitoNeg.UpdateEstadoApoderado(_idApoderado);
    }
    public List<PkgEntidad.ClsSapito> listado() {
        return sapitoNeg.listado();
    }
    public List<ClsEquipo> listaEquipos(int _idSerie) throws SQLException{
        return sapitoNeg.listaEquipos(_idSerie);
    }
    public List<ClsEquipo> listaParticipantesEquipo(int _idEquipo) throws SQLException{
        return sapitoNeg.listaParticipantesEquipo(_idEquipo);
    }
    public List<ClsEquipo> listaParticipantesEquipoEmpate(int _idEquipo) throws SQLException{
        return sapitoNeg.listaParticipantesEquipoEmpate(_idEquipo);
    }
}
