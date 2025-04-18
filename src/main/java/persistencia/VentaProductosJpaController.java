package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.VentaProductos;
import logica.VentasCelulares;
import persistencia.exceptions.NonexistentEntityException;


public class VentaProductosJpaController implements Serializable {

    public VentaProductosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    //Con este metodo el JPA va a crear una nueva instancia creando un administrador de propiedades teniendo en cuenta nuestras clases mapeadas
    public VentaProductosJpaController() {
        emf = Persistence.createEntityManagerFactory("testJPA");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(VentaProductos ventaProductos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(ventaProductos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(VentaProductos ventaProductos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ventaProductos = em.merge(ventaProductos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = ventaProductos.getId();
                if (findVentaProductos(id) == null) {
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
            VentaProductos ventaProductos;
            try {
                ventaProductos = em.getReference(VentaProductos.class, id);
                ventaProductos.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ventasCelulares with id " + id + " no longer exists.", enfe);
            }
            em.remove(ventaProductos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<VentaProductos> findVentaProductosEntities() {
        return findVentaProductosEntities(true, -1, -1);
    }

    public List<VentaProductos> findVentaProductosEntities(int maxResults, int firstResult) {
        return findVentaProductosEntities(false, maxResults, firstResult);
    }

    private List<VentaProductos> findVentaProductosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(VentaProductos.class));
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

    public VentaProductos findVentaProductos(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(VentaProductos.class, id);
        } finally {
            em.close();
        }
    }

    public int getVentaProductosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<VentaProductos> rt = cq.from(VentaProductos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
