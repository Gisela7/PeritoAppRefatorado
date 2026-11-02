package telas;

import model.Alvara;    // Importa a entidade Alvara
import java.util.Date;  // Necessário para lidar com datas
import java.text.SimpleDateFormat; // Necessário para converter a String da tela para Date
import javax.swing.JOptionPane;     // Necessário para as mensagens de aviso
import service.AlvaraService;

public class TelaCadastroAlvara extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCadastroAlvara.class.getName());

    public TelaCadastroAlvara() {
        initComponents();
        this.setSize(600, 500); 
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtProcesso = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        chkPago = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 230, 230));

        txtNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNome.addActionListener(this::txtNomeActionPerformed);

        txtTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTipo.addActionListener(this::txtTipoActionPerformed);

        txtProcesso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtProcesso.addActionListener(this::txtProcessoActionPerformed);

        txtValor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtValor.addActionListener(this::txtValorActionPerformed);

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtData.addActionListener(this::txtDataActionPerformed);

        chkPago.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        chkPago.setText("Pago");
        chkPago.addActionListener(this::chkPagoActionPerformed);

        btnSalvar.setBackground(new java.awt.Color(70, 90, 140));
        btnSalvar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setPreferredSize(new java.awt.Dimension(100, 35));
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        jPanel1.setBackground(new java.awt.Color(70, 90, 140));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cadastro de Alvarás");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lblNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        lblTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTipo.setText("Tipo:");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Processo:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Valor:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Data:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTipo)
                                            .addComponent(lblNome))
                                        .addGap(35, 35, 35))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipo)
                            .addComponent(txtProcesso)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtData, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValor))
                                .addGap(48, 48, 48)
                                .addComponent(chkPago)
                                .addGap(85, 85, 85))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(chkPago))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       try {
        
          Alvara alvara = criarAlvaraComDadosDaTela();
           
          AlvaraService service = new AlvaraService();          
          service.cadastrarAlvara(alvara);

           JOptionPane.showMessageDialog(
                   this, 
                   "Alvará cadastrado com sucesso!"
           );
        
        // Voltar para a tela principal
        new TelaRelatorioAlvaras().setVisible(true);
        this.dispose();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
                "Erro ao salvar: " + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
        );
    }    
    }//GEN-LAST:event_btnSalvarActionPerformed

    private Alvara criarAlvaraComDadosDaTela() throws Exception {
        Alvara alvara = new Alvara();
        
        alvara.setNome(txtNome.getText().trim());
        alvara.setTipo(txtTipo.getText().trim()); 
        alvara.setProcesso(txtProcesso.getText().trim());
    
        double valor = Double.parseDouble(
                txtValor.getText().trim().replace(",", ".")
        );
        alvara.setValor(valor);
        
        String dataTexto = txtData.getText()
                .replace("/", "")
                .trim();
                
        if (dataTexto.isEmpty()) {
            throw new IllegalArgumentException(
            "A data do alvará é obrigatória."
            );
        }
        
        SimpleDateFormat formatoData = 
                new SimpleDateFormat("dd/MM/yyyy");
        
        formatoData.setLenient(false); 
        
        Date data = formatoData.parse(txtData.getText()); 
        alvara.setDataAlvara(data);
        
        alvara.setPago(chkPago.isSelected()); 
        
        return alvara; 
    }   
    
    
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProcessoActionPerformed

    private void chkPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPagoActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    /**
     * @param args the command line arguments
     */
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
        java.awt.EventQueue.invokeLater(() -> new TelaCadastroAlvara().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkPago;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtProcesso;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
