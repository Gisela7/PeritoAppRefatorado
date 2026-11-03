package main;

import telas.TelaLogin;
import util.JPAUtil;
import jakarta.persistence.EntityManager;

public class PeritoApp {

    public static void main(String[] args) {
        
        
        if (args.length > 0 && args[0].equals("--testes")) {
            executarTestes();
            return;
        }
        
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            JPAUtil.fechar();
        }));

        java.awt.EventQueue.invokeLater(() -> {
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
        });
    }
    
    public static void executarTestes() {
        
        System.out.println("========INICIANDO TESTES DO PERITOAPP========");
        
        EntityManager em = null;
        
        try {
            em = JPAUtil.getEntityManager();
            
            em.createQuery(
                    "SELECT p FROM Perito p",
                    model.Perito.class
            ).setMaxResults(1).getResultList();
            
            System.out.println("TESTE 1 - Perito: APROVADO");
            
            em.createQuery(
                    "SELECT a FROM Alvara a",
                    model.Alvara.class
            ).setMaxResults(1).getResultList();
            
            System.out.println("TESTE 2 - Alvara: APROVADO");
            
             em.createQuery(
                    "SELECT u FROM Usuario u",
                    model.Usuario.class
            ).setMaxResults(1).getResultList();

            System.out.println("TESTE 3 - Usuario: APROVADO");

            System.out.println("===== TODOS OS TESTES FORAM CONCLUÍDOS =====");

        } catch (Exception e) {

            System.out.println("ERRO DURANTE OS TESTES:");
            e.printStackTrace();
            
            } finally {

            if (em != null && em.isOpen()) {
                em.close();
            }

            JPAUtil.fechar();
        }
    }
}