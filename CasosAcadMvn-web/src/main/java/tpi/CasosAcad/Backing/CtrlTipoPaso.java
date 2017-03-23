/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi.CasosAcad.Backing;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import tpi.CasosAcad.EntidadesMvn.TipoPaso;

import tpi.CasosAcad.Sesiones.TipoPasoFacadeLocal;

/**
 *
 * @author manuel
 */
@Named(value = "ctrlTipoPaso")
@ViewScoped
public class CtrlTipoPaso implements Serializable {

    @EJB
    private TipoPasoFacadeLocal tipoPasoFacade;

    private TipoPaso tp;

    /**
     * Creates a new instance of CtrlTipoPaso
     */
    public CtrlTipoPaso() {
    }

    public TipoPasoFacadeLocal getTipoPasoFacade() {
        return tipoPasoFacade;
    }

    public void setTipoPasoFacade(TipoPasoFacadeLocal tipoPasoFacade) {
        this.tipoPasoFacade = tipoPasoFacade;
    }

    public TipoPaso getTp() {
        return tp;
    }

    public void setTp(TipoPaso tp) {
        this.tp = tp;
    }

    public List<TipoPaso> findAll() {
        return this.tipoPasoFacade.findAll();

    }

    public String add() {
        this.tipoPasoFacade.create(this.tp);
        this.tp = new TipoPaso();
        return "tPaso";

    }

    public void borrar(TipoPaso tp) {
        this.tipoPasoFacade.remove(tp);

    }

    public String editar(TipoPaso tp) {

        this.tp = tp;
        return "editarTipoPaso";
    }

    public String editar() {

        this.tipoPasoFacade.edit(this.tp);
        return "tPaso";
    }

}
