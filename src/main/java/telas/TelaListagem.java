package telas;


import model.Perito;
import service.PeritoService;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class TelaListagem extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaListagem.class.getName());

    public TelaListagem() {
        initComponents();
        this.setSize(600, 500); // Define o tamanho solicitado
        this.setLocationRelativeTo(null); // Abre a janela centralizada na tela
        carregarDados(); // Chama o método de busca
    }
    public void carregarDados() {
        try {
            PeritoService service = new PeritoService();

            List<Perito> lista = service.listarTodos();

            DefaultTableModel modelo =
                (DefaultTableModel) tblListagem.getModel();

            modelo.setRowCount(0);

            for (Perito p : lista) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getCpf(),
                    p.getEmail()
                });
            }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(
                this,
                "Erro ao carregar listagem: " + e.getMessage()
        );
    }
}     
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListagem = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 500));

        tblListagem.setBackground(new java.awt.Color(230, 230, 230));
        tblListagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Email"
            }
        ));
        tblListagem.setPreferredSize(new java.awt.Dimension(600, 500));
        jScrollPane1.setViewportView(tblListagem);

        jPanel1.setBackground(new java.awt.Color(70, 90, 140));

        jLabel1.setBackground(new java.awt.Color(70, 90, 140));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listagem de Peritos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(181, 181, 181))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnVoltar.setBackground(new java.awt.Color(70, 90, 140));
        btnVoltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setPreferredSize(new java.awt.Dimension(80, 40));
        btnVoltar.addActionListener(this::btnVoltarActionPerformed);

        btnExcluir.setBackground(new java.awt.Color(70, 90, 140));
        btnExcluir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setMaximumSize(new java.awt.Dimension(82, 29));
        btnExcluir.setMinimumSize(new java.awt.Dimension(82, 29));
        btnExcluir.setPreferredSize(new java.awt.Dimension(80, 40));
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // 1. Instancia a tela principal (Relatório de Alvarás)
        TelaRelatorioAlvaras telaPrincipal = new TelaRelatorioAlvaras();
    
    // 2. Aplica as configurações de tamanho e centralização
        telaPrincipal.setSize(1000, 600); 
        telaPrincipal.setLocationRelativeTo(null);
    
    // 3. Torna a principal visível e fecha a listagem atual
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
    
            int linhaSelecionada = tblListagem.getSelectedRow();

            if (linhaSelecionada == -1) {
                JOptionPane.showMessageDialog(
                    this,
                    "Selecione um perito na tabela para excluir."
                );
                return;
    }

            int id = Integer.parseInt(
                tblListagem.getValueAt(linhaSelecionada, 0).toString()
            );

    
            int confirmacao = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente excluir este perito?",
                "Confirmar exclusão",
                JOptionPane.YES_NO_OPTION
            );

            if (confirmacao == JOptionPane.YES_OPTION) {

                PeritoService service = new PeritoService();
                service.excluir(id);

                JOptionPane.showMessageDialog(
                    this,
                    "Perito excluído com sucesso!"
                );
        
                carregarDados();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                this,
                "Erro ao excluir perito: " + e.getMessage()
            );
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaListagem().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListagem;
    // End of variables declaration//GEN-END:variables
}
