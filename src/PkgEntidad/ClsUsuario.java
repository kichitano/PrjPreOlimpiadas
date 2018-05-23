/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgEntidad;
/**
 *
 * @author Corei7
 */
public class ClsUsuario extends ClsApoderado{
    
    int idUsuario;
    String nombUsuario;
    char estadoUsuario;

    public char getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(char estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
    
    String passUsuario;

    public String getPassUsuario() {
        return passUsuario;
    }

    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }
   

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombUsuario() {
        return nombUsuario;
    }

    public void setNombUsuario(String nombUsuario) {
        this.nombUsuario = nombUsuario;
    }

   
}
