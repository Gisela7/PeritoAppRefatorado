package dao;

import jakarta.persistence.EntityManager;
import model.Alvara;
import util.JPAUtil;
import java.util.List;

public class AlvaraDAO {
    
    public void salvar(Alvara alvara) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(alvara);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            
            throw new RuntimeException(
                    "Erro ao salvar o alvará.", e
            );
            
        } finally {
            em.close();
        }
    }
    
    public List<Alvara> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        
        try {
            return em.createQuery(
                    "SELECT a FROM Alvara a ORDER BY a.id",
                    Alvara.class
            ).getResultList();
            
        } catch (Exception e) {
            throw new RuntimeException(
            "Erro ao listar os alvarás.", e
            );
        } finally {
            em.close();
        }
    }
}
