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
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import tpi.CasosAcad.EntidadesMvn.TipoRequisito;
import tpi.CasosAcad.Sesiones.TipoRequisitoFacade;
import tpi.CasosAcad.Sesiones.TipoRequisitoFacadeLocal;

/**
 *
 * @author manuel
 */
@Named(value = "frmTipoRequisito")
@ViewScoped
public class FrmTipoRequisito implements Serializable {

    /**
     * Creates a new instance of FrmTipoRequisito
     */
    @EJB
    private TipoRequisitoFacadeLocal tipoF;
    
    private List<TipoRequisito> registro;
    private TipoRequisito objeto;

    public TipoRequisito getObjeto() {
        return objeto;
    }

    public void setObjeto(TipoRequisito objeto) {
        this.objeto = objeto;
    }

  
    
    
    @PostConstruct
    public void init(){
    
    try{
        
        this.registro=tipoF.findAll();
        
    }catch(Exception e){
    
    }
    
    }
    
    

    
    public TipoRequisitoFacadeLocal getTipoF() {
        return tipoF;
    }

    public void setTipoF(TipoRequisitoFacadeLocal tipoF) {
        this.tipoF = tipoF;
    }

    public List<TipoRequisito> getRegistro() {
        return registro;
    }

    public void setRegistro(List<TipoRequisito> registro) {
        this.registro = registro;
    }
    
    public FrmTipoRequisito() {
    }
    

    public void nuevoTipoRequisito(ActionEvent ae){
    
    try{
       
    //   this.objeto= new TipoRequisito();
      // this.objeto.setActivo(true);                          
        
    }catch(Exception e){
       
        System.err.println("AQUI!"+e);
    }
        
    }    
    
    public void guardarTipoRequisito(ActionEvent ae){
    
    //tipoF.create(objeto);
    
    }

    
}
