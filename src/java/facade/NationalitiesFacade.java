/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.domain.Nationalities;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Samir
 */
@Stateless
public class NationalitiesFacade extends AbstractFacade<Nationalities> {

    @PersistenceContext(unitName = "ShifaaAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NationalitiesFacade() {
        super(Nationalities.class);
    }
    
}
