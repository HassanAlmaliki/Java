
package electronic_storee;
import java.sql.*;
import javax.swing.*;
public class Login extends javax.swing.JFrame {

     Connection conn=null;
     Statement st=null;
     ResultSet rs;
     PreparedStatement ps;
    public Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        sign = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,75));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51,51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5), "User Data", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(138, 83, 10))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronic_storee/Images/download (3).jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, 417));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\سنة 2\\icone\\user-131-16.png")); // NOI18N
        jLabel3.setText("user name");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 3, true));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 47, 119, 34));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\سنة 2\\icone\\padlock.png")); // NOI18N
        jLabel5.setText("password");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 126, 119, 37));

        Name.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Name.setToolTipText("Plase Enter User Name");
        Name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 48, 140, 34));

        Password.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Password.setToolTipText("Plase Enter Your Password");
        Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 129, 140, -1));

        sign.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        sign.setText("Sign In");
        sign.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signActionPerformed(evt);
            }
        });
        jPanel1.add(sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 209, 87, -1));

        signup.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        signup.setForeground(new java.awt.Color(0, 0, 51));
        signup.setText("Sign Up");
        signup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0), 3));
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 346, 98, 29));

        jLabel6.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel6.setText(" If You don't have An Account ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 296, 313, 38));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("OR");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 260, 58, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronic_storee/Images/6093c9d87d15f_--.png.2a68c52cc06d3d536e332b3263565872.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 419));

        setSize(new java.awt.Dimension(726, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signActionPerformed
    
       // String name = Name.getText();
      Integer pass = Integer.valueOf(Password.getText());
      String Query = "SELECT * FROM `customers` WHERE `password`="+pass;
      
        try {
             // ps = BD.getConnection().prepareStatement(Query);
                // ps.setString(1, name);
                //  ps.setInt(3, pass);
                 //  Statement st = BD.getConnection().createStatement();
                 st = BD.getConnection().createStatement();
               rs = st.executeQuery(Query);
               
               if(rs.next())
               {
                    Views v = new Views();
                    v.setVisible(true);
                   dispose();
               }
               else
               {
                    JOptionPane.showMessageDialog(null, "Sorrt This User Or Password Error ", "Login", 
               JOptionPane.ERROR_MESSAGE);
               }
        } catch (SQLException ee){
          JOptionPane.showMessageDialog(null,ee.getMessage());
        }
      
    }//GEN-LAST:event_signActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed

        Sign_Up s=new Sign_Up();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_signupActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton sign;
    private javax.swing.JButton signup;
    // End of variables declaration//GEN-END:variables
}
