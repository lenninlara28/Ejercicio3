/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author hp 14
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtSaldoini = new javax.swing.JTextField();
        cmdHacer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TxtSaldofinal = new javax.swing.JTextField();
        cmdNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Monto Por Ahorradores");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Digite Su Saldo Inicial : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        TxtSaldoini.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtSaldoiniKeyTyped(evt);
            }
        });
        jPanel1.add(TxtSaldoini, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 60, 110, -1));

        cmdHacer.setBackground(new java.awt.Color(0, 0, 0));
        cmdHacer.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdHacer.setForeground(new java.awt.Color(255, 255, 255));
        cmdHacer.setText("Consultar");
        cmdHacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdHacerActionPerformed(evt);
            }
        });
        jPanel1.add(cmdHacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Su Saldo Final Es: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        TxtSaldofinal.setEditable(false);
        jPanel1.add(TxtSaldofinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 130, -1));

        cmdNuevo.setBackground(new java.awt.Color(0, 0, 0));
        cmdNuevo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmdNuevo.setText("Nueva Consulta");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdHacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHacerActionPerformed
        String SaldoF;
        double saldoi;
        
        if (TxtSaldoini.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite Su Saldo Inicial","error", JOptionPane.ERROR_MESSAGE);
         TxtSaldoini.requestFocusInWindow();}
        else{
        
        saldoi=Double.parseDouble(TxtSaldoini.getText());
        double saldof=saldoi+((saldoi*1.5)/100);
        SaldoF=String.valueOf(saldof);
     TxtSaldofinal.setText(SaldoF);
        }
    }//GEN-LAST:event_cmdHacerActionPerformed

    private void TxtSaldoiniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSaldoiniKeyTyped
        char c=evt.getKeyChar(); 
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
              evt.consume();}
    }//GEN-LAST:event_TxtSaldoiniKeyTyped

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
       TxtSaldoini.setText("");
       TxtSaldofinal.setText("");
       TxtSaldoini.requestFocusInWindow();
    }//GEN-LAST:event_cmdNuevoActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtSaldofinal;
    private javax.swing.JTextField TxtSaldoini;
    private javax.swing.JButton cmdHacer;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
