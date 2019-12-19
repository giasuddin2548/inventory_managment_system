

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;





public class Sales extends javax.swing.JInternalFrame {
    
    Connection conn=null;
    Statement statment=null;
    ResultSet resultSet=null;
     PreparedStatement pps=null;
     String customer_id=null;
    int sum=0;
    String username;
    String p_id;

 
    public Sales(String Admin_name) {
        this.username=Admin_name;
        initComponents();
       
        conn=MyConnection.connection();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bu=(BasicInternalFrameUI) this.getUI();
        bu.setNorthPane(null);
        
        CustomerType_forCombo();
        PorductList_forCombo();
 

        
        
        
    }


        
        
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sale_tbl = new javax.swing.JTable();
        button_saleNow = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edittext_sale_company_id = new javax.swing.JTextField();
        sale_customerTypeComboBox_id = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        edittext_sale_c_location_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edittext_sale_c_area_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        edittext_sale_c_phone_id = new javax.swing.JTextField();
        edittext_sale_c_blance_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        productName_ComboBox_id = new javax.swing.JComboBox<>();
        edittext_sale_product_id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        edittext_sale_productType_id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        edittext_sale_saleRate_id = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        edittext_sale_invoice = new javax.swing.JTextField();
        button_addItem7 = new javax.swing.JButton();
        edittext_sale_productAvaiable_id = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        eidittext_product_quentityId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        button_addItem9 = new javax.swing.JButton();
        button_addItem6 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        edittext_sale_finalAmount_id = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        edittext_sale_productTotalAmount_id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        edittext_sale_discount_id = new javax.swing.JTextField();
        button_addItem10 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        you_save = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        total_rowValueId = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1070, 640));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 145, 208)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(50, 52, 53));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sale");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 20));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sale_tbl.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        sale_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P.Name", "P.Id", "P.Type", "P.Quentity", "P.Rate", "Total Amount"
            }
        ));
        jScrollPane1.setViewportView(sale_tbl);
        if (sale_tbl.getColumnModel().getColumnCount() > 0) {
            sale_tbl.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 1040, 100));

        button_saleNow.setBackground(new java.awt.Color(204, 204, 204));
        button_saleNow.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        button_saleNow.setForeground(new java.awt.Color(51, 51, 51));
        button_saleNow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/sale black.png"))); // NOI18N
        button_saleNow.setText("Sale now");
        button_saleNow.setToolTipText("");
        button_saleNow.setAlignmentY(0.0F);
        button_saleNow.setBorder(null);
        button_saleNow.setBorderPainted(false);
        button_saleNow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_saleNow.setDefaultCapable(false);
        button_saleNow.setFocusable(false);
        button_saleNow.setMargin(new java.awt.Insets(10, 10, 10, 10));
        button_saleNow.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_saleNow.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                button_saleNowMouseDragged(evt);
            }
        });
        button_saleNow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_saleNowMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_saleNowMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_saleNowMouseReleased(evt);
            }
        });
        button_saleNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_saleNowActionPerformed(evt);
            }
        });
        jPanel2.add(button_saleNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 250, 35));

        jLabel1.setBackground(new java.awt.Color(17, 145, 208));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Customer Name:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 32));

        jLabel2.setBackground(new java.awt.Color(17, 145, 208));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Company:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 0, -1, 32));

        edittext_sale_company_id.setEditable(false);
        edittext_sale_company_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_sale_company_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_sale_company_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_sale_company_idActionPerformed(evt);
            }
        });
        jPanel2.add(edittext_sale_company_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 0, 172, 32));

        sale_customerTypeComboBox_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Name" }));
        sale_customerTypeComboBox_id.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sale_customerTypeComboBox_idItemStateChanged(evt);
            }
        });
        sale_customerTypeComboBox_id.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                sale_customerTypeComboBox_idPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel2.add(sale_customerTypeComboBox_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 3, 160, -1));

        jLabel4.setBackground(new java.awt.Color(17, 145, 208));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Location:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 50, -1, 32));

        edittext_sale_c_location_id.setEditable(false);
        edittext_sale_c_location_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_sale_c_location_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_sale_c_location_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_sale_c_location_idActionPerformed(evt);
            }
        });
        jPanel2.add(edittext_sale_c_location_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 50, 178, 32));

        jLabel6.setBackground(new java.awt.Color(17, 145, 208));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Area:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 50, -1, 32));

        edittext_sale_c_area_id.setEditable(false);
        edittext_sale_c_area_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_sale_c_area_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_sale_c_area_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_sale_c_area_idActionPerformed(evt);
            }
        });
        jPanel2.add(edittext_sale_c_area_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 50, 140, 32));

        jLabel7.setBackground(new java.awt.Color(17, 145, 208));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Phone No:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 32));

        edittext_sale_c_phone_id.setEditable(false);
        edittext_sale_c_phone_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_sale_c_phone_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_sale_c_phone_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_sale_c_phone_idActionPerformed(evt);
            }
        });
        jPanel2.add(edittext_sale_c_phone_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 50, 160, 32));

        edittext_sale_c_blance_id.setEditable(false);
        edittext_sale_c_blance_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_sale_c_blance_id.setText("0");
        edittext_sale_c_blance_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_sale_c_blance_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_sale_c_blance_idActionPerformed(evt);
            }
        });
        jPanel2.add(edittext_sale_c_blance_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 50, 172, 32));

        jLabel8.setBackground(new java.awt.Color(17, 145, 208));
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Blance:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 50, -1, 32));

        jLabel9.setBackground(new java.awt.Color(17, 145, 208));
        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Product Name:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, 32));

        productName_ComboBox_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Name" }));
        productName_ComboBox_id.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                productName_ComboBox_idPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel2.add(productName_ComboBox_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 139, -1));

        edittext_sale_product_id.setEditable(false);
        edittext_sale_product_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_sale_product_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_sale_product_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_sale_product_idActionPerformed(evt);
            }
        });
        jPanel2.add(edittext_sale_product_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 102, 32));

        jLabel12.setBackground(new java.awt.Color(17, 145, 208));
        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Product Id:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 32));

        edittext_sale_productType_id.setEditable(false);
        edittext_sale_productType_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_sale_productType_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_sale_productType_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_sale_productType_idActionPerformed(evt);
            }
        });
        jPanel2.add(edittext_sale_productType_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 101, 32));

        jLabel13.setBackground(new java.awt.Color(17, 145, 208));
        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("P.Type");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, 32));

        edittext_sale_saleRate_id.setEditable(false);
        edittext_sale_saleRate_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_sale_saleRate_id.setText("0");
        edittext_sale_saleRate_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_sale_saleRate_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_sale_saleRate_idActionPerformed(evt);
            }
        });
        jPanel2.add(edittext_sale_saleRate_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 95, 32));

        jLabel14.setBackground(new java.awt.Color(17, 145, 208));
        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Sale Rate:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, 32));

        jLabel19.setBackground(new java.awt.Color(17, 145, 208));
        jLabel19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Invoice No:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 0, -1, 32));

        edittext_sale_invoice.setEditable(false);
        edittext_sale_invoice.setForeground(new java.awt.Color(66, 69, 71));
        edittext_sale_invoice.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_sale_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_sale_invoiceActionPerformed(evt);
            }
        });
        jPanel2.add(edittext_sale_invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 0, 180, 32));

        button_addItem7.setBackground(new java.awt.Color(204, 204, 204));
        button_addItem7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        button_addItem7.setForeground(new java.awt.Color(51, 51, 51));
        button_addItem7.setText("Get Invoice");
        button_addItem7.setToolTipText("");
        button_addItem7.setAlignmentY(0.0F);
        button_addItem7.setBorder(null);
        button_addItem7.setBorderPainted(false);
        button_addItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_addItem7.setDefaultCapable(false);
        button_addItem7.setFocusable(false);
        button_addItem7.setMargin(new java.awt.Insets(10, 10, 10, 10));
        button_addItem7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_addItem7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                button_addItem7MouseDragged(evt);
            }
        });
        button_addItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_addItem7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_addItem7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_addItem7MouseReleased(evt);
            }
        });
        button_addItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addItem7ActionPerformed(evt);
            }
        });
        jPanel2.add(button_addItem7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 150, 35));

        edittext_sale_productAvaiable_id.setEditable(false);
        edittext_sale_productAvaiable_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_sale_productAvaiable_id.setText("0");
        edittext_sale_productAvaiable_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_sale_productAvaiable_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_sale_productAvaiable_idActionPerformed(evt);
            }
        });
        jPanel2.add(edittext_sale_productAvaiable_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, 140, 32));

        jLabel24.setBackground(new java.awt.Color(17, 145, 208));
        jLabel24.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Available:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, -1, 32));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1010, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1010, 10));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 250, 220));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setBackground(new java.awt.Color(17, 145, 208));
        jLabel25.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Quantity:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 32));

        eidittext_product_quentityId.setForeground(new java.awt.Color(66, 69, 71));
        eidittext_product_quentityId.setText("0");
        eidittext_product_quentityId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        eidittext_product_quentityId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidittext_product_quentityIdActionPerformed(evt);
            }
        });
        jPanel3.add(eidittext_product_quentityId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 57, 32));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/minus-5-24.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 31));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/add-24-black.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 31));

        button_addItem9.setBackground(new java.awt.Color(204, 204, 204));
        button_addItem9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        button_addItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/cart-41-24.png"))); // NOI18N
        button_addItem9.setText("Add Cart");
        button_addItem9.setToolTipText("");
        button_addItem9.setAlignmentY(0.0F);
        button_addItem9.setBorder(null);
        button_addItem9.setBorderPainted(false);
        button_addItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_addItem9.setDefaultCapable(false);
        button_addItem9.setFocusable(false);
        button_addItem9.setMargin(new java.awt.Insets(10, 10, 10, 10));
        button_addItem9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_addItem9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                button_addItem9MouseDragged(evt);
            }
        });
        button_addItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_addItem9MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_addItem9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_addItem9MouseReleased(evt);
            }
        });
        button_addItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addItem9ActionPerformed(evt);
            }
        });
        jPanel3.add(button_addItem9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 210, 30));

        button_addItem6.setBackground(new java.awt.Color(204, 204, 204));
        button_addItem6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        button_addItem6.setForeground(new java.awt.Color(51, 51, 51));
        button_addItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/delete.png"))); // NOI18N
        button_addItem6.setText("Remove Row");
        button_addItem6.setToolTipText("");
        button_addItem6.setAlignmentY(0.0F);
        button_addItem6.setBorder(null);
        button_addItem6.setBorderPainted(false);
        button_addItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_addItem6.setDefaultCapable(false);
        button_addItem6.setFocusable(false);
        button_addItem6.setMargin(new java.awt.Insets(10, 10, 10, 10));
        button_addItem6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_addItem6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                button_addItem6MouseDragged(evt);
            }
        });
        button_addItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_addItem6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_addItem6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_addItem6MouseReleased(evt);
            }
        });
        button_addItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addItem6ActionPerformed(evt);
            }
        });
        jPanel3.add(button_addItem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, 35));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 230, 220));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setBackground(new java.awt.Color(17, 145, 208));
        jLabel23.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Payment Section");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 32));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 20));

        edittext_sale_finalAmount_id.setEditable(false);
        edittext_sale_finalAmount_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        edittext_sale_finalAmount_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_sale_finalAmount_id.setText("0");
        edittext_sale_finalAmount_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_sale_finalAmount_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_sale_finalAmount_idActionPerformed(evt);
            }
        });
        jPanel7.add(edittext_sale_finalAmount_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 160, 30));

        jLabel28.setBackground(new java.awt.Color(17, 145, 208));
        jLabel28.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Final Amount After Discount:");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 310, 32));

        jLabel16.setBackground(new java.awt.Color(17, 145, 208));
        jLabel16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Total Amount:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 32));

        edittext_sale_productTotalAmount_id.setEditable(false);
        edittext_sale_productTotalAmount_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_sale_productTotalAmount_id.setText("0");
        edittext_sale_productTotalAmount_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_sale_productTotalAmount_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_sale_productTotalAmount_idActionPerformed(evt);
            }
        });
        jPanel7.add(edittext_sale_productTotalAmount_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 120, 32));

        jLabel11.setBackground(new java.awt.Color(17, 145, 208));
        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Dsicount:%");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, 32));

        edittext_sale_discount_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_sale_discount_id.setText("0");
        edittext_sale_discount_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_sale_discount_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_sale_discount_idActionPerformed(evt);
            }
        });
        jPanel7.add(edittext_sale_discount_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 72, 32));

        button_addItem10.setBackground(new java.awt.Color(204, 204, 204));
        button_addItem10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        button_addItem10.setText("Apply");
        button_addItem10.setToolTipText("");
        button_addItem10.setAlignmentY(0.0F);
        button_addItem10.setBorder(null);
        button_addItem10.setBorderPainted(false);
        button_addItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_addItem10.setDefaultCapable(false);
        button_addItem10.setFocusable(false);
        button_addItem10.setMargin(new java.awt.Insets(10, 10, 10, 10));
        button_addItem10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_addItem10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                button_addItem10MouseDragged(evt);
            }
        });
        button_addItem10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_addItem10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_addItem10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_addItem10MouseReleased(evt);
            }
        });
        button_addItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addItem10ActionPerformed(evt);
            }
        });
        jPanel7.add(button_addItem10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 60, 30));

        jLabel18.setBackground(new java.awt.Color(17, 145, 208));
        jLabel18.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("You Save:");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 32));

        you_save.setEditable(false);
        you_save.setForeground(new java.awt.Color(66, 69, 71));
        you_save.setText("0");
        you_save.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        you_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                you_saveActionPerformed(evt);
            }
        });
        jPanel7.add(you_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 120, 32));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 500, 220));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        total_rowValueId.setBackground(new java.awt.Color(17, 145, 208));
        total_rowValueId.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        total_rowValueId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_rowValueId.setText("00");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(total_rowValueId, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(total_rowValueId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        jLabel27.setBackground(new java.awt.Color(17, 145, 208));
        jLabel27.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Total Amount:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 639, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 1040, 30));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 1040, 590));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1060, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_saleNowMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_saleNowMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_button_saleNowMouseDragged

    private void button_saleNowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_saleNowMouseClicked

        
                    if(edittext_sale_invoice==null || customer_id==null  ){
                           JOptionPane.showMessageDialog(this, "Can't sale");
            }else{
                        
                        
                        try {

     
                    
                    
               int Option= JOptionPane.showConfirmDialog(null, "Do You want Sale ?","Yes",JOptionPane.YES_NO_OPTION);
                if (Option==0) {
                    
            String sql_for_stdAd="INSERT INTO tbl_sale (sale_invoice_no,sale_customer_id,sale_total_price,sale_byuser)"
                    + " VALUES(?,?,?,?) ";      
                        
            pps=conn.prepareStatement(sql_for_stdAd);
            pps.setString(1,  edittext_sale_invoice.getText());
            pps.setString(2,  customer_id);
            pps.setString(3,  edittext_sale_finalAmount_id.getText());
            pps.setString(4,  username); 
             
            pps.execute();    
            
            
/*            
            
             statment=conn.createStatement();
            
            //Step:6> Data insert to sql database (call the super class)
           // int Id=Integer.parseInt(Product_Info_searchbyName_Id.getText());
            String avalable=edittext_sale_productAvaiable_id.getText();
            int i=Integer.parseInt(avalable);
            
            

            
            String sql ="UPDATE product_name SET porduct_info_totalamount='"+update_amount+"' WHERE porduct_info_name='"+p_id+"'";
            
            //Step:6> Data insert to sql database ()
            statment.executeUpdate(sql);
            
            */
            
            
            setVisible(false);
            DashBoard h=new DashBoard();
            h.setVisible(true);
           
           
            JOptionPane.showMessageDialog(this, "Sold out successfully");
            
            
        MessageFormat header=new MessageFormat("Invoice No:"+edittext_sale_invoice.getText());
        MessageFormat footer=new MessageFormat("Total Price:"+edittext_sale_finalAmount_id.getText());
       
        try {
            sale_tbl.print(JTable.PrintMode.FIT_WIDTH,header,footer);
            
            
        } catch (Exception e) {
        }
            
            
            
                    
            

                }else {
                    JOptionPane.showMessageDialog(this, "Canceled");
                }
            
 
            

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "User info database not found");
        }
        
            }   
        
        
                
        
    }//GEN-LAST:event_button_saleNowMouseClicked

    private void button_saleNowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_saleNowMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_saleNowMousePressed

    private void button_saleNowMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_saleNowMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_button_saleNowMouseReleased

    private void button_saleNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_saleNowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_saleNowActionPerformed

    private void button_addItem6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem6MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem6MouseDragged

    private void button_addItem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem6MouseClicked
        DefaultTableModel DTM=(DefaultTableModel) sale_tbl.getModel();
          try {
        int removerow=sale_tbl.getSelectedRow();
        DTM.removeRow(removerow);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "To Delete Please Select a Row");
        }
        
        
    }//GEN-LAST:event_button_addItem6MouseClicked

    private void button_addItem6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem6MousePressed

    private void button_addItem6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem6MouseReleased

    private void button_addItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem6ActionPerformed

    private void edittext_sale_company_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_sale_company_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_sale_company_idActionPerformed

    private void edittext_sale_c_location_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_sale_c_location_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_sale_c_location_idActionPerformed

    private void edittext_sale_c_area_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_sale_c_area_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_sale_c_area_idActionPerformed

    private void edittext_sale_c_phone_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_sale_c_phone_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_sale_c_phone_idActionPerformed

    private void edittext_sale_c_blance_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_sale_c_blance_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_sale_c_blance_idActionPerformed

    private void eidittext_product_quentityIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eidittext_product_quentityIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eidittext_product_quentityIdActionPerformed

    private void edittext_sale_discount_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_sale_discount_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_sale_discount_idActionPerformed

    private void edittext_sale_product_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_sale_product_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_sale_product_idActionPerformed

    private void edittext_sale_productType_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_sale_productType_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_sale_productType_idActionPerformed

    private void edittext_sale_saleRate_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_sale_saleRate_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_sale_saleRate_idActionPerformed

    private void edittext_sale_productTotalAmount_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_sale_productTotalAmount_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_sale_productTotalAmount_idActionPerformed

    private void you_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_you_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_you_saveActionPerformed

    private void edittext_sale_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_sale_invoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_sale_invoiceActionPerformed

    private void edittext_sale_finalAmount_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_sale_finalAmount_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_sale_finalAmount_idActionPerformed

    private void button_addItem7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem7MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem7MouseDragged

    private void button_addItem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem7MouseClicked

    private void button_addItem7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem7MousePressed

    private void button_addItem7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem7MouseReleased

    private void button_addItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addItem7ActionPerformed
         DateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");
         Calendar cal = Calendar.getInstance();
         
     
         
         edittext_sale_invoice.setText(dateFormat.format(cal.getTime()));
   
    }//GEN-LAST:event_button_addItem7ActionPerformed

    private void sale_customerTypeComboBox_idItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sale_customerTypeComboBox_idItemStateChanged
        
        
    }//GEN-LAST:event_sale_customerTypeComboBox_idItemStateChanged

    private void sale_customerTypeComboBox_idPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_sale_customerTypeComboBox_idPopupMenuWillBecomeInvisible
      
        String seletedIndx=(String) sale_customerTypeComboBox_id.getSelectedItem();
        String cus_data="SELECT * from customer_list where c_name=?";
        try {
            pps=conn.prepareStatement(cus_data);
            pps.setString(1, seletedIndx);
            resultSet=pps.executeQuery();
            if (resultSet.next()) {
                customer_id=resultSet.getString("c_id");
                edittext_sale_company_id.setText(resultSet.getString("c_company"));
                 edittext_sale_c_phone_id.setText(resultSet.getString("c_phone"));
                  edittext_sale_c_location_id.setText(resultSet.getString("c_location"));
                   edittext_sale_c_area_id.setText(resultSet.getString("c_area"));
                   edittext_sale_c_blance_id.setText(resultSet.getString("c_blance"));
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_sale_customerTypeComboBox_idPopupMenuWillBecomeInvisible

    private void productName_ComboBox_idPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_productName_ComboBox_idPopupMenuWillBecomeInvisible
        String seletedIndx=(String) productName_ComboBox_id.getSelectedItem();

        String cus_data="SELECT * from product_name where porduct_info_name=?";
        try {
            
           
            pps=conn.prepareStatement(cus_data);
            pps.setString(1, seletedIndx);
            resultSet=pps.executeQuery();
            if (resultSet.next()) {
   
                p_id=resultSet.getString("porduct_info_id");
                edittext_sale_product_id.setText(p_id);
                 edittext_sale_productType_id.setText(resultSet.getString("porduct_info_type"));
                  edittext_sale_saleRate_id.setText(resultSet.getString("porduct_info_salerate"));
                   edittext_sale_productAvaiable_id.setText(resultSet.getString("porduct_info_totalamount"));
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Sales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_productName_ComboBox_idPopupMenuWillBecomeInvisible

    private void edittext_sale_productAvaiable_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_sale_productAvaiable_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_sale_productAvaiable_idActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
       String Quentity=eidittext_product_quentityId.getText();
     
       
       int a=Integer.parseInt(Quentity);
       
       int b=1;
       int sum=a+b;
       
       
       String numberAsString = String.valueOf(sum);
       
       eidittext_product_quentityId.setText(numberAsString);
       
        String sale_rate=edittext_sale_saleRate_id.getText();
        int a1=Integer.parseInt(sale_rate);
        int c=a1*sum;
        
        String avbl=edittext_sale_productAvaiable_id.getText();
        int abail=Integer.parseInt(avbl);
        
        if (a>abail ) {
            JOptionPane.showMessageDialog(this, "Product Not available");
            
        }else if(abail<=2){
            JOptionPane.showMessageDialog(this, "Incaficent product must Re order now");
        }else{
       String total_amount = String.valueOf(c);
       edittext_sale_productTotalAmount_id.setText(total_amount);
       
       
       
       

       
        }
        
        
        
        
        
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        String Quentity=eidittext_product_quentityId.getText();
     
       int a=Integer.parseInt(Quentity);
      
        if (a>0) {
                   int b=1;
       int sum=a-b;
       
       String numberAsString = String.valueOf(sum);
       eidittext_product_quentityId.setText(numberAsString);
       
        String sale_rate=edittext_sale_saleRate_id.getText();
        int a1=Integer.parseInt(sale_rate);
        int c=a1*sum;
        String total_amount = String.valueOf(c);
        edittext_sale_productTotalAmount_id.setText(total_amount);
        }else{
            JOptionPane.showMessageDialog(this, "Incorret Value");
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void button_addItem9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem9MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem9MouseDragged

    private void button_addItem9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem9MouseClicked
       
        
        
   
        
        String P_name =(String) productName_ComboBox_id.getSelectedItem();
        String P_Id=edittext_sale_product_id.getText();
        String P_type=edittext_sale_productType_id.getText();
        String P_quentity=eidittext_product_quentityId.getText();
        String P_rate=edittext_sale_saleRate_id.getText();
        String P_totalAmont=edittext_sale_productTotalAmount_id.getText();
       
       
        
        
            DefaultTableModel DTM=(DefaultTableModel) sale_tbl.getModel();
          
             DTM.addRow(new   Object  [] {P_name,P_Id,P_type,P_quentity,P_rate,P_totalAmont});
             
             
                 /// edittext_sale_productTotalAmount_id
                 
                 
      String unit_price=edittext_sale_productTotalAmount_id.getText();
     
       
       int a=Integer.parseInt(unit_price);
       sum=sum+a;
       
       
       String numberAsString = String.valueOf(sum);
       total_rowValueId.setText(numberAsString);
                 
                 
 
    }//GEN-LAST:event_button_addItem9MouseClicked

   
    
    private void button_addItem9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem9MousePressed

    private void button_addItem9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem9MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem9MouseReleased

    private void button_addItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addItem9ActionPerformed

        
        
    }//GEN-LAST:event_button_addItem9ActionPerformed

    private void button_addItem10MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem10MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem10MouseDragged

    private void button_addItem10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem10MouseClicked

       
       String orgi_price=total_rowValueId.getText();
       int OP=Integer.parseInt(orgi_price);
       
       String dis_price=edittext_sale_discount_id.getText();
       int DP=Integer.parseInt(dis_price);
       
       int temp=OP*DP;
       double save_amount=temp/100;
       
       String final_price=String.valueOf(save_amount);
       you_save.setText(final_price);
       
       
       int discountAfter=(int) (OP-save_amount);
       String dpafter=String.valueOf(discountAfter);
       edittext_sale_finalAmount_id.setText(dpafter);
       
       
      
       
       
       
       
       
    }//GEN-LAST:event_button_addItem10MouseClicked

    private void button_addItem10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem10MousePressed

    private void button_addItem10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem10MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem10MouseReleased

    private void button_addItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem10ActionPerformed


    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_addItem10;
    private javax.swing.JButton button_addItem6;
    private javax.swing.JButton button_addItem7;
    private javax.swing.JButton button_addItem9;
    private javax.swing.JButton button_saleNow;
    private javax.swing.JTextField edittext_sale_c_area_id;
    private javax.swing.JTextField edittext_sale_c_blance_id;
    private javax.swing.JTextField edittext_sale_c_location_id;
    private javax.swing.JTextField edittext_sale_c_phone_id;
    private javax.swing.JTextField edittext_sale_company_id;
    private javax.swing.JTextField edittext_sale_discount_id;
    private javax.swing.JTextField edittext_sale_finalAmount_id;
    private javax.swing.JTextField edittext_sale_invoice;
    private javax.swing.JTextField edittext_sale_productAvaiable_id;
    private javax.swing.JTextField edittext_sale_productTotalAmount_id;
    private javax.swing.JTextField edittext_sale_productType_id;
    private javax.swing.JTextField edittext_sale_product_id;
    private javax.swing.JTextField edittext_sale_saleRate_id;
    private javax.swing.JTextField eidittext_product_quentityId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> productName_ComboBox_id;
    private javax.swing.JComboBox<String> sale_customerTypeComboBox_id;
    private javax.swing.JTable sale_tbl;
    private javax.swing.JLabel total_rowValueId;
    private javax.swing.JTextField you_save;
    // End of variables declaration//GEN-END:variables

   private void CustomerType_forCombo(){
       String s="SELECT * FROM customer_list";
       
            try {
                pps=conn.prepareStatement(s);
                resultSet=pps.executeQuery();
                while (resultSet.next()) {
                    String type=resultSet.getString("c_name");
                    sale_customerTypeComboBox_id.addItem(type);
                    
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Add_Item.class.getName()).log(Level.SEVERE, null, ex);
            }
       
       
   }
   
      private void PorductList_forCombo(){
       String s="SELECT * FROM product_name";
       
            try {
                pps=conn.prepareStatement(s);
                resultSet=pps.executeQuery();
                while (resultSet.next()) {
                    String type=resultSet.getString("porduct_info_name");
                    productName_ComboBox_id.addItem(type);
                    
                }
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Add_Item.class.getName()).log(Level.SEVERE, null, ex);
            }
       
       
   }



      
}


