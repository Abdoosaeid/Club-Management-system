 
package clubmanagementsystem;
import com.sun.org.apache.xml.internal.dtm.DTM;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.table.TableRowSorter;
 
public class Main extends javax.swing.JFrame {
   Connection  con;
    ArrayList<Integer>sport_id=new ArrayList<>();
        DefaultTableModel tableModel;
    private JTable table;
    public Main() {
        initComponents();

         try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clup", "root", "abdosaidmysql");
    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
      
       fillcombox ();
     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btn_Add = new javax.swing.JButton();
        btn_Football = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btn_member_id = new javax.swing.JTextField();
        btn_email = new javax.swing.JTextField();
        btn_address = new javax.swing.JTextField();
        btn_phone = new javax.swing.JTextField();
        cbox_sports = new javax.swing.JComboBox<>();
        rb_male = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btn_joining_date = new javax.swing.JTextField();
        btn_expiration_date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btn_day = new javax.swing.JTextField();
        btn_month = new javax.swing.JTextField();
        btn_year = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btn_searshFootball = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        btn_searchSwimming = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        btn_SearchTennis = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        btn_searchGym = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Club Managment System");
        setResizable(false);
        setSize(new java.awt.Dimension(1497, 808));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        btn_Add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Add.setText("Add");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Add(evt);
            }
        });

        btn_Football.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Football.setText("Football");
        btn_Football.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FootballActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Swimming");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("Tennis");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setText("Gym");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(btn_Football, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_Football, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 810));

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 204));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(820, 900));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Welcome To Our Club");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 76, -1, -1));

        btn_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(btn_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 77, 599, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Member_ID");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Address");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 238, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 184, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("Date of birth");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 349, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("Sport_Type");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 410, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Phone_No");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 292, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("Gender");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 465, -1, -1));

        btn_member_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(btn_member_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 131, 327, -1));

        btn_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(btn_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 185, 327, -1));

        btn_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(btn_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 239, 327, -1));

        btn_phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(btn_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 293, 123, -1));

        cbox_sports.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbox_sports.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbox_sports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_sportsActionPerformed(evt);
            }
        });
        jPanel2.add(cbox_sports, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 407, 327, -1));

        buttonGroup1.add(rb_male);
        rb_male.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_male.setForeground(new java.awt.Color(0, 153, 204));
        rb_male.setText("Male");
        jPanel2.add(rb_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 467, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(204, 0, 204));
        jRadioButton2.setText("Female");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 467, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Joining Date");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 519, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setText("Expiration Date");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 574, -1, -1));

        btn_joining_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(btn_joining_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 520, 200, -1));

        btn_expiration_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(btn_expiration_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 575, 200, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("/");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 349, -1, -1));

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 1007, 35, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("/");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 349, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setText("Age");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 343, -1, 34));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 346, -1, 34));

        btn_day.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(btn_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 346, 35, -1));

        btn_month.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(btn_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 346, 35, -1));

        btn_year.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(btn_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 346, 75, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 343, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 623, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\newclub\\newClub\\test\\WhatsApp Image 2023-12-27 at 19.57.12_6f381f84.jpg")); // NOI18N
        jLabel13.setText(" ");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 770));

        jTabbedPane1.addTab("Add", jPanel2);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_searshFootball.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_searshFootball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searshFootballActionPerformed(evt);
            }
        });
        jPanel12.add(btn_searshFootball, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 70, 330, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Member_ID", "Phone", "Age", "payment_status", "Gender", "Joining Date", "Expiration Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel12.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 116, 1260, 210));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, 100, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\newclub\\newClub\\test\\WhatsApp Image 2023-12-27 at 17.55.13_37d06a46.jpg")); // NOI18N
        jLabel9.setText(" ");
        jPanel12.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 770));

        jTabbedPane1.addTab("Football", jPanel12);

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Swimming");
        jPanel13.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 22, -1, 48));

        btn_searchSwimming.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_searchSwimming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchSwimmingActionPerformed(evt);
            }
        });
        jPanel13.add(btn_searchSwimming, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 77, 330, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Member_ID", "Phone", "Age", "payment_status", "Gender", "Joining Date", "Expiration Date"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel13.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1260, 209));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("Search");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, 100, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\newclub\\newClub\\test\\WhatsApp Image 2023-12-27 at 17.55.12_19a81f23.jpg")); // NOI18N
        jLabel10.setText(" ");
        jPanel13.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 770));

        jTabbedPane1.addTab("Swimming", jPanel13);

        jPanel14.setBackground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel38.setText("  Tennis");
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 12, 128, 54));

        btn_SearchTennis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_SearchTennis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchTennisActionPerformed(evt);
            }
        });
        jPanel14.add(btn_SearchTennis, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 73, 330, 40));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
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
                "Name", "Member_ID", "Phone", "Age", "payment_status", "Gender", "Joining Date", "Expiration Date"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel14.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 1260, 209));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 72, 100, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\newclub\\newClub\\test\\WhatsApp Image 2023-12-27 at 17.55.13_5f371623.jpg")); // NOI18N
        jLabel11.setText(" ");
        jPanel14.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -3, 1300, 770));

        jTabbedPane1.addTab("Tennis", jPanel14);

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel39.setText("    GYM");
        jPanel15.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 5, 131, 55));

        btn_searchGym.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel15.add(btn_searchGym, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 67, 330, 40));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Member_ID", "Phone", "Age", "payment_status", "Gender", "Joining Date", "Expiration Date"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jPanel15.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 113, 1294, 215));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setText("Search");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 66, 100, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\newclub\\newClub\\test\\WhatsApp Image 2023-12-27 at 17.55.13_cd926947.jpg")); // NOI18N
        jLabel12.setText(" ");
        jPanel15.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 1300, 780));

        jTabbedPane1.addTab("Gym", jPanel15);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1660, 1070));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Add(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Add
    jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btn_Add

    private void btn_FootballActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FootballActionPerformed
        jTabbedPane1.setSelectedIndex(1);
            fillTableFootball();
    }//GEN-LAST:event_btn_FootballActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     jTabbedPane1.setSelectedIndex(2);
     fillTableSwimming();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jTabbedPane1.setSelectedIndex(3);
         fillTableTennis();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          jTabbedPane1.setSelectedIndex(4);
          fillTableGym();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            details back =new details() ;
            this.hide();
             back.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void btn_searshFootballActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searshFootballActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_searshFootballActionPerformed
