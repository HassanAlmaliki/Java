

package electronic_storee;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;






public class Items extends javax.swing.JFrame {
    
    
      Connection conn=null;
   
     PreparedStatement ps;

   Border panal_border =BorderFactory.createMatteBorder(1, 1, 1, 1, Color.darkGray);
   Border textFieled_border =BorderFactory.createMatteBorder(0, 0, 2, 0, Color.darkGray);
   int    p=0;
    public Items() {
        initComponents();
        this.setLocationRelativeTo(null);
        container.setBorder(panal_border);
        Name.setBorder(textFieled_border);
        Description.setBorder(textFieled_border);
        Quantity.setBorder(textFieled_border);
        Price.setBorder(textFieled_border);
        Imagepath.setBorder(textFieled_border);
        showProduct();
       jTable_product.setRowHeight(35);
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
        Object[] row = new Object[6];
        for( int i =0; i< getProductsList().size(); i++)
        {
            row[0] = ProductsList.get(i).getId();
            row[1] = ProductsList.get(i).getName();
            row[2] = ProductsList.get(i).getDescription();
            row[3] = ProductsList.get(i).getQuantity();
            row[4] = ProductsList.get(i).getPrice();
            row[5] = ProductsList.get(i).getImage_path();
            model.addRow(row);
            
        }}
    public void showProductData(int index)
    {
        Id.setText(getProductsList().get(index).getId().toString());
        Name.setText(getProductsList().get(index).getName());
        Description.setText(getProductsList().get(index).getDescription());
        Quantity.setText(getProductsList().get(index).getQuantity().toString());
        Price.setText(getProductsList().get(index).getPrice().toString());
        Imagepath.setText(getProductsList().get(index).getImage_path());
        dispalyImage(getProductsList().get(index).getImage_path(), JImage);
    }
    // function to check empty fields
    public boolean checkEmptyFields()
    {
        String name = Name.getText().trim();
        String quantity = Quantity.getText().trim();
        String price = Price.getText().trim();
        String imagepath = Imagepath.getText().trim();
        if(name.equals("")|| quantity.equals("")|| price.equals("")|| imagepath.equals("") )
        {
            return false;
        }
        else
        {
            return true;
        }
                
    }
    
    
    public void dispalyImage(String imgPath, JLabel label )
    {
        ImageIcon imgIco =new ImageIcon(imgPath);
        Image img =imgIco.getImage().getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(img));
        
       
    }
    public void clearFields(){
        Id.setText("");
        Name.setText("");
        Description.setText("");
        Quantity.setText("");
        Price.setText("");
        Imagepath.setText("");
        JImage.setIcon(null);
        
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_product = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        JImage = new javax.swing.JLabel();
        edit = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        add = new javax.swing.JButton();
        browse = new javax.swing.JButton();
        search1 = new javax.swing.JButton();
        Imagepath = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        show_last = new javax.swing.JButton();
        show_first = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        Id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setBackground(new java.awt.Color(102, 102, 102));

        Exit.setBackground(new java.awt.Color(255, 0, 0));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Exit.setForeground(new java.awt.Color(153, 0, 0));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X");
        Exit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        jTable_product.setBackground(new java.awt.Color(0, 102, 102));
        jTable_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Description", "Quantity", "Price", "Image"
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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Description:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Quantity:");

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

        Quantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });

        JImage.setBackground(new java.awt.Color(153, 153, 153));
        JImage.setOpaque(true);

        edit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        remove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        browse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        search1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search1.setText("Search");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        Imagepath.setEnabled(false);
        Imagepath.setMaximumSize(new java.awt.Dimension(6, 20));
        Imagepath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagepathActionPerformed(evt);
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

        show_last.setBackground(new java.awt.Color(0, 102, 102));
        show_last.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        show_last.setText(">>");
        show_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_lastActionPerformed(evt);
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

        Description.setColumns(20);
        Description.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Description.setRows(5);
        jScrollPane2.setViewportView(Description);

        jButton3.setText("Customer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(JImage, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Imagepath, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(browse, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(containerLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(containerLayout.createSequentialGroup()
                                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(search1))
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(add)
                .addGap(18, 18, 18)
                .addComponent(edit)
                .addGap(18, 18, 18)
                .addComponent(remove)
                .addGap(211, 211, 211)
                .addComponent(show_first)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addGap(35, 35, 35)
                .addComponent(show_last)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(75, 75, 75))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(containerLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(search1)
                                        .addGap(43, 43, 43))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel4)))
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2))
                            .addGroup(containerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                                .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Imagepath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(browse))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(JImage, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(edit)
                            .addComponent(remove)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(show_last)
                            .addComponent(show_first))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(36, 36, 36))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        Integer id = Integer.valueOf(Id.getText());
     
      
       String sqlll; 
        
        sqlll = "DELETE FROM `products` WHERE `id`=?";
         
         try {
       ps = BD.getConnection().prepareStatement(sqlll);
     
      
      ps.setInt(1, id);
             if (ps.executeUpdate()>0) 
             {showProduct();
           JOptionPane.showMessageDialog(null, "Product Deleted Successfully", "Remove Product", 
          JOptionPane.INFORMATION_MESSAGE);
                 clearFields();
             }  
             else{
         JOptionPane.showMessageDialog(null, "Product Not Deleted, Make Sure The ID is Valid", "Remove Product",
          JOptionPane.ERROR_MESSAGE);
             }
                
                 
             
        }
         catch (SQLException ee){
          JOptionPane.showMessageDialog(null,ee.getMessage());
       }
    }//GEN-LAST:event_removeActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        // TODO add your handling code here:
        
        JFileChooser file =new JFileChooser();
        file.setCurrentDirectory(new File (System.getProperty("user.home")));
        FileNameExtensionFilter filter =new FileNameExtensionFilter(" image ", ".png", "jpg", ".jpeg");
        file.addChoosableFileFilter(filter);
        
        if(file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            File selectedImage =file.getSelectedFile();
            String image_path =selectedImage.getAbsolutePath();
            dispalyImage(image_path, JImage);
            Imagepath.setText(image_path);
            System.out.println(image_path);
            
        }
        else
        {
            System.out.println("no file selected ");
        }
        
    }//GEN-LAST:event_browseActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    //  Integer id = Id.getToolTipText();
    if(checkEmptyFields())
    {
        String name = Name.getText();
      String description = Description.getText();
      Integer quantity = Integer.valueOf(Quantity.getText());
      Double price = Double.valueOf(Price.getText());
      String img = Imagepath.getText();
      
       String insertQuery; 
        // sql = "INSERT INTO Products(name , category , quantity, price, image_path)VALUES"+"(?,?,?,?,?)";
      insertQuery = "INSERT INTO `products`( `name`, `description`, `quantity`, `price`, `image_path`) VALUES (?,?,?,?,?)";
         
         try {
           
            //  conn=DriverManager.getConnection("jdbc:derby://localhost:1527/product","hasan", "h123");
        /* st=conn.createStatement();
         st.execute(sql);
         System.out.println("Added Successfully");
        conn.close
          */
       ps = BD.getConnection().prepareStatement(insertQuery);
     
      ps.setString(1, name);
      ps.setString(2, description);
      ps.setInt(3, quantity);
      ps.setDouble(4, price);
      ps.setString(5, img);
             if (ps.executeUpdate()>0) 
             {showProduct();
             JOptionPane.showMessageDialog(null, "New Product Added Successfully", "Add Product",
              JOptionPane.INFORMATION_MESSAGE);
                
             }  
             else{
              JOptionPane.showMessageDialog(null, "Product Not Added", "Add Product", 
               JOptionPane.ERROR_MESSAGE);
             }
                
                 
             
        }
         catch (SQLException ee){
          JOptionPane.showMessageDialog(null,ee.getMessage());
       }
         
       /*  try {
         if(st!=null){
            st.close();
            conn.close();
         }
      } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, e.getMessage());
         e.printStackTrace();
      }*/
    }
    else
      {
           System.out.println("One or More Fields Are Empty");
      }
    }//GEN-LAST:event_addActionPerformed

    private void jTable_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productMouseClicked

      int index = jTable_product.getSelectedRow();
      showProductData(index);
              p = index;
    }//GEN-LAST:event_jTable_productMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
      if(checkEmptyFields())
      {
      Integer id = Integer.valueOf(Id.getText());
      String name = Name.getText();
      String description = Description.getText();
      Integer quantity = Integer.valueOf(Quantity.getText());
      Double price = Double.valueOf(Price.getText());
      String img = Imagepath.getText();
      
       String updateQuery; 
        
       updateQuery = "UPDATE `products`SET `name`=?, `description`=?, `quantity`=?, `price`=?, `image_path`=? WHERE `id`=?";
         
         try {
       ps = BD.getConnection().prepareStatement(updateQuery);
     
      ps.setString(1, name);
      ps.setString(2, description);
      ps.setInt(3, quantity);
      ps.setDouble(4, price);
      ps.setString(5, img);
      ps.setInt(6, id);
             if (ps.executeUpdate()>0) 
             { showProduct();
                JOptionPane.showMessageDialog(null, "Product Updated", "Edit Product", 
                   JOptionPane.INFORMATION_MESSAGE);
             }  
             else{
               JOptionPane.showMessageDialog(null, "Product Not Updated", "Edit Product", 
                  JOptionPane.ERROR_MESSAGE);
             }
                
                 
             
        }
         catch (SQLException ee){
          JOptionPane.showMessageDialog(null,ee.getMessage());
       }}
      else
      {
           System.out.println("One or More Fields Are Empty");
      }
    }//GEN-LAST:event_editActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        int id = Integer.valueOf(Id.getText());
         String selectQuery ="SELECT * FROM `products` WHERE `id`="+id;
          try {
              Statement st = BD.getConnection().createStatement();
               ResultSet rs = st.executeQuery(selectQuery);
               
               if(rs.next())
               {
                    Name.setText(rs.getString("name"));
                    Description.setText(rs.getString("description"));
                    Quantity.setText(rs.getString("quantity"));
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
         
          
          
    }//GEN-LAST:event_search1ActionPerformed

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         p--;
         if(p < 0)
         {
             p = 0;
         }
        showProductData(p);
        jTable_product.setRowSelectionInterval(p, p);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void show_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_firstActionPerformed
        // TODO add your handling code here:
        p=0;
        showProductData(p);
          jTable_product.setRowSelectionInterval(p, p);
    }//GEN-LAST:event_show_firstActionPerformed

    private void show_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_lastActionPerformed
        p=getProductsList().size()-1;
        showProductData(p);
          jTable_product.setRowSelectionInterval(p, p);
    }//GEN-LAST:event_show_lastActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        p++;
        if(p > getProductsList().size() - 1)
        {
            p = getProductsList().size() - 1;
        }
        showProductData(p);
          jTable_product.setRowSelectionInterval(p, p);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ImagepathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagepathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImagepathActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     Customer_Inf c = new Customer_Inf();
     c.setVisible(true);
     dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Description;
    private javax.swing.JLabel Exit;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Imagepath;
    private javax.swing.JLabel JImage;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton add;
    private javax.swing.JButton browse;
    private javax.swing.JPanel container;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_product;
    private javax.swing.JButton remove;
    private javax.swing.JButton search1;
    private javax.swing.JButton show_first;
    private javax.swing.JButton show_last;
    // End of variables declaration//GEN-END:variables
}
