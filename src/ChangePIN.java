
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author manik
 */
public class ChangePIN extends javax.swing.JFrame {

    /**
     * Creates new form ChangePIN
     */
    long id = 0;
    String pass = "";
    public ChangePIN(long p, String pas) {
        initComponents();
        id = p;
        pass = pas;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        oldPIN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        newPIN = new javax.swing.JTextField();
        createAccBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHANGE PIN");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 17, 575, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("ENTER OLD PIN : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 140, 20));
        getContentPane().add(oldPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 180, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("ENTER NEW PIN : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 140, 20));
        getContentPane().add(newPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 190, -1));

        createAccBtn.setBackground(new java.awt.Color(51, 255, 255));
        createAccBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        createAccBtn.setText("CHANGE PIN");
        createAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccBtnActionPerformed(evt);
            }
        });
        getContentPane().add(createAccBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 610));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccBtnActionPerformed
        // TODO add your handling code here:
        String old = oldPIN.getText();
        String neww = newPIN.getText();
        
        if(old.equals(pass)) {
        Connection connection = null;
        Statement statement;
             try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "");
                statement = connection.createStatement();
                String st = String.format("UPDATE Password SET Password=%s WHERE AccountNo=%d",neww,id);
                int j = statement.executeUpdate(st);
                if(j>0) {
                    JOptionPane.showMessageDialog(
                null,
                "Password changes",
                "Done",
                JOptionPane.INFORMATION_MESSAGE
                );
                }
                       
             } catch(Exception e) {
                 
             }
        } else {
            JOptionPane.showMessageDialog(
                null,
                "PLEASE ENTER OLD PASSWORD CORRECTLY",
                "FAIL",
                JOptionPane.INFORMATION_MESSAGE
                );
        }
        this.setVisible(false);
        new ATM(id, pass).setVisible(true);

        
    }//GEN-LAST:event_createAccBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ChangePIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField newPIN;
    private javax.swing.JTextField oldPIN;
    // End of variables declaration//GEN-END:variables
}
