/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Reparaciones;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Usuario
 */
public class ReparacionesJpaController implements Serializable {

    public ReparacionesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    //Con este metodo el JPA va a crear una nueva instancia creando un administrador de propiedades teniendo en cuenta nuestras clases mapeadas
    public ReparacionesJpaController() {
        emf = Persistence.createEntityManagerFactory("testJPA");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Reparaciones rep) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(rep);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Reparaciones rep) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            rep = em.merge(rep);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = rep.getId();
                if (findReparacion(id) == null) {
                    throw new NonexistentEntityException("The celulares with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Reparaciones rep;
            try {
                rep = em.getReference(Reparaciones.class, id);
                rep.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The reparacion with id " + id + " no longer exists.", enfe);
            }
            em.remove(rep);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Reparaciones> findReparacionEntities() {
        return findReparacionEntities(true, -1, -1);
    }

    public List<Reparaciones> findReparacionEntities(int maxResults, int firstResult) {
        return findReparacionEntities(false, maxResults, firstResult);
    }

    private List<Reparaciones> findReparacionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Reparaciones.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Reparaciones findReparacion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Reparaciones.class, id);
        } finally {
            em.close();
        }
    }

    public int getReparacionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Reparaciones> rt = cq.from(Reparaciones.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
