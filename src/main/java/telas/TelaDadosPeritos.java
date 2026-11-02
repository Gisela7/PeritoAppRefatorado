package telas;

import service.PeritoService;
import javax.swing.JOptionPane;
import model.Perito;


public class TelaDadosPeritos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = 
            java.util.logging.Logger.getLogger(TelaDadosPeritos.class.getName());

    public TelaDadosPeritos() {
        initComponents();
        this.setSize(600, 500); 
        this.setLocationRelativeTo(null);
    }
    
    private void limparCampos() {
        txtNomePerito.setText("");
        txtCPF.setText("");
        txtEmailPerito.setText("");
        txtBanco.setText("");
        txtAgencia.setText("");
        txtConta.setText("");
        txtNomePerito.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtNomePerito = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtBanco = new javax.swing.JTextField();
        txtAgencia = new javax.swing.JTextField();
        txtConta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmailPerito = new javax.swing.JTextField();
        btnVerListagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 230, 230));

        jPanel1.setBackground(new java.awt.Color(70, 90, 140));

        jLabel1.setBackground(new java.awt.Color(70, 90, 140));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dados Peritos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Banco:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Agência:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Conta:");

        btnSalvar.setBackground(new java.awt.Color(70, 90, 140));
        btnSalvar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setPreferredSize(new java.awt.Dimension(100, 40));
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        btnExcluir.setBackground(new java.awt.Color(70, 90, 140));
        btnExcluir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setPreferredSize(new java.awt.Dimension(100, 40));
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        txtNomePerito.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNomePerito.setPreferredSize(new java.awt.Dimension(180, 25));
        txtNomePerito.addActionListener(this::txtNomePeritoActionPerformed);

        txtCPF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCPF.setPreferredSize(new java.awt.Dimension(180, 25));
        txtCPF.addActionListener(this::txtCPFActionPerformed);

        txtBanco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBanco.setPreferredSize(new java.awt.Dimension(180, 25));
        txtBanco.addActionListener(this::txtBancoActionPerformed);

        txtAgencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAgencia.setPreferredSize(new java.awt.Dimension(100, 25));
        txtAgencia.addActionListener(this::txtAgenciaActionPerformed);

        txtConta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtConta.setPreferredSize(new java.awt.Dimension(100, 25));
        txtConta.addActionListener(this::txtContaActionPerformed);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Email:");

        txtEmailPerito.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmailPerito.setPreferredSize(new java.awt.Dimension(180, 25));
        txtEmailPerito.addActionListener(this::txtEmailPeritoActionPerformed);

        btnVerListagem.setBackground(new java.awt.Color(70, 90, 140));
        btnVerListagem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnVerListagem.setForeground(new java.awt.Color(255, 255, 255));
        btnVerListagem.setText("Ver Listagem");
        btnVerListagem.setPreferredSize(new java.awt.Dimension(80, 40));
        btnVerListagem.addActionListener(this::btnVerListagemActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomePerito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmailPerito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerListagem, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomePerito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmailPerito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    
    try {
        Perito p = new Perito();

        p.setNome(txtNomePerito.getText().trim());
        p.setCpf(txtCPF.getText().trim());
        p.setEmail(txtEmailPerito.getText().trim());
        p.setBanco(txtBanco.getText().trim());
        p.setAgencia(txtAgencia.getText().trim());
        p.setConta(txtConta.getText().trim());

        PeritoService service = new PeritoService();
        service.salvar(p);

        JOptionPane.showMessageDialog(
            this,
            "Perito cadastrado com sucesso!"
        );

        limparCampos();

} catch (IllegalArgumentException e) {

    JOptionPane.showMessageDialog(
            this,
            e.getMessage(),
            "Validação",
            JOptionPane.WARNING_MESSAGE
    );

} catch (Exception e) {

    logger.severe("Erro ao salvar perito: " + e.getMessage());

    JOptionPane.showMessageDialog(
            this,
            "Erro ao salvar: " + e.getMessage()
    );
}
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        JOptionPane.showMessageDialog(this, "Para excluir, selecione um perito na tela de listagem.");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContaActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtNomePeritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePeritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePeritoActionPerformed

    private void txtBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBancoActionPerformed

    private void txtAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgenciaActionPerformed

    private void txtEmailPeritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailPeritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailPeritoActionPerformed

    private void btnVerListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerListagemActionPerformed
      try{ 
        TelaListagem lista = new TelaListagem();
        lista.setVisible(true);
    // fechar a tela atual ao abrir a listagem
        this.dispose();
    }//GEN-LAST:event_btnVerListagemActionPerformed
      catch (Exception e) {
          JOptionPane.showMessageDialog(this, "Erro ao abrir listagem: " + e.getMessage());
        }
      }
    
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new TelaDadosPeritos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVerListagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtConta;
    private javax.swing.JTextField txtEmailPerito;
    private javax.swing.JTextField txtNomePerito;
    // End of variables declaration//GEN-END:variables
}
