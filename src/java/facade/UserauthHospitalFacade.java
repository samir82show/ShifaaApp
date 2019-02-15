/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.domain.UserauthHospital;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Samir
 */
@Stateless
public class UserauthHospitalFacade extends AbstractFacade<UserauthHospital> {

    @PersistenceContext(unitName = "ShifaaAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserauthHospitalFacade() {
        super(UserauthHospital.class);
    }
    
}
