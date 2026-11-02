package dao;

import model.Perito;
import util.JPAUtil;
import jakarta.persistence.EntityManager;
import java.util.List;

public class PeritoDAO {

    public void salvar(Perito p) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(p); 
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();         
        }
            
            throw new RuntimeException(
                    "Erro ao salvar o perito.", e
            );
            
        } finally {
            em.close();
    }
}    

    public List<Perito> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        
        try {
            return em.createQuery(
                    "SELECT p FROM Perito p ORDER BY p.id", 
                    Perito.class
            ).getResultList();
            
        } catch (Exception e) {
            throw new RuntimeException(
                    "Erro ao listar os peritos.", e
            );
                        
        } finally {
            em.close();
        }
    }

    public void excluir(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        
        try {
            em.getTransaction().begin();
            
            Perito p = em.find(Perito.class, id);
            
            if (p != null) {
                em.remove(p);
            }
            
            em.getTransaction().commit();
            
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            
            throw new RuntimeException(
            "Erro ao excluir o perito.", e
            );
            
            
        } finally {
            em.close();
        }
    }
}