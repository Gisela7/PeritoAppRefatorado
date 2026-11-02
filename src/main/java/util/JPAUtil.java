package util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("PeritoPU");

    public static EntityManager getEntityManager() {
        
        if (!emf.isOpen()) {
            throw new IllegalStateException(
                    "A fábrica de conexões está fechada."
            );
        }
        
        
        return emf.createEntityManager();
    }
    
    public static void fechar() {
        if (emf.isOpen()) {
            emf.close();
        }
    }
}
