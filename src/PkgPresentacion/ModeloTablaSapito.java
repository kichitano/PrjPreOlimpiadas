/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgPresentacion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Vera
 */
public class ModeloTablaSapito extends AbstractTableModel {
     String[] columnas = {"ID", "Ptje.", "Posición","Detalle"};
    public List<PkgEntidad.ClsSapito> sap = new ArrayList<>();

    public ModeloTablaSapito(List<PkgEntidad.ClsSapito> sap) {
        this.sap = sap;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public int getRowCount() {
        return sap.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object resp = null;
        if (columnIndex == 0) {
            resp = sap.get(rowIndex).getIdEquipo();
        } else {
            if (columnIndex == 1) {
                resp = sap.get(rowIndex).getPuntajeEquipo();
            }else if (columnIndex == 2) {
                 resp = sap.get(rowIndex).getPosicionEquipo();
            }else {
                resp = sap.get(rowIndex).getDetalleEquipo();
            }
        }
        return resp;
    }

    public PkgEntidad.ClsSapito DameCircuito(int fila) {
        return sap.get(fila);
    }
}
