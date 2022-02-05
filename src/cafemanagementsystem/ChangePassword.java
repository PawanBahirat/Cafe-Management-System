/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafemanagementsystem;

import dao.UserDao;

/**
 *
 * @author pawan
 */
public class ChangePassword extends javax.swing.JFrame {

    public String userEmail;

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
        this.lblHidePasswordBlack.setVisible(false);
        this.lblHidePasswordBlack1.setVisible(false);
        this.lblHidePasswordBlack2.setVisible(false);
    }

    public ChangePassword(String email) {
        initComponents();
        this.lblHidePasswordBlack.setVisible(false);
        this.lblHidePasswordBlack1.setVisible(false);
        this.lblHidePasswordBlack2.setVisible(false);
        btnUpdate.setEnabled(false);
        userEmail = email;
        
    }
    
    public void validateField(){
        String oldPassword = txtOldPassword.getText();
        String newPasword = txtNewPassword.getText();
        String confirmPassword = txtConfirmPassword.getText();
        if(!oldPassword.equals("") && !newPasword.equals("") && !confirmPassword.equals("") && newPasword.equals(confirmPassword)){
            btnUpdate.setEnabled(true);
        }else{
            btnUpdate.setEnabled(false);
        }
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblShowPasswordBlack = new javax.swing.JLabel();
        lblHidePasswordBlack = new javax.swing.JLabel();
        lblShowPasswordBlack1 = new javax.swing.JLabel();
        lblHidePasswordBlack1 = new javax.swing.JLabel();
        lblShowPasswordBlack2 = new javax.swing.JLabel();
        lblHidePasswordBlack2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtOldPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        btnUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(420, 210));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        jLabel1.setText("Change Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 190, -1));

        jButton1.setBackground(new java.awt.Color(125, 125, 125));
        jButton1.setForeground(new java.awt.Color(102, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/closeBlack.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 13, 35, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Old Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 121, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 134, -1));

        lblShowPasswordBlack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/showPasswordBlack.png"))); // NOI18N
        lblShowPasswordBlack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblShowPasswordBlackMousePressed(evt);
            }
        });
        getContentPane().add(lblShowPasswordBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        lblHidePasswordBlack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidePasswordBlack.png"))); // NOI18N
        lblHidePasswordBlack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHidePasswordBlackMousePressed(evt);
            }
        });
        getContentPane().add(lblHidePasswordBlack, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        lblShowPasswordBlack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/showPasswordBlack.png"))); // NOI18N
        lblShowPasswordBlack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblShowPasswordBlack1MousePressed(evt);
            }
        });
        getContentPane().add(lblShowPasswordBlack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        lblHidePasswordBlack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidePasswordBlack.png"))); // NOI18N
        lblHidePasswordBlack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHidePasswordBlack1MousePressed(evt);
            }
        });
        getContentPane().add(lblHidePasswordBlack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, -1, -1));

        lblShowPasswordBlack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/showPasswordBlack.png"))); // NOI18N
        lblShowPasswordBlack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblShowPasswordBlack2MousePressed(evt);
            }
        });
        getContentPane().add(lblShowPasswordBlack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        lblHidePasswordBlack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hidePasswordBlack.png"))); // NOI18N
        lblHidePasswordBlack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHidePasswordBlack2MousePressed(evt);
            }
        });
        getContentPane().add(lblHidePasswordBlack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 300, 3));

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 300, 3));

        jPanel4.setBackground(new java.awt.Color(0, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 300, 3));

        txtOldPassword.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtOldPassword.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        txtOldPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtOldPassword.setBorder(null);
        txtOldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOldPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtOldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 300, -1));

        txtNewPassword.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtNewPassword.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        txtNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtNewPassword.setBorder(null);
        txtNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 300, -1));

        txtConfirmPassword.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtConfirmPassword.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        txtConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmPassword.setBorder(null);
        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 300, -1));

        btnUpdate.setBackground(new java.awt.Color(60, 60, 60));
        btnUpdate.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(102, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 110, 40));

        jButton3.setBackground(new java.awt.Color(60, 60, 60));
        jButton3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        jButton3.setText("Clear");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 100, 40));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 100));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 540, 280));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img1.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOldPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOldPasswordKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtOldPasswordKeyReleased

    private void txtNewPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPasswordKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtNewPasswordKeyReleased

    private void txtConfirmPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtConfirmPasswordKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ChangePassword(userEmail).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String oldPassword = txtOldPassword.getText();
        String newPasword = txtNewPassword.getText();
        UserDao.changePassword(userEmail, oldPassword, newPasword);
        setVisible(false);
        new ChangePassword(userEmail).setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void lblShowPasswordBlackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPasswordBlackMousePressed
        // TODO add your handling code here:
        lblHidePasswordBlack.setVisible(true);
        lblShowPasswordBlack.setVisible(false);
        txtOldPassword.setEchoChar((char)0);
    }//GEN-LAST:event_lblShowPasswordBlackMousePressed

    private void lblHidePasswordBlackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHidePasswordBlackMousePressed
        // TODO add your handling code here:
        lblShowPasswordBlack.setVisible(true);
        lblHidePasswordBlack.setVisible(false);
        txtOldPassword.setEchoChar('*');
    }//GEN-LAST:event_lblHidePasswordBlackMousePressed

    private void lblShowPasswordBlack1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPasswordBlack1MousePressed
        // TODO add your handling code here:
        lblHidePasswordBlack1.setVisible(true);
        lblShowPasswordBlack1.setVisible(false);
        txtNewPassword.setEchoChar((char)0);
    }//GEN-LAST:event_lblShowPasswordBlack1MousePressed

    private void lblHidePasswordBlack1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHidePasswordBlack1MousePressed
        // TODO add your handling code here:
        lblShowPasswordBlack1.setVisible(true);
        lblHidePasswordBlack1.setVisible(false);
        txtNewPassword.setEchoChar('*');
    }//GEN-LAST:event_lblHidePasswordBlack1MousePressed

    private void lblShowPasswordBlack2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPasswordBlack2MousePressed
        // TODO add your handling code here:
        lblHidePasswordBlack2.setVisible(true);
        lblShowPasswordBlack2.setVisible(false);
        txtConfirmPassword.setEchoChar((char)0);
    }//GEN-LAST:event_lblShowPasswordBlack2MousePressed

    private void lblHidePasswordBlack2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHidePasswordBlack2MousePressed
        // TODO add your handling code here:
        lblShowPasswordBlack2.setVisible(true);
        lblHidePasswordBlack2.setVisible(false);
        txtConfirmPassword.setEchoChar('*');
    }//GEN-LAST:event_lblHidePasswordBlack2MousePressed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblHidePasswordBlack;
    private javax.swing.JLabel lblHidePasswordBlack1;
    private javax.swing.JLabel lblHidePasswordBlack2;
    private javax.swing.JLabel lblShowPasswordBlack;
    private javax.swing.JLabel lblShowPasswordBlack1;
    private javax.swing.JLabel lblShowPasswordBlack2;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtOldPassword;
    // End of variables declaration//GEN-END:variables
}