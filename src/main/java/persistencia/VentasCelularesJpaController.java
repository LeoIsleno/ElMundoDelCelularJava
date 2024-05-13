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
import logica.VentasCelulares;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Usuario
 */
public class VentasCelularesJpaController implements Serializable {

    public VentasCelularesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    //Con este metodo el JPA va a crear una nueva instancia creando un administrador de propiedades teniendo en cuenta nuestras clases mapeadas
    public VentasCelularesJpaController() {
        emf = Persistence.createEntityManagerFactory("testJPA");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(VentasCelulares ventasCelulares) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(ventasCelulares);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(VentasCelulares ventasCelulares) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ventasCelulares = em.merge(ventasCelulares);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = ventasCelulares.getId();
                if (findVentasCelulares(id) == null) {
                    throw new NonexistentEntityException("The ventasCelulares with id " + id + " no longer exists.");
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
            VentasCelulares ventasCelulares;
            try {
                ventasCelulares = em.getReference(VentasCelulares.class, id);
                ventasCelulares.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ventasCelulares with id " + id + " no longer exists.", enfe);
            }
            em.remove(ventasCelulares);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<VentasCelulares> findVentasCelularesEntities() {
        return findVentasCelularesEntities(true, -1, -1);
    }

    public List<VentasCelulares> findVentasCelularesEntities(int maxResults, int firstResult) {
        return findVentasCelularesEntities(false, maxResults, firstResult);
    }

    private List<VentasCelulares> findVentasCelularesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(VentasCelulares.class));
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

    public VentasCelulares findVentasCelulares(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(VentasCelulares.class, id);
        } finally {
            em.close();
        }
    }

    public int getVentasCelularesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<VentasCelulares> rt = cq.from(VentasCelulares.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
