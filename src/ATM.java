/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Saurabh Manikeri
 */
public class ATM extends javax.swing.JFrame {

    /**
     * Creates new form ATM
     * @param id
     * @param pass
     */
    long idd=0;
    String pas = " ";
    public ATM(long id, String pass) {
        initComponents();
        idd = id;
        pas  = pass;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        withdrawal = new javax.swing.JButton();
        deposite = new javax.swing.JButton();
        changePIN = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        withdrawal.setBackground(new java.awt.Color(102, 255, 255));
        withdrawal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        withdrawal.setText("WITHDRAWAL");
        withdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawalActionPerformed(evt);
            }
        });
        getContentPane().add(withdrawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 220, -1));

        deposite.setBackground(new java.awt.Color(102, 255, 255));
        deposite.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        deposite.setText("DEPOSITE");
        deposite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositeActionPerformed(evt);
            }
        });
        getContentPane().add(deposite, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 220, -1));

        changePIN.setBackground(new java.awt.Color(102, 255, 255));
        changePIN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        changePIN.setText("CHANGE PIN");
        changePIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePINActionPerformed(evt);
            }
        });
        getContentPane().add(changePIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 220, -1));

        jButton2.setBackground(new java.awt.Color(51, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 500, 88, -1));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SAURABH'S BANK");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 22, 584, 65));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 0, 930, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    public void getId(long id, String pass) {
//        idd = id;
//        pas = pass;
//    }
    private void withdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Withdrawal(idd, pas).setVisible(true);
    }//GEN-LAST:event_withdrawalActionPerformed

    private void depositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositeActionPerformed

       System.out.print(idd);
       System.out.print(pas);
       this.setVisible(false);
       new Deposit(idd, pas).setVisible(true);
        
    }//GEN-LAST:event_depositeActionPerformed

    private void changePINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePINActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ChangePIN(idd, pas).setVisible(true);
    }//GEN-LAST:event_changePINActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ATM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePIN;
    private javax.swing.JButton deposite;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton withdrawal;
    // End of variables declaration//GEN-END:variables
}
