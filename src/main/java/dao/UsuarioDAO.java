package dao;

import model.Usuario;
import util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;

public class UsuarioDAO {

    // ================= LOGIN =================
    public Usuario login(String email, String senha) {

        EntityManager em = JPAUtil.getEntityManager();

        try {
            TypedQuery<Usuario> query = em.createQuery(
                "SELECT u FROM Usuario u WHERE u.email = :email AND u.senha = :senha",
                Usuario.class
            );

            query.setParameter("email", email);
            query.setParameter("senha", senha);

            return query.getSingleResult();

        } catch (NoResultException e) {
            return null; // login inválido
        } finally {
            em.close();
        }
    }

    // ================= CADASTRAR =================
    public void salvar(Usuario u) {

        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();

        } catch (Exception e) {

            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }

            throw new RuntimeException("Erro ao salvar o usuário.", e);

        } finally {
            em.close();
        }
    }

    // ================= BUSCAR POR EMAIL =================
    public Usuario buscarPorEmail(String email) {

        EntityManager em = JPAUtil.getEntityManager();

        try {
            TypedQuery<Usuario> query = em.createQuery(
                "SELECT u FROM Usuario u WHERE u.email = :email",
                Usuario.class
            );

            query.setParameter("email", email);

            return query.getSingleResult();

        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }
}