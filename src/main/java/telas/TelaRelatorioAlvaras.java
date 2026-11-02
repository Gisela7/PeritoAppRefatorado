package telas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import service.AlvaraService;
import model.Alvara;

public class TelaRelatorioAlvaras extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = 
            java.util.logging.Logger.getLogger(TelaRelatorioAlvaras.class.getName());

    
    public TelaRelatorioAlvaras() {
        initComponents();
        this.setSize(1000, 600); // Define um tamanho bom para ver a tabela
        this.setLocationRelativeTo(null);
        
        configurarData();
        atualizarTabela();
    }
    
    private void configurarData() {
        LocalDate dataHoje = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd 'de' MMM 'de' yyyy", new Locale("pt", "BR"));
        lblDataAtual.setText(dataHoje.format(formatador));
    }
    
    public void atualizarTabela() {
        try {
            AlvaraService service = new AlvaraService();
            List<Alvara> lista = service.listarAlvaras();

            DefaultTableModel modelo = 
                    (DefaultTableModel) tblAlvaras.getModel();
            
            modelo.setNumRows(0);

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            for (Alvara a : lista) {
                modelo.addRow(new Object[]{
                    a.getNome(),
                    a.getTipo(),
                    a.getProcesso(),
                    "R$ " + String.format(
                            Locale.US, "%.2f", a.getValor()),
                    a.getDataAlvara() != null 
                            ? sdf.format(a.getDataAlvara()) : "",
                    a.isPago()
                });
            }
            
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(
                    this, 
                    "Erro ao carregar relatório: " + e.getMessage()
            );
        }
    }    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDashboard = new javax.swing.JLabel();
        lblCadastroPeritos = new javax.swing.JLabel();
        lblCadastroAlvaras = new javax.swing.JLabel();
        lblAuditoria = new javax.swing.JLabel();
        lblBackup = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblRelatorioAlvaras = new javax.swing.JLabel();
        btnNovoAlvara = new javax.swing.JButton();
        lblDataAtual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlvaras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(70, 90, 140));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SISTEMA PERITOS");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Versão 1.0 - Desktop");

        lblDashboard.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Align-Vertical-Bottom--Streamline-Outlined-Material-Symbols.png"))); // NOI18N
        lblDashboard.setText("Dashboard");
        lblDashboard.setIconTextGap(15);
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });

        lblCadastroPeritos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCadastroPeritos.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroPeritos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Person--Streamline-Outlined-Material-Symbols.png"))); // NOI18N
        lblCadastroPeritos.setText("Cadastro Peritos");
        lblCadastroPeritos.setIconTextGap(15);
        lblCadastroPeritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastroPeritosMouseClicked(evt);
            }
        });

        lblCadastroAlvaras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCadastroAlvaras.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastroAlvaras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/List--Streamline-Outlined-Material-Symbols.png"))); // NOI18N
        lblCadastroAlvaras.setText("Cadastro de Alvarás");
        lblCadastroAlvaras.setIconTextGap(15);
        lblCadastroAlvaras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastroAlvarasMouseClicked(evt);
            }
        });

        lblAuditoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAuditoria.setForeground(new java.awt.Color(255, 255, 255));
        lblAuditoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/History--Streamline-Outlined-Material-Symbols.png"))); // NOI18N
        lblAuditoria.setText("Auditoria/Histórico");
        lblAuditoria.setIconTextGap(15);
        lblAuditoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAuditoriaMouseClicked(evt);
            }
        });

        lblBackup.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBackup.setForeground(new java.awt.Color(255, 255, 255));
        lblBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Database--Streamline-Outlined-Material-Symbols.png"))); // NOI18N
        lblBackup.setText("Backup e Importação");
        lblBackup.setIconTextGap(15);
        lblBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackupMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCadastroAlvaras)
                            .addComponent(lblAuditoria)
                            .addComponent(lblBackup)
                            .addComponent(lblCadastroPeritos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(46, 46, 46)
                .addComponent(lblDashboard)
                .addGap(29, 29, 29)
                .addComponent(lblCadastroPeritos)
                .addGap(33, 33, 33)
                .addComponent(lblCadastroAlvaras)
                .addGap(36, 36, 36)
                .addComponent(lblAuditoria)
                .addGap(31, 31, 31)
                .addComponent(lblBackup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblRelatorioAlvaras.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblRelatorioAlvaras.setForeground(new java.awt.Color(70, 90, 140));
        lblRelatorioAlvaras.setText("Relatório de Alvarás");
        lblRelatorioAlvaras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRelatorioAlvarasMouseClicked(evt);
            }
        });

        btnNovoAlvara.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNovoAlvara.setForeground(new java.awt.Color(70, 90, 140));
        btnNovoAlvara.setText("+ Novo Alvará");
        btnNovoAlvara.setBorder(null);
        btnNovoAlvara.addActionListener(this::btnNovoAlvaraActionPerformed);

        lblDataAtual.setBackground(new java.awt.Color(70, 90, 140));
        lblDataAtual.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDataAtual.setForeground(new java.awt.Color(255, 255, 255));
        lblDataAtual.setText("Data atual");
        lblDataAtual.setOpaque(true);

        tblAlvaras.setBackground(new java.awt.Color(230, 230, 230));
        tblAlvaras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Tipo Alvará", "Processo", "Valor", "Data", "Pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAlvaras);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblRelatorioAlvaras)
                        .addGap(59, 59, 59)
                        .addComponent(btnNovoAlvara)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(lblDataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(285, 285, 285))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDataAtual)
                        .addComponent(btnNovoAlvara))
                    .addComponent(lblRelatorioAlvaras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(490, 490, 490))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblCadastroPeritosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastroPeritosMouseClicked
        TelaDadosPeritos tela = new TelaDadosPeritos();
        tela.setVisible(true);
        this.dispose(); // Fecha a tela de relatório e abre a de peritos
    }//GEN-LAST:event_lblCadastroPeritosMouseClicked

    private void lblCadastroAlvarasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastroAlvarasMouseClicked
        TelaCadastroAlvara tela = new TelaCadastroAlvara();
        tela.setVisible(true); // Sem esta linha, a tela não aparece.
        tela.setLocationRelativeTo(null); // Centraliza conforme o padrão
        this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_lblCadastroAlvarasMouseClicked

    private void lblAuditoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAuditoriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAuditoriaMouseClicked

    private void lblBackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackupMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBackupMouseClicked

    private void lblRelatorioAlvarasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatorioAlvarasMouseClicked
        atualizarTabela();
    }//GEN-LAST:event_lblRelatorioAlvarasMouseClicked

    private void btnNovoAlvaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAlvaraActionPerformed
        TelaCadastroAlvara telaFormulario = new TelaCadastroAlvara();
        telaFormulario.setVisible(true);
        telaFormulario.setLocationRelativeTo(null);
        this.dispose(); // Fecha esta tela de relatório
    }//GEN-LAST:event_btnNovoAlvaraActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new TelaRelatorioAlvaras().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoAlvara;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAuditoria;
    private javax.swing.JLabel lblBackup;
    private javax.swing.JLabel lblCadastroAlvaras;
    private javax.swing.JLabel lblCadastroPeritos;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblDataAtual;
    private javax.swing.JLabel lblRelatorioAlvaras;
    private javax.swing.JTable tblAlvaras;
    // End of variables declaration//GEN-END:variables
}
