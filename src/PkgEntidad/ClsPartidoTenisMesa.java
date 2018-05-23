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
public class ClsPartidoTenisMesa {
    int idPartidoTenisMesa;
    int idApoderado;
    int idEquipoLocal;
    int idEquipoVisitante;
    int ronda;
    char estadoPartido;

    public int getIdPartidoTenisMesa() {
        return idPartidoTenisMesa;
    }

    public void setIdPartidoTenisMesa(int idPartidoTenisMesa) {
        this.idPartidoTenisMesa = idPartidoTenisMesa;
    }

    public int getIdApoderado() {
        return idApoderado;
    }

    public void setIdApoderado(int idApoderado) {
        this.idApoderado = idApoderado;
    }

    public int getIdEquipoLocal() {
        return idEquipoLocal;
    }

    public void setIdEquipoLocal(int idEquipoLocal) {
        this.idEquipoLocal = idEquipoLocal;
    }

    public int getIdEquipoVisitante() {
        return idEquipoVisitante;
    }

    public void setIdEquipoVisitante(int idEquipoVisitante) {
        this.idEquipoVisitante = idEquipoVisitante;
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public char getEstadoPartido() {
        return estadoPartido;
    }

    public void setEstadoPartido(char estadoPartido) {
        this.estadoPartido = estadoPartido;
    }
}
