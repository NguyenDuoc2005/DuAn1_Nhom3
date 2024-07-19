package view;


import javax.swing.JOptionPane;
import ultil.MsgBox;

public class TaoTaiKhoan_View extends javax.swing.JFrame {
 

    public TaoTaiKhoan_View() {
        initComponents();
        setTitle("Tạo Tài Khoản Mới");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtHoTen = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblDangNhap_View = new javax.swing.JLabel();
        rdoAn_Hien_XN_MK = new javax.swing.JRadioButton();
        rdoAn_Hien_MK = new javax.swing.JRadioButton();
        txtXacNhanMK = new javax.swing.JPasswordField();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboChucVu = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(368, 252));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHoTen.setBorder(null);
        jPanel1.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 164, 30));

        txtMaNV.setBorder(null);
        jPanel1.add(txtMaNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 164, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATE NEW ACCOUNT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 15, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Họ Và Tên ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 58, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã NV");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mật Khẩu");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 58, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Xác Nhận Mật Khẩu");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 136, -1, -1));

        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 88, 35));

        lblDangNhap_View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        lblDangNhap_View.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangNhap_ViewMouseClicked(evt);
            }
        });
        jPanel1.add(lblDangNhap_View, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        rdoAn_Hien_XN_MK.setBackground(new java.awt.Color(153, 204, 255));
        rdoAn_Hien_XN_MK.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rdoAn_Hien_XN_MK.setForeground(new java.awt.Color(102, 204, 255));
        rdoAn_Hien_XN_MK.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        rdoAn_Hien_XN_MK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoAn_Hien_XN_MKMouseClicked(evt);
            }
        });
        jPanel1.add(rdoAn_Hien_XN_MK, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, 20));

        rdoAn_Hien_MK.setBackground(new java.awt.Color(153, 204, 255));
        rdoAn_Hien_MK.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        rdoAn_Hien_MK.setForeground(new java.awt.Color(102, 204, 255));
        rdoAn_Hien_MK.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        rdoAn_Hien_MK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoAn_Hien_MKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rdoAn_Hien_MKMouseEntered(evt);
            }
        });
        jPanel1.add(rdoAn_Hien_MK, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, 20));

        txtXacNhanMK.setBorder(null);
        jPanel1.add(txtXacNhanMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 170, 30));

        txtMatKhau.setBorder(null);
        jPanel1.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 170, 30));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tài Khoản ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 136, -1, -1));

        cboChucVu.setBorder(null);
        cboChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboChucVuMouseClicked(evt);
            }
        });
        jPanel1.add(cboChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 170, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Chức Vụ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 60, -1));

        txtTaiKhoan.setBorder(null);
        jPanel1.add(txtTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 164, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblDangNhap_ViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangNhap_ViewMouseClicked
        // TODO add your handling code here:
        DangNhap_View dn = new DangNhap_View(); 
        dn.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblDangNhap_ViewMouseClicked

    private void rdoAn_Hien_MKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoAn_Hien_MKMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoAn_Hien_MKMouseEntered

    private void rdoAn_Hien_MKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoAn_Hien_MKMouseClicked
        // TODO add your handling code here:
        if (rdoAn_Hien_MK.isSelected()) {
         txtMatKhau.setEchoChar((char) 0);
        } else {
           txtMatKhau.setEchoChar('\u2022');  
        }
    }//GEN-LAST:event_rdoAn_Hien_MKMouseClicked

    private void rdoAn_Hien_XN_MKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoAn_Hien_XN_MKMouseClicked
        // TODO add your handling code here:
        if (rdoAn_Hien_XN_MK.isSelected()) {
         txtXacNhanMK.setEchoChar((char) 0);
        } else {
           txtXacNhanMK.setEchoChar('\u2022');  
        }
    }//GEN-LAST:event_rdoAn_Hien_XN_MKMouseClicked
   
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboChucVuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboChucVuMouseClicked

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
            java.util.logging.Logger.getLogger(TaoTaiKhoan_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaoTaiKhoan_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaoTaiKhoan_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaoTaiKhoan_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaoTaiKhoan_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDangNhap_View;
    private javax.swing.JRadioButton rdoAn_Hien_MK;
    private javax.swing.JRadioButton rdoAn_Hien_XN_MK;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JPasswordField txtXacNhanMK;
    // End of variables declaration//GEN-END:variables
}
