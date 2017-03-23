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
import tpi.CasosAcad.EntidadesMvn.TipoRequisito;
import tpi.CasosAcad.Sesiones.TipoRequisitoFacadeLocal;

/**
 *
 * @author manuel
 */
@Named(value = "ctrlTipoRequisito")
@ViewScoped
public class CtrlTipoRequisito implements Serializable {

    
    @EJB
    private TipoRequisitoFacadeLocal tipoRequisitoFacade;

    public TipoRequisitoFacadeLocal getTipoRequisitoFacade() {
        return tipoRequisitoFacade;
    }

    public void setTipoRequisitoFacade(TipoRequisitoFacadeLocal tipoRequisitoFacade) {
        this.tipoRequisitoFacade = tipoRequisitoFacade;
    }

    public TipoRequisito getTr() {
        return tr;
    }

    public void setTr(TipoRequisito tr) {
        this.tr = tr;
    }
    private TipoRequisito tr = new TipoRequisito();
    
    
    /**
     * Creates a new instance of CtrlTipoRequisito
     */
    public CtrlTipoRequisito() {
    }
    public List<TipoRequisito> findAll(){
    return this.tipoRequisitoFacade.findAll();
    
    }
public String add(){
this.tipoRequisitoFacade.create(this.tr);
this.tr=new TipoRequisito();
return "trP";

}
public void borrar(TipoRequisito tr){
this.tipoRequisitoFacade.remove(tr);

}

public String editar(TipoRequisito tr) {

    this.tr= tr;
    return "edittr";
}
public String editar() {

    this.tipoRequisitoFacade.edit(this.tr);
    return "trP";
}

    
}
