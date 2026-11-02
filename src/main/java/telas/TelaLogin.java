package telas;

import model.Usuario;
import javax.swing.JOptionPane;
import service.UsuarioService;

public class TelaLogin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = 
            java.util.logging.Logger.getLogger(TelaLogin.class.getName());

    
    public TelaLogin() {
        initComponents();        
        this.setSize(600, 500);    
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lblCriarLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 245, 245));
        setSize(new java.awt.Dimension(400, 600));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSenha.setText("Senha");

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSenha.addActionListener(this::txtSenhaActionPerformed);

        btnEntrar.setBackground(new java.awt.Color(70, 90, 140));
        btnEntrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(this::btnEntrarActionPerformed);

        lblCriarLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCriarLogin.setText("Criar login");
        lblCriarLogin.setAlignmentY(0.0F);
        lblCriarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCriarLoginMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(70, 90, 140));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 100));

        lblLogin.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("LOGIN");
        lblLogin.setAlignmentX(130.0F);
        lblLogin.setAlignmentY(20.0F);
        lblLogin.setAutoscrolls(true);
        lblLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLogin.setMaximumSize(new java.awt.Dimension(200, 40));
        lblLogin.setMinimumSize(new java.awt.Dimension(200, 40));
        lblLogin.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.addActionListener(this::txtEmailActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCriarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCriarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        
        String email = txtEmail.getText().trim();
        String senha = new String(txtSenha.getPassword());

        // Validação básica
        if (email.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Preencha email e senha!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        
         try {
            UsuarioService service = new UsuarioService();
            Usuario usuario = service.login(email, senha);

            if (usuario != null) {

                JOptionPane.showMessageDialog(this,
                        "Bem-vindo, " + usuario.getNome());

                
                TelaRelatorioAlvaras principal = new TelaRelatorioAlvaras();
// Criar a instância da próxima tela
                principal.setSize(1000, 600); 
                principal.setLocationRelativeTo(null);
                principal.setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(this,
                        "Email ou senha inválidos!",
                        "Erro de login",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            logger.severe("Erro no login: " + e.getMessage());

            JOptionPane.showMessageDialog(this,
                    "Erro ao conectar com o sistema.",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void lblCriarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCriarLoginMouseClicked
        
        TelaCadastro telaCad = new TelaCadastro();
        telaCad.setSize(500, 400); // Mantém o padrão
        telaCad.setLocationRelativeTo(null);
        telaCad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCriarLoginMouseClicked

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
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCriarLogin;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
