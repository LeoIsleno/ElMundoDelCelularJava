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
import logica.Celulares;
import persistencia.exceptions.NonexistentEntityException;

public class CelularesJpaController implements Serializable {

    public CelularesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    //Con este metodo el JPA va a crear una nueva instancia creando un administrador de propiedades teniendo en cuenta nuestras clases mapeadas
    public CelularesJpaController() {
        emf = Persistence.createEntityManagerFactory("testJPA");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Celulares celulares) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(celulares);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Celulares celulares) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            celulares = em.merge(celulares);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = celulares.getId();
                if (findCelulares(id) == null) {
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
            Celulares celulares;
            try {
                celulares = em.getReference(Celulares.class, id);
                celulares.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The celulares with id " + id + " no longer exists.", enfe);
            }
            em.remove(celulares);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Celulares> findCelularesEntities() {
        return findCelularesEntities(true, -1, -1);
    }

    public List<Celulares> findCelularesEntities(int maxResults, int firstResult) {
        return findCelularesEntities(false, maxResults, firstResult);
    }

    private List<Celulares> findCelularesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Celulares.class));
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

    public Celulares findCelulares(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Celulares.class, id);
        } finally {
            em.close();
        }
    }

    public int getCelularesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Celulares> rt = cq.from(Celulares.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
