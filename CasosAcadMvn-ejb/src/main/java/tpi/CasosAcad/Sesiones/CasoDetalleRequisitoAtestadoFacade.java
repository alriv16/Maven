/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi.CasosAcad.Sesiones;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tpi.CasosAcad.EntidadesMvn.CasoDetalleRequisitoAtestado;

/**
 *
 * @author manuel
 */
@Stateless
public class CasoDetalleRequisitoAtestadoFacade extends AbstractFacade<CasoDetalleRequisitoAtestado> implements CasoDetalleRequisitoAtestadoFacadeLocal {

    @PersistenceContext(unitName = "TPI.CasosAcademica_CasosAcadMvn-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CasoDetalleRequisitoAtestadoFacade() {
        super(CasoDetalleRequisitoAtestado.class);
    }
    
}
