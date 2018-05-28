/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgLogico;

import PkgNegocios.ClsCircuitoBasket;

import java.util.List;

/**
 *
 * @author Vera
 */
public class ClsCircuitoBasketLog {
     ClsCircuitoBasket bsk = new ClsCircuitoBasket();

    public boolean AgregarCircuitoBasket(PkgEntidad.ClsCircuitoBasket bsq) {
        return bsk.AgregarCircuitoBasket(bsq);
    }

    public List<PkgEntidad.ClsCircuitoBasket> listado() {
      return bsk.listado();
    }
}
