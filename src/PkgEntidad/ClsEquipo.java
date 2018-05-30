/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgEntidad;

/**
 *
 * @author Vera
 */
public class ClsEquipo {
    int idEquipo;
    String nombreEquipo;
    String detalleEquipo;
    char estadoEquipo;
    int idAnio;

    public String getDetalleEquipo() {
        return detalleEquipo;
    }

    public void setDetalleEquipo(String detalleEquipo) {
        this.detalleEquipo = detalleEquipo;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public char getEstadoEquipo() {
        return estadoEquipo;
    }

    public void setEstadoEquipo(char estadoEquipo) {
        this.estadoEquipo = estadoEquipo;
    }

    public int getIdAnio() {
        return idAnio;
    }

    public void setIdAnio(int idAnio) {
        this.idAnio = idAnio;
    }
}
