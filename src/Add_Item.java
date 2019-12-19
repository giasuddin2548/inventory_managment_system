
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;





public class Add_Item extends javax.swing.JInternalFrame {
    
    Connection conn=null;
    Statement statment=null;
    ResultSet resultSet=null;
     PreparedStatement pps=null;
    Statement statement=null;
    

 
    public Add_Item() {
        initComponents();
        
        conn=MyConnection.connection();

        
    
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bu=(BasicInternalFrameUI) this.getUI();
        bu.setNorthPane(null);
        pro_catType_forCombo();
        showRecord();
        
    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Product_Info_searchbyName_Id = new javax.swing.JTextField();
        Product_Info_searchbyId_Id = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        Product_Info_SearchButton = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        edittext_Pinfo_purch_rate_id = new javax.swing.JTextField();
        edittext_Pinfo_comboBox_Id = new javax.swing.JComboBox<>();
        edittext_Pinfo_name = new javax.swing.JTextField();
        edittext_Pinfo_Id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edittext_Pinfo_sale_id = new javax.swing.JTextField();
        edittext_Pinfo_wholes_Id = new javax.swing.JTextField();
        edittext_Pinfo_amount_Id = new javax.swing.JTextField();
        edittext_Pinfo_profit_Id = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        edittext_p_types = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_info_table_id = new javax.swing.JTable();

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
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Product Information");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1068, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel4.setForeground(new java.awt.Color(51, 51, 51));

        jLabel19.setBackground(new java.awt.Color(17, 145, 208));
        jLabel19.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Search here");

        jLabel20.setBackground(new java.awt.Color(17, 145, 208));
        jLabel20.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("By Name");

        jLabel21.setBackground(new java.awt.Color(17, 145, 208));
        jLabel21.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("By Id");

        Product_Info_searchbyName_Id.setForeground(new java.awt.Color(66, 69, 71));
        Product_Info_searchbyName_Id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Product_Info_searchbyName_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_Info_searchbyName_IdActionPerformed(evt);
            }
        });

        Product_Info_searchbyId_Id.setForeground(new java.awt.Color(66, 69, 71));
        Product_Info_searchbyId_Id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Product_Info_searchbyId_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Product_Info_searchbyId_IdActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        Product_Info_SearchButton.setBackground(new java.awt.Color(17, 145, 208));
        Product_Info_SearchButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Product_Info_SearchButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Product_Info_SearchButton.setText("Search");
        Product_Info_SearchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Product_Info_SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Product_Info_SearchButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Product_Info_SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Product_Info_SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel27.setBackground(new java.awt.Color(17, 145, 208));
        jLabel27.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Print");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Product_Info_searchbyName_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Product_Info_searchbyId_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Product_Info_searchbyId_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Product_Info_searchbyName_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 270, 290));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        edittext_Pinfo_purch_rate_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_Pinfo_purch_rate_id.setCaretColor(new java.awt.Color(51, 51, 51));
        edittext_Pinfo_purch_rate_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_Pinfo_purch_rate_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_Pinfo_purch_rate_idActionPerformed(evt);
            }
        });

        edittext_Pinfo_comboBox_Id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option--" }));
        edittext_Pinfo_comboBox_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_Pinfo_comboBox_IdActionPerformed(evt);
            }
        });

        edittext_Pinfo_name.setForeground(new java.awt.Color(66, 69, 71));
        edittext_Pinfo_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_Pinfo_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_Pinfo_nameActionPerformed(evt);
            }
        });

        edittext_Pinfo_Id.setEditable(false);
        edittext_Pinfo_Id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_Pinfo_Id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_Pinfo_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_Pinfo_IdActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(17, 145, 208));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Product Id:");

        jLabel2.setBackground(new java.awt.Color(17, 145, 208));
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Product Name:");

        jLabel3.setBackground(new java.awt.Color(17, 145, 208));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Product Type:");

        jLabel6.setBackground(new java.awt.Color(17, 145, 208));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Purchase Rate:");

        jLabel10.setBackground(new java.awt.Color(17, 145, 208));
        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Profit:");

        jLabel9.setBackground(new java.awt.Color(17, 145, 208));
        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Amount:");

        jLabel8.setBackground(new java.awt.Color(17, 145, 208));
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("WholeSale Rate:");

        jLabel7.setBackground(new java.awt.Color(17, 145, 208));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Sale Rate:");

        edittext_Pinfo_sale_id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_Pinfo_sale_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_Pinfo_sale_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_Pinfo_sale_idActionPerformed(evt);
            }
        });

        edittext_Pinfo_wholes_Id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_Pinfo_wholes_Id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_Pinfo_wholes_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_Pinfo_wholes_IdActionPerformed(evt);
            }
        });

        edittext_Pinfo_amount_Id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_Pinfo_amount_Id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_Pinfo_amount_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_Pinfo_amount_IdActionPerformed(evt);
            }
        });

        edittext_Pinfo_profit_Id.setForeground(new java.awt.Color(66, 69, 71));
        edittext_Pinfo_profit_Id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_Pinfo_profit_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_Pinfo_profit_IdActionPerformed(evt);
            }
        });

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel23.setBackground(new java.awt.Color(17, 145, 208));
        jLabel23.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Save");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel26.setBackground(new java.awt.Color(17, 145, 208));
        jLabel26.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Delete");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        jLabel24.setBackground(new java.awt.Color(17, 145, 208));
        jLabel24.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Update");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        edittext_p_types.setEditable(false);
        edittext_p_types.setForeground(new java.awt.Color(66, 69, 71));
        edittext_p_types.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        edittext_p_types.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edittext_p_typesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edittext_Pinfo_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edittext_Pinfo_sale_id, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edittext_Pinfo_name, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(edittext_Pinfo_wholes_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edittext_Pinfo_comboBox_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(edittext_Pinfo_amount_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edittext_p_types, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edittext_Pinfo_purch_rate_id, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edittext_Pinfo_profit_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edittext_Pinfo_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edittext_Pinfo_sale_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(edittext_Pinfo_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(edittext_Pinfo_wholes_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(edittext_Pinfo_amount_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edittext_Pinfo_comboBox_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edittext_p_types, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(edittext_Pinfo_purch_rate_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(edittext_Pinfo_profit_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 770, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        product_info_table_id.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        product_info_table_id.setForeground(new java.awt.Color(51, 51, 51));
        product_info_table_id.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "P.Id", "P.Name", "P.Type", "P.Purchase", "P.Sale", "P.Whole", "P.Amount", "P.Profit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(product_info_table_id);
        if (product_info_table_id.getColumnModel().getColumnCount() > 0) {
            product_info_table_id.getColumnModel().getColumn(0).setResizable(false);
            product_info_table_id.getColumnModel().getColumn(1).setResizable(false);
            product_info_table_id.getColumnModel().getColumn(2).setResizable(false);
            product_info_table_id.getColumnModel().getColumn(3).setResizable(false);
            product_info_table_id.getColumnModel().getColumn(4).setResizable(false);
            product_info_table_id.getColumnModel().getColumn(5).setResizable(false);
            product_info_table_id.getColumnModel().getColumn(6).setResizable(false);
            product_info_table_id.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 1050, 270));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1070, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edittext_Pinfo_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_Pinfo_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_Pinfo_IdActionPerformed

    private void edittext_Pinfo_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_Pinfo_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_Pinfo_nameActionPerformed

    private void edittext_Pinfo_comboBox_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_Pinfo_comboBox_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_Pinfo_comboBox_IdActionPerformed

    private void edittext_Pinfo_purch_rate_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_Pinfo_purch_rate_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_Pinfo_purch_rate_idActionPerformed

    private void edittext_Pinfo_sale_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_Pinfo_sale_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_Pinfo_sale_idActionPerformed

    private void edittext_Pinfo_wholes_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_Pinfo_wholes_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_Pinfo_wholes_IdActionPerformed

    private void edittext_Pinfo_amount_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_Pinfo_amount_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_Pinfo_amount_IdActionPerformed

    private void edittext_Pinfo_profit_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_Pinfo_profit_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_Pinfo_profit_IdActionPerformed

    private void Product_Info_SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Product_Info_SearchButtonMouseClicked


           
                try {
            statement=conn.createStatement();
            int std_Id=Integer.parseInt(Product_Info_searchbyId_Id.getText());
            String sql="SELECT * from product_name where porduct_info_id='"+std_Id+"'";
            resultSet=statement.executeQuery(sql);
           if(resultSet.next()){
               
                edittext_Pinfo_Id.setText(resultSet.getString("porduct_info_id"));
                 edittext_Pinfo_name.setText(resultSet.getString("porduct_info_name"));
                  edittext_p_types.setText(resultSet.getString("porduct_info_type"));
                   edittext_Pinfo_purch_rate_id.setText(resultSet.getString("porduct_info_purshase"));
                   
                   edittext_Pinfo_sale_id.setText(resultSet.getString("porduct_info_salerate"));
                   edittext_Pinfo_wholes_Id.setText(resultSet.getString("porduct_info_wholesalerate"));
                   edittext_Pinfo_amount_Id.setText(resultSet.getString("porduct_info_totalamount"));
                     edittext_Pinfo_profit_Id.setText(resultSet.getString("porduct_info_profit"));
           }else{
               JOptionPane.showMessageDialog(this,"Result not found");
           }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please Enter a student Id");
        }
        
    }//GEN-LAST:event_Product_Info_SearchButtonMouseClicked

    
    
        public void showRecord(){
        try {
            statement=conn.createStatement();
            String sql="SELECT * FROM product_name";
            ResultSet rs=statement.executeQuery(sql);
            
            DefaultTableModel dtm=(DefaultTableModel) product_info_table_id.getModel();
            dtm.setRowCount(0);
            
            while (rs.next()) {
                Object o[]={rs.getInt("porduct_info_id"),rs.getString("porduct_info_name"),rs.getString("porduct_info_type"),rs.getString("porduct_info_purshase")
                ,rs.getString("porduct_info_salerate"),rs.getString("porduct_info_wholesalerate"),rs.getString("porduct_info_totalamount"),rs.getString("porduct_info_profit")};
                
                dtm.addRow(o);
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    private void Product_Info_searchbyId_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_Info_searchbyId_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_Info_searchbyId_IdActionPerformed

    private void Product_Info_searchbyName_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Product_Info_searchbyName_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Product_Info_searchbyName_IdActionPerformed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked

        try {
  
            

        
               int Option= JOptionPane.showConfirmDialog(null, "Do You want add ??","Yes",JOptionPane.YES_NO_OPTION);
                if (Option==0) {
                    
            String sql_for_stdAd="INSERT INTO product_name (porduct_info_name,porduct_info_type,porduct_info_purshase,"
                    + "porduct_info_salerate,porduct_info_wholesalerate,porduct_info_totalamount,porduct_info_profit)"
                    + " VALUES(?,?,?, ?,?,?,?) ";      
                               
            
            pps=conn.prepareStatement(sql_for_stdAd);

            pps.setString(1,  edittext_Pinfo_name.getText());
            pps.setString(2,  (String) edittext_Pinfo_comboBox_Id.getSelectedItem());
            pps.setString(3,  edittext_Pinfo_purch_rate_id.getText());
            pps.setString(4,  edittext_Pinfo_sale_id.getText());
            
            pps.setString(5,  edittext_Pinfo_wholes_Id.getText());
            pps.setString(6,  edittext_Pinfo_amount_Id.getText());
            
            pps.setString(7,  edittext_Pinfo_profit_Id.getText());
            
                       
           pps.execute();
                 

        
           
 
           
           
           
            setVisible(true);
            Add_Item h=new Add_Item();
            h.setVisible(true);
           
            JOptionPane.showMessageDialog(this, "Data has been Inserted successfully");
                    
            

                }else {
                    JOptionPane.showMessageDialog(this, "Canceled");
                }
            
 
            

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "User info database not found");
        }
        
    }//GEN-LAST:event_jLabel23MouseClicked


    
    
    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked

        try {
                        //Step:3> Data insert to sql database ()
                        
                        
            statement=conn.createStatement();
            
            //Step:6> Data insert to sql database (call the super class)
            String Id=Product_Info_searchbyId_Id.getText();
            String name=edittext_Pinfo_name.getText();
            String type=(String) edittext_Pinfo_comboBox_Id.getSelectedItem();
            String purate=edittext_Pinfo_purch_rate_id.getText();
            String slerate= edittext_Pinfo_sale_id.getText();
            String wholerate=edittext_Pinfo_wholes_Id.getText();
            String amount=edittext_Pinfo_amount_Id.getText();
            String profit=edittext_Pinfo_profit_Id.getText();
           
            
            
          //  porduct_info_name,porduct_info_type,porduct_info_purshase,"
                 //   + "porduct_info_salerate,porduct_info_wholesalerate,porduct_info_totalamount,porduct_info_profit
            //Step:6> Data insert to sql database (insert data to server)
            String sql ="UPDATE product_name SET porduct_info_name='"+name+"',porduct_info_type='"+type+"',porduct_info_purshase='"+purate+"'"
                    + ",porduct_info_salerate='"+slerate+"',porduct_info_wholesalerate='"+wholerate+"'"
                    + ",porduct_info_totalamount='"+amount+"',porduct_info_profit='"+profit+"' WHERE porduct_info_name='"+Id+"'";
            
            //Step:6> Data insert to sql database ()
            statement.executeUpdate(sql);
            
            setVisible(false);
            Add_Item h=new Add_Item();
            h.setVisible(true);
            JOptionPane.showMessageDialog(this, "Data has been Upadated successfully");
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select A record from database");
        }
        
        
        
        
        
        
        
        
      
        
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        try {
                        //Step:3> Data insert to sql database ()
                        
                        
            statement=conn.createStatement();
            
            //Step:6> Data insert to sql database (call the super class)
           // int Id=Integer.parseInt(Product_Info_searchbyName_Id.getText());
            String name=Product_Info_searchbyId_Id.getText();

            
            

            
            String sql="DELETE FROM `product_name`  WHERE porduct_info_id='"+name+"'";
            
            //Step:6> Data insert to sql database ()
            statement.executeUpdate(sql);
            
            setVisible(false);
            Add_Item h=new Add_Item();
            h.setVisible(true);
            JOptionPane.showMessageDialog(this, "Data has been Deleted successfully");
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select A record from database");
        }
        
        
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
       MessageFormat header=new MessageFormat("Product information ");
       MessageFormat footer=new MessageFormat("Page{0,number,integer}");
       
        try {
            product_info_table_id.print(JTable.PrintMode.FIT_WIDTH,header,footer);
            
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void edittext_p_typesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edittext_p_typesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittext_p_typesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Product_Info_SearchButton;
    private javax.swing.JTextField Product_Info_searchbyId_Id;
    private javax.swing.JTextField Product_Info_searchbyName_Id;
    private javax.swing.JTextField edittext_Pinfo_Id;
    private javax.swing.JTextField edittext_Pinfo_amount_Id;
    private javax.swing.JComboBox<String> edittext_Pinfo_comboBox_Id;
    private javax.swing.JTextField edittext_Pinfo_name;
    private javax.swing.JTextField edittext_Pinfo_profit_Id;
    private javax.swing.JTextField edittext_Pinfo_purch_rate_id;
    private javax.swing.JTextField edittext_Pinfo_sale_id;
    private javax.swing.JTextField edittext_Pinfo_wholes_Id;
    private javax.swing.JTextField edittext_p_types;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable product_info_table_id;
    // End of variables declaration//GEN-END:variables


    
    
    
       private void pro_catType_forCombo(){
       String s="SELECT * FROM tbl_pro_type";
       
            try {
                pps=conn.prepareStatement(s);
                resultSet=pps.executeQuery();
                while (resultSet.next()) {
                    String type=resultSet.getString("pro_name");
                    edittext_Pinfo_comboBox_Id.addItem(type);
                    
                }
                

                
                
            } catch (SQLException ex) {
                Logger.getLogger(Add_Item.class.getName()).log(Level.SEVERE, null, ex);
            }
       
       
   }
}
