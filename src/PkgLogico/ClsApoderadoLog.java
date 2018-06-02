/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgLogico;

import PkgEntidad.ClsAnio;
import PkgEntidad.ClsDisciplina;
import PkgNegocios.ClsApoderado;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Vera
 */
public class ClsApoderadoLog {
     ClsApoderado bsknegocios = new ClsApoderado();
     
     public boolean verificarPertenenciaDisciplina(String _dni) throws SQLException{
         return bsknegocios.verificarPertenenciaDisciplina(_dni);
     }
     
     public List<ClsDisciplina> listaDisciplinas() throws SQLException{
         return bsknegocios.listaDisciplinas();
     }
     public List<ClsAnio> listaAnios() throws SQLException{
         return bsknegocios.listaAnios();
     }
     public void InsertarApoderado(
             int _idAnio ,int _idDisciplina, String _dni, 
             String _apePaterno, String _apeMaterno, String _nombresApoderado, 
             String _estadoApoderado
             ) {
        bsknegocios.InsertarApoderado(_idAnio,_idDisciplina, _dni, _apePaterno, 
                _apeMaterno, _nombresApoderado, _estadoApoderado);
     }
  
}
