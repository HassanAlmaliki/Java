
package electronic_storee;


import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.*;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Views extends javax.swing.JFrame {
   Connection conn=null;
   
     PreparedStatement ps;
      int    p=0;
  
    public Views() {
        initComponents();
       //  showProduct();
    }
    
    public ArrayList<Product> getProductsList(){
    
    ArrayList<Product> list =new ArrayList<>();
    String Select = "SELECT * FROM `products`";
    
      Statement st=null;
     ResultSet rs;
          try {
              st = BD.getConnection().createStatement();
               rs = st.executeQuery(Select);
               Product Product;
               
               while (rs.next()) {
                  Product = new Product(rs.getInt("id"), rs.getString("name"), 
                                        rs.getString("description"),rs.getInt("quantity"),
                                        rs.getDouble("price"),rs.getString("image_path"));
                  list.add(Product);
                  
                     
              }
          } catch (SQLException ex) {
              Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
          }
    
    
           return list;
    
       }
    
     public void showProduct()
    {
        ArrayList<Product> ProductsList = getProductsList();
        DefaultTableModel  model = (DefaultTableModel) jTable_product.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];
        for( int i =0; i< getProductsList().size(); i++)
        {
            row[0] = ProductsList.get(i).getId();
            row[1] = ProductsList.get(i).getName();
            row[2] = ProductsList.get(i).getDescription();
          //  row[2] = ProductsList.get(i).getQuantity();
            row[3] = ProductsList.get(i).getPrice();
            row[4] = ProductsList.get(i).getImage_path();
            model.addRow(row);
            
        }}
    

       public void showProductData(int index)
    {
        Id.setValue(getProductsList().get(index).getId());
        Name.setText(getProductsList().get(index).getName());
       Description.setText(getProductsList().get(index).getDescription());
      //  Quantity.setText(getProductsList().get(index).getQuantity().toString());
        Price.setText(getProductsList().get(index).getPrice().toString());
        Imagepath.setText(getProductsList().get(index).getImage_path());
        dispalyImage(getProductsList().get(index).getImage_path(), JImage);
        
        
    }
     public void dispalyImage(String imgPath, JLabel label )
    {
        ImageIcon imgIco =new ImageIcon(imgPath);
        Image img =imgIco.getImage().getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(img));
        
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_product = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Id = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        JImage = new javax.swing.JLabel();
        Imagepath = new javax.swing.JTextField();
        Show = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        show_last = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        show_first = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        container.setBackground(new java.awt.Color(102, 102, 102));
        container.setName(""); // NOI18N

        jTable_product.setBackground(new java.awt.Color(0, 102, 102));
        jTable_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Price", "Image"
            }
        ));
        jTable_product.setSelectionBackground(new java.awt.Color(0, 204, 51));
        jTable_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_product);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name:");

        Id.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ID :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Image:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Price:");

        Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Price.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        JImage.setBackground(new java.awt.Color(153, 153, 153));
        JImage.setOpaque(true);

        Imagepath.setEnabled(false);
        Imagepath.setMaximumSize(new java.awt.Dimension(6, 20));

        Show.setBackground(new java.awt.Color(0, 102, 102));
        Show.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Show.setText(" Show Products");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/electronic_storee/Images/arrow-back-thick-icon.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        show_last.setBackground(new java.awt.Color(0, 102, 102));
        show_last.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        show_last.setText(">>");
        show_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_lastActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        show_first.setBackground(new java.awt.Color(0, 102, 102));
        show_first.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        show_first.setText("<<");
        show_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_firstActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Description:");

        Description.setColumns(20);
        Description.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Description.setRows(5);
        jScrollPane2.setViewportView(Description);

        jButton4.setBackground(new java.awt.Color(51, 0, 0));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setText("BUY");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(Imagepath, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(JImage, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(Show))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(337, 337, 337)))
                        .addContainerGap())
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(show_first)
                        .addGap(43, 43, 43)
                        .addComponent(jButton2)
                        .addGap(58, 58, 58)
                        .addComponent(jButton1)
                        .addGap(42, 42, 42)
                        .addComponent(show_last)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Imagepath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JImage, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Show)
                    .addComponent(show_first)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(show_last))
                .addGap(49, 49, 49))
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1084, 571));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productMouseClicked

       int index = jTable_product.getSelectedRow();
        showProductData(index);

    }//GEN-LAST:event_jTable_productMouseClicked

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed

         String selectQuery ="SELECT `id`,`name`,`description` ,`price`,`image_path` FROM `products`";
          try {
              Statement st = BD.getConnection().createStatement();
               ResultSet rs = st.executeQuery(selectQuery);
               
               if(rs.next())
               {
                     showProduct();
                    Name.setText(rs.getString("name"));
                    Description.setText(rs.getString("description"));
                    Price.setText(String.valueOf(rs.getDouble("price")));
                    Imagepath.setText(rs.getString("image_path"));
                    dispalyImage(rs.getString("image_path"), JImage);
               }
               else
               {
                   System.out.println("NO Product With This ID");
               }
          } catch (SQLException ex) {
              Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
          }       
    }//GEN-LAST:event_ShowActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Main_Page m = new Main_Page();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void show_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_lastActionPerformed
        p=getProductsList().size()-1;
        showProductData(p);
        jTable_product.setRowSelectionInterval(p, p);
    }//GEN-LAST:event_show_lastActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        p--;
        if(p < 0)
        {
            p = 0;
        }
        showProductData(p);
        jTable_product.setRowSelectionInterval(p, p);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        p++;
        if(p > getProductsList().size() - 1)
        {
            p = getProductsList().size() - 1;
        }
        showProductData(p);
        jTable_product.setRowSelectionInterval(p, p);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void show_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_firstActionPerformed
        // TODO add your handling code here:
        p=0;
        showProductData(p);
        jTable_product.setRowSelectionInterval(p, p);
    }//GEN-LAST:event_show_firstActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int id = Integer.valueOf(Id.getValue().toString());
        Buy_Product b=null;
        if(b==null){
            b=new Buy_Product(id);
        }
        dispose();
        
   //  Buy_Product b = new Buy_Product();
     //   b.setVisible(true);
     /*   dispose();
       int id = Integer.valueOf(Id.getValue().toString());
        String selectQuery ="SELECT * FROM `products` WHERE `id`="+id;
        try {
            Statement st = BD.getConnection().createStatement();
            ResultSet rs = st.executeQuery(selectQuery);

            if(rs.next())
            {
           Buy_Product b = new Buy_Product(id);
        b.setVisible(true);
        dispose();
       
                Name.setText(rs.getString("name"));
               // Description.setText(rs.getString("description"));
                // Quantity.setText(rs.getString("quantity"));
                Price.setText(String.valueOf(rs.getDouble("price")));
                Imagepath.setText(rs.getString("image_path"));
                dispalyImage(rs.getString("imagepath"), JImage);
            }
            else
            {
                System.out.println("NO Product With This ID");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Items.class.getName()).log(Level.SEVERE, null, ex);
        }

 
     
     */
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Views.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Views.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Views.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Views.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Views().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Description;
    private javax.swing.JSpinner Id;
    private javax.swing.JTextField Imagepath;
    private javax.swing.JLabel JImage;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Show;
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_product;
    private javax.swing.JButton show_first;
    private javax.swing.JButton show_last;
    // End of variables declaration//GEN-END:variables
}
