
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.Timer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir
 */
public class HomePage extends javax.swing.JFrame {

    
        Timer timer;
        int Delay=100;
        int x,y;
            Connection conn=null;
    Statement statment=null;
    ResultSet resultSet=null;
    PreparedStatement pps=null;
    
     Color paneDefult;
     Color paneClick;
        
    String username;
        
        
    
    
    public HomePage() {
        initComponents();
        
        clockAndTime();
        conn=MyConnection.connection();

      //  admin_info();
        
        
        
    }

     HomePage(String Admin_name) {
       initComponents();
        clockAndTime();
        this.username=Admin_name;
         user_email_id.setText(username);
        
        
    }


    
    
        public void clockAndTime(){
        timer=new Timer(Delay,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
    
         DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa  dd-MM-yyyy");
         Calendar cal = Calendar.getInstance();
         textView_time_for_admin_Id.setText(dateFormat.format(cal.getTime()));
                
               
            }
        }) ;
        timer.start();
        
        
    }
    
        

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_Dialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buttonHomeId2 = new javax.swing.JButton();
        buttonHomeId3 = new javax.swing.JButton();
        left_side_pane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonHomeId = new javax.swing.JButton();
        button_addItem = new javax.swing.JButton();
        button_addItem1 = new javax.swing.JButton();
        button_addItem2 = new javax.swing.JButton();
        button_addItem3 = new javax.swing.JButton();
        button_addItem7 = new javax.swing.JButton();
        buttonHomeId1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        admin_imageId = new javax.swing.JLabel();
        user_email_id = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textView_time_for_admin_Id = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        javax.swing.GroupLayout Menu_DialogLayout = new javax.swing.GroupLayout(Menu_Dialog.getContentPane());
        Menu_Dialog.getContentPane().setLayout(Menu_DialogLayout);
        Menu_DialogLayout.setHorizontalGroup(
            Menu_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        Menu_DialogLayout.setVerticalGroup(
            Menu_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(50, 52, 53));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1305, 0, 45, 40));

        jLabel9.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("-");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1268, 0, 28, 40));

        buttonHomeId2.setBackground(new java.awt.Color(50, 52, 53));
        buttonHomeId2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buttonHomeId2.setForeground(new java.awt.Color(255, 255, 255));
        buttonHomeId2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/help-24.png"))); // NOI18N
        buttonHomeId2.setText("  Help");
        buttonHomeId2.setToolTipText("");
        buttonHomeId2.setAlignmentY(0.0F);
        buttonHomeId2.setBorder(null);
        buttonHomeId2.setBorderPainted(false);
        buttonHomeId2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonHomeId2.setDefaultCapable(false);
        buttonHomeId2.setFocusable(false);
        buttonHomeId2.setMargin(new java.awt.Insets(10, 10, 10, 10));
        buttonHomeId2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonHomeId2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHomeId2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonHomeId2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonHomeId2MouseReleased(evt);
            }
        });
        buttonHomeId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeId2ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonHomeId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 120, 30));

        buttonHomeId3.setBackground(new java.awt.Color(50, 52, 53));
        buttonHomeId3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buttonHomeId3.setForeground(new java.awt.Color(255, 255, 255));
        buttonHomeId3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/menu-4-24.png"))); // NOI18N
        buttonHomeId3.setText("  Manu");
        buttonHomeId3.setToolTipText("");
        buttonHomeId3.setAlignmentY(0.0F);
        buttonHomeId3.setBorder(null);
        buttonHomeId3.setBorderPainted(false);
        buttonHomeId3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonHomeId3.setDefaultCapable(false);
        buttonHomeId3.setFocusable(false);
        buttonHomeId3.setMargin(new java.awt.Insets(10, 10, 10, 10));
        buttonHomeId3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonHomeId3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHomeId3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonHomeId3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonHomeId3MouseReleased(evt);
            }
        });
        jPanel1.add(buttonHomeId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 106, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 40));

        left_side_pane.setBackground(new java.awt.Color(17, 145, 208));
        left_side_pane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/companyicon.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pos Managment");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("One of the Biggest coca cola supplier ");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        buttonHomeId.setBackground(new java.awt.Color(17, 145, 208));
        buttonHomeId.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buttonHomeId.setForeground(new java.awt.Color(255, 255, 255));
        buttonHomeId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/home-24.png"))); // NOI18N
        buttonHomeId.setText("    Home");
        buttonHomeId.setToolTipText("");
        buttonHomeId.setAlignmentY(0.0F);
        buttonHomeId.setBorder(null);
        buttonHomeId.setBorderPainted(false);
        buttonHomeId.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonHomeId.setDefaultCapable(false);
        buttonHomeId.setFocusable(false);
        buttonHomeId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonHomeId.setMargin(new java.awt.Insets(10, 10, 10, 10));
        buttonHomeId.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonHomeId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHomeIdMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonHomeIdMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonHomeIdMouseReleased(evt);
            }
        });

        button_addItem.setBackground(new java.awt.Color(17, 145, 208));
        button_addItem.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        button_addItem.setForeground(new java.awt.Color(255, 255, 255));
        button_addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/add-24.png"))); // NOI18N
        button_addItem.setText("    Add Item");
        button_addItem.setToolTipText("");
        button_addItem.setAlignmentY(0.0F);
        button_addItem.setBorder(null);
        button_addItem.setBorderPainted(false);
        button_addItem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_addItem.setDefaultCapable(false);
        button_addItem.setFocusable(false);
        button_addItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_addItem.setMargin(new java.awt.Insets(10, 10, 10, 10));
        button_addItem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_addItem.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                button_addItemMouseDragged(evt);
            }
        });
        button_addItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_addItemMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_addItemMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_addItemMouseReleased(evt);
            }
        });

        button_addItem1.setBackground(new java.awt.Color(17, 145, 208));
        button_addItem1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        button_addItem1.setForeground(new java.awt.Color(255, 255, 255));
        button_addItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/custmoer .png"))); // NOI18N
        button_addItem1.setText("    Customer List");
        button_addItem1.setToolTipText("");
        button_addItem1.setAlignmentY(0.0F);
        button_addItem1.setBorder(null);
        button_addItem1.setBorderPainted(false);
        button_addItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_addItem1.setDefaultCapable(false);
        button_addItem1.setFocusable(false);
        button_addItem1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_addItem1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        button_addItem1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_addItem1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                button_addItem1MouseDragged(evt);
            }
        });
        button_addItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_addItem1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_addItem1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_addItem1MouseReleased(evt);
            }
        });
        button_addItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addItem1ActionPerformed(evt);
            }
        });

        button_addItem2.setBackground(new java.awt.Color(17, 145, 208));
        button_addItem2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        button_addItem2.setForeground(new java.awt.Color(255, 255, 255));
        button_addItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/purchase-order-24.png"))); // NOI18N
        button_addItem2.setText("    Purchase");
        button_addItem2.setToolTipText("");
        button_addItem2.setAlignmentY(0.0F);
        button_addItem2.setBorder(null);
        button_addItem2.setBorderPainted(false);
        button_addItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_addItem2.setDefaultCapable(false);
        button_addItem2.setFocusable(false);
        button_addItem2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_addItem2.setMargin(new java.awt.Insets(10, 10, 10, 10));
        button_addItem2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_addItem2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                button_addItem2MouseDragged(evt);
            }
        });
        button_addItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_addItem2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_addItem2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_addItem2MouseReleased(evt);
            }
        });

        button_addItem3.setBackground(new java.awt.Color(17, 145, 208));
        button_addItem3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        button_addItem3.setForeground(new java.awt.Color(255, 255, 255));
        button_addItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/categorize-24.png"))); // NOI18N
        button_addItem3.setText("    Add Category");
        button_addItem3.setToolTipText("");
        button_addItem3.setAlignmentY(0.0F);
        button_addItem3.setBorder(null);
        button_addItem3.setBorderPainted(false);
        button_addItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_addItem3.setDefaultCapable(false);
        button_addItem3.setFocusable(false);
        button_addItem3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        button_addItem3.setMargin(new java.awt.Insets(10, 10, 10, 10));
        button_addItem3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        button_addItem3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                button_addItem3MouseDragged(evt);
            }
        });
        button_addItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_addItem3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_addItem3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button_addItem3MouseReleased(evt);
            }
        });
        button_addItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addItem3ActionPerformed(evt);
            }
        });

        button_addItem7.setBackground(new java.awt.Color(17, 145, 208));
        button_addItem7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        button_addItem7.setForeground(new java.awt.Color(255, 255, 255));
        button_addItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/purchase-order-24.png"))); // NOI18N
        button_addItem7.setText("    Sales Reports");
        button_addItem7.setToolTipText("");
        button_addItem7.setAlignmentY(0.0F);
        button_addItem7.setBorder(null);
        button_addItem7.setBorderPainted(false);
        button_addItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_addItem7.setDefaultCapable(false);
        button_addItem7.setFocusable(false);
        button_addItem7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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

        buttonHomeId1.setBackground(new java.awt.Color(17, 145, 208));
        buttonHomeId1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        buttonHomeId1.setForeground(new java.awt.Color(255, 255, 255));
        buttonHomeId1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/sale-24.png"))); // NOI18N
        buttonHomeId1.setText("    Sales");
        buttonHomeId1.setToolTipText("");
        buttonHomeId1.setAlignmentY(0.0F);
        buttonHomeId1.setBorder(null);
        buttonHomeId1.setBorderPainted(false);
        buttonHomeId1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonHomeId1.setDefaultCapable(false);
        buttonHomeId1.setFocusable(false);
        buttonHomeId1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonHomeId1.setMargin(new java.awt.Insets(10, 10, 10, 10));
        buttonHomeId1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonHomeId1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHomeId1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buttonHomeId1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonHomeId1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout left_side_paneLayout = new javax.swing.GroupLayout(left_side_pane);
        left_side_pane.setLayout(left_side_paneLayout);
        left_side_paneLayout.setHorizontalGroup(
            left_side_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_side_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(left_side_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonHomeId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_addItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_addItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_addItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_addItem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(left_side_paneLayout.createSequentialGroup()
                        .addGroup(left_side_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(left_side_paneLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(buttonHomeId1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_addItem7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        left_side_paneLayout.setVerticalGroup(
            left_side_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_side_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(left_side_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(buttonHomeId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_addItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_addItem3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_addItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonHomeId1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_addItem7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        getContentPane().add(left_side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 760));

        jPanel3.setBackground(new java.awt.Color(225, 225, 225));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        admin_imageId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/administrator-48.png"))); // NOI18N

        user_email_id.setBackground(new java.awt.Color(50, 52, 53));
        user_email_id.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        user_email_id.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_email_id.setText("user123");

        jLabel8.setBackground(new java.awt.Color(50, 52, 53));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Logout");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/logout-48.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        textView_time_for_admin_Id.setBackground(new java.awt.Color(50, 52, 53));
        textView_time_for_admin_Id.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        textView_time_for_admin_Id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textView_time_for_admin_Id.setText("12:00 AM 07-06-2019");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(admin_imageId, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user_email_id, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textView_time_for_admin_Id, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(258, 258, 258)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(admin_imageId, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(user_email_id)
                                .addComponent(jLabel8)
                                .addComponent(textView_time_for_admin_Id))
                            .addGap(8, 8, 8))))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 1070, 90));

        jPanel5.setBackground(new java.awt.Color(50, 52, 53));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setBackground(new java.awt.Color(238, 237, 238));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Developer info:");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(238, 237, 238));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Gias Uddin (110),");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(238, 237, 238));
        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Masuma Akter Rima (94),");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(238, 237, 238));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("MH Faisal (126)");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(502, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 770, 1070, 30));

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all_icons/back.png"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(17, 145, 208));
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(50, 52, 53));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Inventory Managment System");

        jLabel12.setBackground(new java.awt.Color(17, 145, 208));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(50, 52, 53));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Powered By UU-Softhub Team");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 1070, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
      int xx=evt.getXOnScreen();
      int yy=evt.getYOnScreen();
      this.setLocation(xx-x, yy-y);  
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       x=evt.getX();
       y=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            String url = "https://www.google.com";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        try {
            String url = "https://www.facebook.com/giasuddin2548";
            
            
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        setVisible(false);
        Login log_page=new Login();
        log_page.setVisible(true);
        log_page.pack();
        log_page.setLocationRelativeTo(this);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void buttonHomeIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeIdMousePressed

      
    }//GEN-LAST:event_buttonHomeIdMousePressed

    private void buttonHomeIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeIdMouseClicked

        jDesktopPane1.removeAll();
        DashBoard add=new DashBoard();
        jDesktopPane1.add(add).setVisible(true);
        
    }//GEN-LAST:event_buttonHomeIdMouseClicked

    private void button_addItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItemMouseClicked
              

        jDesktopPane1.removeAll();
        Add_Item add=new Add_Item();
        jDesktopPane1.add(add).setVisible(true);
    }//GEN-LAST:event_button_addItemMouseClicked

    private void button_addItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItemMousePressed

        
        jDesktopPane1.removeAll();
        Add_Item add=new Add_Item();
        jDesktopPane1.add(add).setVisible(true);
    }//GEN-LAST:event_button_addItemMousePressed

    private void buttonHomeIdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeIdMouseReleased

    }//GEN-LAST:event_buttonHomeIdMouseReleased

    private void button_addItemMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItemMouseReleased

    }//GEN-LAST:event_button_addItemMouseReleased

    private void button_addItemMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItemMouseDragged

    }//GEN-LAST:event_button_addItemMouseDragged

    private void button_addItem1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem1MouseDragged

    private void button_addItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem1MouseClicked
                     

        jDesktopPane1.removeAll();
        Customer_List add=new Customer_List();
        jDesktopPane1.add(add).setVisible(true);
    }//GEN-LAST:event_button_addItem1MouseClicked

    private void button_addItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem1MousePressed

    private void button_addItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem1MouseReleased

    private void button_addItem2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem2MouseDragged

    private void button_addItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem2MouseClicked

    private void button_addItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem2MousePressed

    private void button_addItem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem2MouseReleased

    private void button_addItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem1ActionPerformed

    private void button_addItem3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem3MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem3MouseDragged

    private void button_addItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem3MouseClicked


        
        jDesktopPane1.removeAll();
        AddCategory add=new AddCategory();
        jDesktopPane1.add(add).setVisible(true);
        
    }//GEN-LAST:event_button_addItem3MouseClicked

    private void button_addItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem3MousePressed

    private void button_addItem3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem3MouseReleased

    private void button_addItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem3ActionPerformed

    private void button_addItem7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem7MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem7MouseDragged

    private void button_addItem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem7MouseClicked
        
        jDesktopPane1.removeAll();
        Sale_Reports add=new Sale_Reports();
        jDesktopPane1.add(add).setVisible(true);
    }//GEN-LAST:event_button_addItem7MouseClicked

    private void button_addItem7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem7MousePressed

    private void button_addItem7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addItem7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addItem7MouseReleased

    private void buttonHomeId1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeId1MouseClicked
                jDesktopPane1.removeAll();
        Sales add=new Sales(username);
        jDesktopPane1.add(add).setVisible(true);
    }//GEN-LAST:event_buttonHomeId1MouseClicked

    private void buttonHomeId1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeId1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHomeId1MousePressed

    private void buttonHomeId1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeId1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHomeId1MouseReleased

    private void buttonHomeId2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeId2MouseClicked
        jDesktopPane1.removeAll();
        Help add=new Help();
        jDesktopPane1.add(add).setVisible(true);
    }//GEN-LAST:event_buttonHomeId2MouseClicked

    private void buttonHomeId2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeId2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHomeId2MousePressed

    private void buttonHomeId2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeId2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHomeId2MouseReleased

    private void buttonHomeId3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeId3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHomeId3MouseClicked

    private void buttonHomeId3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeId3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHomeId3MousePressed

    private void buttonHomeId3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHomeId3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHomeId3MouseReleased

    private void buttonHomeId2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeId2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonHomeId2ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
               try {
            String url = "https://www.facebook.com/masumaakterrima13";
            
            
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        try {
            String url = "https://www.facebook.com/mh.faisal.779";
            
            
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        }
        catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Menu_Dialog;
    private javax.swing.JLabel admin_imageId;
    private javax.swing.JButton buttonHomeId;
    private javax.swing.JButton buttonHomeId1;
    private javax.swing.JButton buttonHomeId2;
    private javax.swing.JButton buttonHomeId3;
    private javax.swing.JButton button_addItem;
    private javax.swing.JButton button_addItem1;
    private javax.swing.JButton button_addItem2;
    private javax.swing.JButton button_addItem3;
    private javax.swing.JButton button_addItem7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel left_side_pane;
    private javax.swing.JLabel textView_time_for_admin_Id;
    private javax.swing.JLabel user_email_id;
    // End of variables declaration//GEN-END:variables
}
