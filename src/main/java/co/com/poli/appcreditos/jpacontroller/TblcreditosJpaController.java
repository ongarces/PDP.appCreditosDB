package co.com.poli.appcreditos.jpacontroller;

import co.com.poli.appcreditos.jpacontroller.exceptions.NonexistentEntityException;
import co.com.poli.appcreditos.jpacontroller.exceptions.PreexistingEntityException;
import co.com.poli.appcreditos.model.Tblcreditos;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author cgaop
 */
public class TblcreditosJpaController implements Serializable {

    public TblcreditosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tblcreditos tblcreditos) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tblcreditos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findTblcreditos(tblcreditos.getIdcredito()) != null) {
                throw new PreexistingEntityException("Tblcreditos " + tblcreditos + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tblcreditos tblcreditos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tblcreditos = em.merge(tblcreditos);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = tblcreditos.getIdcredito();
                if (findTblcreditos(id) == null) {
                    throw new NonexistentEntityException("The tblcreditos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tblcreditos tblcreditos;
            try {
                tblcreditos = em.getReference(Tblcreditos.class, id);
                tblcreditos.getIdcredito();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tblcreditos with id " + id + " no longer exists.", enfe);
            }
            em.remove(tblcreditos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tblcreditos> findTblcreditosEntities() {
        return findTblcreditosEntities(true, -1, -1);
    }

    public List<Tblcreditos> findTblcreditosEntities(int maxResults, int firstResult) {
        return findTblcreditosEntities(false, maxResults, firstResult);
    }

    private List<Tblcreditos> findTblcreditosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tblcreditos.class));
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

    public Tblcreditos findTblcreditos(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tblcreditos.class, id);
        } finally {
            em.close();
        }
    }

    public int getTblcreditosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tblcreditos> rt = cq.from(Tblcreditos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
