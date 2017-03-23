/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi.CasosAcad.Backing;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import tpi.CasosAcad.EntidadesMvn.TipoPaso;
import tpi.CasosAcad.Sesiones.TipoPasoFacadeLocal;

/**
 *
 * @author manuel
 */
@Named(value = "frmTipoPaso")
@ViewScoped
public class FrmTipoPaso implements Serializable{

    @EJB
    private TipoPasoFacadeLocal pasoF;
    
    private List<TipoPaso> tipoPaso;

    public TipoPasoFacadeLocal getPasoF() {
        return pasoF;
    }

    public void setPasoF(TipoPasoFacadeLocal pasoF) {
        this.pasoF = pasoF;
    }

    public List<TipoPaso> getTipoPaso() {
        return tipoPaso;
    }

    public void setTipoPaso(List<TipoPaso> tipoPaso) {
        this.tipoPaso = tipoPaso;
    }

    
    @PostConstruct
    public void init(){
    try{
     this.tipoPaso=pasoF.findAll();
    
    }catch(Exception e){
    
    }
   }
    
    /**
     * Creates a new instance of FrmTipoPaso
     */
    public FrmTipoPaso() {
    }
    
}