private void fillTableFootball() {
    try {
        String query = "SELECT " +
                "name, " +
                "member_id, " +
                "phone_no, " +
                "YEAR(CURDATE()) - YEAR(date_of_birth) - (RIGHT(CURDATE(), 5) < RIGHT(date_of_birth, 5)) AS age, " +
                "payment_status, " +
                "gender, " +
                "joining_date, " +
                "expiration_date " +
                "FROM members " +
                "WHERE sport_id = 1";   

        PreparedStatement stmt = con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

       
        String[] columnNames = {"Name", "Member_ID", "Phone", "Age", "payment_status", "Gender", "Joining Date", "Expiration Date"};
        DefaultTableModel tblModel = new DefaultTableModel(columnNames, 0);

        while (rs.next()) {
            String name = rs.getString("name");
            String memberId = rs.getString("member_id");
            String phoneNo = rs.getString("phone_no");
            String age = rs.getString("age"); // Convert age to String
            String paymentStatus = rs.getString("payment_status");
            String gender = rs.getString("gender");
            String joiningDate = rs.getString("joining_date");
            String expirationDate = rs.getString("expiration_date");

            String[] toData = {name, memberId, phoneNo, age, paymentStatus, gender, joiningDate, expirationDate};    
            tblModel.addRow(toData);
        }

      
        jTable1.setModel(tblModel);

    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    private void fillTableSwimming() {
    try {
        String query = "SELECT " +
                "name, " +
                "member_id, " +
                "phone_no, " +
                "YEAR(CURDATE()) - YEAR(date_of_birth) - (RIGHT(CURDATE(), 5) < RIGHT(date_of_birth, 5)) AS age, " +
                "payment_status, " +
                "gender, " +
                "joining_date, " +
                "expiration_date " +
                "FROM members " +
                "WHERE sport_id = 3";   

        PreparedStatement stmt = con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

         
        String[] columnNames = {"Name", "Member_ID", "Phone", "Age", "payment_status", "Gender", "Joining Date", "Expiration Date"};
        DefaultTableModel tblModel = new DefaultTableModel(columnNames, 0);

        while (rs.next()) {
            String name = rs.getString("name");
            String memberId = rs.getString("member_id");
            String phoneNo = rs.getString("phone_no");
            String age = rs.getString("age"); // Convert age to String
            String paymentStatus = rs.getString("payment_status");
            String gender = rs.getString("gender");
            String joiningDate = rs.getString("joining_date");
            String expirationDate = rs.getString("expiration_date");

            String[] toData = {name, memberId, phoneNo, age, paymentStatus, gender, joiningDate, expirationDate};    
            tblModel.addRow(toData);
        }

        
        jTable2.setModel(tblModel);

    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
}
  
    private void fillTableTennis() {
    try {
        String query = "SELECT " +
                "name, " +
                "member_id, " +
                "phone_no, " +
                "YEAR(CURDATE()) - YEAR(date_of_birth) - (RIGHT(CURDATE(), 5) < RIGHT(date_of_birth, 5)) AS age, " +
                "payment_status, " +
                "gender, " +
                "joining_date, " +
                "expiration_date " +
                "FROM members " +
                "WHERE sport_id = 2";   

        PreparedStatement stmt = con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

         
        String[] columnNames = {"Name", "Member_ID", "Phone", "Age", "payment_status", "Gender", "Joining Date", "Expiration Date"};
        DefaultTableModel tblModel = new DefaultTableModel(columnNames, 0);

        while (rs.next()) {
            String name = rs.getString("name");
            String memberId = rs.getString("member_id");
            String phoneNo = rs.getString("phone_no");
            String age = rs.getString("age"); // Convert age to String
            String paymentStatus = rs.getString("payment_status");
            String gender = rs.getString("gender");
            String joiningDate = rs.getString("joining_date");
            String expirationDate = rs.getString("expiration_date");

            String[] toData = {name, memberId, phoneNo, age, paymentStatus, gender, joiningDate, expirationDate};    
            tblModel.addRow(toData);
        }

       
        jTable3.setModel(tblModel);

    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
}
       private void fillTableGym() {
    try {
        String query = "SELECT " +
                "name, " +
                "member_id, " +
                "phone_no, " +
                "YEAR(CURDATE()) - YEAR(date_of_birth) - (RIGHT(CURDATE(), 5) < RIGHT(date_of_birth, 5)) AS age, " +
                "payment_status, " +
                "gender, " +
                "joining_date, " +
                "expiration_date " +
                "FROM members " +
                "WHERE sport_id = 4";   

        PreparedStatement stmt = con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

         
        String[] columnNames = {"Name", "Member_ID", "Phone", "Age", "payment_status", "Gender", "Joining Date", "Expiration Date"};
        DefaultTableModel tblModel = new DefaultTableModel(columnNames, 0);

        while (rs.next()) {
            String name = rs.getString("name");
            String memberId = rs.getString("member_id");
            String phoneNo = rs.getString("phone_no");
            String age = rs.getString("age"); // Convert age to String
            String paymentStatus = rs.getString("payment_status");
            String gender = rs.getString("gender");
            String joiningDate = rs.getString("joining_date");
            String expirationDate = rs.getString("expiration_date");

            String[] toData = {name, memberId, phoneNo, age, paymentStatus, gender, joiningDate, expirationDate};    
            tblModel.addRow(toData);
        }

         
        jTable5.setModel(tblModel);

    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
}
             
private void fillcombox() {
    try {
        PreparedStatement stem = con.prepareStatement("select sport_id, sport_name from sports");
        ResultSet rs = stem.executeQuery();

        
        sport_id.clear();
        cbox_sports.removeAllItems();

         
      
        while (rs.next()) {
            int currentSportId = rs.getInt(1);
            sport_id.add(currentSportId);
            cbox_sports.addItem(rs.getString(2));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
    if (con == null) {
        JOptionPane.showMessageDialog(this, "Database connection not established");
        return;   
    }
    if (btn_name.getText().equals("") || btn_member_id.getText().equals("") || btn_email.getText().equals("") ||
            btn_address.getText().equals("") || btn_phone.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please, Fill Complete Information ");
    } else {
        try {
            String member_name = btn_name.getText();
            String member_id = btn_member_id.getText();
            String member_email = btn_email.getText();
            String member_address = btn_address.getText();
            String member_phone = btn_phone.getText();            
            int day = Integer.parseInt(btn_day.getText());
            int month = Integer.parseInt( btn_month.getText());
            int year = Integer.parseInt( btn_year.getText());
            int selectedSportIndex = cbox_sports.getSelectedIndex();
             int sportId=0 ;
            if (!sport_id.isEmpty()) {
            
            if (selectedSportIndex >= 0 && selectedSportIndex < sport_id.size()) {
                sportId = sport_id.get(selectedSportIndex);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a valid sport");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No sports available");
        }
            if (isValidDate(year, month, day)) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(year, month - 1, day);  

                Date dateOfBirth = new Date(calendar.getTimeInMillis());
 

                String gender = (rb_male.isSelected()) ? "Male" : "Female";
                
                PreparedStatement stmt = con.prepareStatement("insert into  members(name, member_id, email, " +
                        "address, phone_no, date_of_birth, sport_id, gender, joining_date, expiration_date) " +
                        "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                stmt.setString(1, member_name);
                stmt.setString(2, member_id);
                stmt.setString(3, member_email);
                stmt.setString(4, member_address);
                stmt.setString(5, member_phone);
                stmt.setDate(6, new java.sql.Date(dateOfBirth.getTime())); 
                stmt.setInt(7, sportId);  
                stmt.setString(8, gender);
                stmt.setString(9, btn_joining_date.getText());
                stmt.setString(10, btn_expiration_date.getText());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Added successfully");
                
            } else {
                JOptionPane.showMessageDialog(this, "Invalid date");
            }
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred: " + ex.getMessage());
        }
    }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        int Day= Integer.parseInt(btn_day.getText());
        int Month=Integer.parseInt(btn_month.getText());
        int Year=Integer.parseInt(btn_year.getText());

        LocalDate birthDay =LocalDate.of(Year,Month,Day);

        LocalDate nowDate = LocalDate.now();

        int period=Period.between(birthDay, nowDate).getYears();

        jLabel8.setText(String.valueOf(period));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed
 
    private void cbox_sportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_sportsActionPerformed
            
    }//GEN-LAST:event_cbox_sportsActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            String searchTerm =btn_searshFootball.getText();
    
    if (searchTerm != null) {
        searchByName(  searchTerm,   jTable1);
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btn_SearchTennisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchTennisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SearchTennisActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         
                   String searchTerm =btn_searchGym.getText();  
    if (searchTerm != null) {
        searchByName(  searchTerm,   jTable5);
    }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      String searchTerm =btn_searchSwimming.getText();  
    if (searchTerm != null) {
        searchByName(  searchTerm,   jTable2);
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      String searchTerm =btn_SearchTennis.getText();
    
    if (searchTerm != null) {
        searchByName(  searchTerm,   jTable3);
    }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btn_searchSwimmingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchSwimmingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_searchSwimmingActionPerformed
  
   private void searchByName(String searchTerm, JTable table) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    table.setRowSorter(sorter);

    RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + searchTerm);  

    sorter.setRowFilter(rowFilter);
}

    public static void main(String args[]) {
     
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Football;
    private javax.swing.JTextField btn_SearchTennis;
    private javax.swing.JTextField btn_address;
    private javax.swing.JTextField btn_day;
    private javax.swing.JTextField btn_email;
    private javax.swing.JTextField btn_expiration_date;
    private javax.swing.JTextField btn_joining_date;
    private javax.swing.JTextField btn_member_id;
    private javax.swing.JTextField btn_month;
    private javax.swing.JTextField btn_name;
    private javax.swing.JTextField btn_phone;
    private javax.swing.JTextField btn_searchGym;
    private javax.swing.JTextField btn_searchSwimming;
    private javax.swing.JTextField btn_searshFootball;
    private javax.swing.JTextField btn_year;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbox_sports;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    private javax.swing.JRadioButton rb_male;
    // End of variables declaration//GEN-END:variables

   
private boolean isValidDate(int year, int month, int day) {
    if (year >= 1 && month >= 1 && month <= 12 && day >= 1 && day <= getDaysInMonth(year, month)) {
        return true;   
    } else {
        return false; 
    }
}

private int getDaysInMonth(int year, int month) {
    switch (month) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            return 31;
        case 4: case 6: case 9: case 11:
            return 30;
        case 2:
            return (isLeapYear(year) ? 29 : 28);
        default:
            return 0;  // Invalid month
    }
}
private boolean isLeapYear(int year) {
    return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
}

}
