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
public class ClsSetPartidoTenisMesa extends ClsPartidoTenisMesa {

    public int getIdSetPartido() {
        return idSetPartido;
    }

    public void setIdSetPartido(int idSetPartido) {
        this.idSetPartido = idSetPartido;
    }

    public int getNumeroSet() {
        return numeroSet;
    }

    public void setNumeroSet(int numeroSet) {
        this.numeroSet = numeroSet;
    }

    public int getPuntajeLocalSet() {
        return PuntajeLocalSet;
    }

    public void setPuntajeLocalSet(int PuntajeLocalSet) {
        this.PuntajeLocalSet = PuntajeLocalSet;
    }

    public int getPuntajeVisitanteSet() {
        return PuntajeVisitanteSet;
    }

    public void setPuntajeVisitanteSet(int PuntajeVisitanteSet) {
        this.PuntajeVisitanteSet = PuntajeVisitanteSet;
    }

    public char getGanador() {
        return Ganador;
    }

    public void setGanador(char Ganador) {
        this.Ganador = Ganador;
    }
    int idSetPartido;
    int numeroSet;
    int PuntajeLocalSet;
    int PuntajeVisitanteSet;
    char Ganador;
}
