
package electronic_storee;
import java.sql.*;
import javax.swing.*;

public class Sign_Up extends javax.swing.JFrame {

      Connection conn=null;
     Statement st=null;
     ResultSet rs;
     PreparedStatement ps;
     
    public Sign_Up() {
        initComponents();
    }

      // function to check empty fields
    public boolean checkEmptyFields()
    {   String id = Id.getText().trim();
        String name = Name.getText().trim();
        String address = Address.getText().trim();
        String pass = Password.getText().trim();
        
        if( id.equals("")|| address.equals("")|| pass.equals("") )
        {
            return false;
        }
        else
        {
            return true;
        }
                
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Id = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        Log1 = new javax.swing.JButton();
        Log3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 51), 5), "Create Account", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setText("User Name");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("Address");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setText("Password");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Address.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Address.setToolTipText("");

        Name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Name.setToolTipText("");

        Id.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Id.setToolTipText("");

        Password.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Password.setToolTipText("");
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        Log1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Log1.setForeground(new java.awt.Color(0, 0, 102));
        Log1.setText("Log In");
        Log1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 3));
        Log1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log1ActionPerformed(evt);
            }
        });

        Log3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Log3.setForeground(new java.awt.Color(0, 0, 102));
        Log3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronic_storee/Images/home-blue-icon (1).png"))); // NOI18N
        Log3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 3));
        Log3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(Log1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Log3)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Log3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(Log1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 750, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Icon\\أهمية-التسويق-للمتجر-الإلكتروني-1.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setFocusTraversalPolicyProvider(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1206, -1));

        setSize(new java.awt.Dimension(851, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void Log1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log1ActionPerformed
       if(checkEmptyFields())
       {
          Integer id = Integer.valueOf(Id.getText());
          String name = Name.getText();
          String address = Address.getText();
          Integer pass = Integer.valueOf(Password.getText());
        String InsertQuery;
        InsertQuery = "INSERT INTO `customers`(`id`, `name`, `address`, `password`) VALUES (?,?,?,?)";
        
        try {
             ps = BD.getConnection().prepareStatement(InsertQuery);
             
             ps.setInt(1, id);
             ps.setString(2, name);
             ps.setString(3, address);
             ps.setInt(4, pass);
        if (ps.executeUpdate()>0) 
             {
             JOptionPane.showMessageDialog(null, "The Account Has Been Created Successfully", "Add Account",
              JOptionPane.INFORMATION_MESSAGE);
                   Login l=new Login();
                  l.setVisible(true);
                  dispose();
             }  
             else{
              JOptionPane.showMessageDialog(null, "The Account Has not Been Created Try Agin", "Add Account", 
               JOptionPane.ERROR_MESSAGE);
             }
                
        }
         catch (SQLException ee){
          JOptionPane.showMessageDialog(null,ee.getMessage());
       }}
       else
       {
             JOptionPane.showMessageDialog(null, "The Account Has not Been Created Try Agin", "Add Account", 
               JOptionPane.ERROR_MESSAGE);
       }

       /* InsertQuary = "INSERT INT1O CUSTOMER VALUES ('"+Integer.parseInt(ID.getText())+"',"+Name.getText()+"',"+Address.getText()+"',"+Integer.parseInt(Password.getText())+")";

        System.out.println(InsertQuary);
        try {
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/Store","Hasan","h123");
            st=conn.createStatement();
            st.execute(InsertQuary);
            JOptionPane.showMessageDialog(null, "Created Successfully", "Creat Acccount ", JOptionPane.INFORMATION_MESSAGE);
            conn.close();
        } catch (SQLException ee){
            JOptionPane.showMessageDialog(null,ee.getMessage());
        }
        try {
            if(st!=null){
                st.close();
                conn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }*/
    }//GEN-LAST:event_Log1ActionPerformed

    private void Log3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log3ActionPerformed
        Main_Page m= new Main_Page();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_Log3ActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_Up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Id;
    private javax.swing.JButton Log1;
    private javax.swing.JButton Log3;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
