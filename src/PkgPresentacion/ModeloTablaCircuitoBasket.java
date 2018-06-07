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
public class ModeloTablaCircuitoBasket  extends AbstractTableModel {
    String[] columnas = {"ID", "Ptje.", "Posición","Nombre"};
    public List<PkgEntidad.ClsCircuitoBasket> bsk = new ArrayList<>();

    public ModeloTablaCircuitoBasket(List<PkgEntidad.ClsCircuitoBasket> bsk) {
        this.bsk = bsk;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public int getRowCount() {
        return bsk.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object resp = null;
        if (columnIndex == 0) {
            resp = bsk.get(rowIndex).getIdEquipo();
        } else {
            if (columnIndex == 1) {
                resp = bsk.get(rowIndex).getPuntajeEquipo();
            }else if (columnIndex == 2) {
                 resp = bsk.get(rowIndex).getPosicionEquipo();
            }else {
                resp = bsk.get(rowIndex).getNombreEquipo();
            }
        }
        return resp;
    }

    public PkgEntidad.ClsCircuitoBasket DameCircuito(int fila) {
        return bsk.get(fila);
    }
}
