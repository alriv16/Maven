/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpi.CasosAcad.Sesiones;

import java.util.List;
import javax.ejb.Local;
import tpi.CasosAcad.EntidadesMvn.Caso;

/**
 *
 * @author manuel
 */
@Local
public interface CasoFacadeLocal {

    void create(Caso caso);

    void edit(Caso caso);

    void remove(Caso caso);

    Caso find(Object id);

    List<Caso> findAll();

    List<Caso> findRange(int[] range);

    int count();
    
}
