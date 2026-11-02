package main;

import telas.TelaLogin;
import util.JPAUtil;

public class PeritoApp {

    public static void main(String[] args) {
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            JPAUtil.fechar();
        }));

        java.awt.EventQueue.invokeLater(() -> {
            TelaLogin tela = new TelaLogin();
            tela.setVisible(true);
        });
    }
}