package facade;

import entity.domain.Area;
import entity.domain.Clinic;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public abstract class AbstractFacade<T> {

    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    public List<T> findByEmailPassword(String email, String password) {
        return getEntityManager().createNamedQuery("UserauthHospital.findByEmailPassword")
                .setParameter("email", email)
                .setParameter("password", password)
                .getResultList();
    }

    public List<Object[]> findServicesByHospitalAndClinic(String hospital, String clinic) {

        Query q;

            q = getEntityManager().createNativeQuery("SELECT h.name as hospital, a.name as area, cat.name as clinic FROM hospital h"
                    + " JOIN area a ON a.id=h.area_id JOIN clinic c ON c.hospital_id=h.id"
                    + " JOIN category cat ON cat.id=c.category_id WHERE a.name = '" + hospital + "' AND cat.name = '" + clinic + "'");
            return q.getResultList();
    }

    public Object findhospitalByName(String name) {
        getEntityManager().getEntityManagerFactory().getCache().evictAll();
        return getEntityManager().createNamedQuery("Hospital.findByName")
                .setParameter("name", name)
                .getSingleResult();
    }

    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

}
