/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubmanagementsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
 


/**
 *
 * @author DELL
 */
public class Home extends javax.swing.JFrame {
      Connection  con;
   DefaultTableModel tableModel;
   private JTable table;
    public Home() {
        initComponents();
         try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clup", "root", "abdosaidmysql");
    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
         fillHomeTable();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        homeTable = new javax.swing.JTable();
        SeachHomeTable = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_SearchHomeTable = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel38.setText(" Home");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 6, 127, 54));

        homeTable.setAutoCreateRowSorter(true);
        homeTable.setBackground(new java.awt.Color(243, 207, 171));
        homeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member_ID", "name", "Email", "Address", "phone_no", "date_of_Birth", "sport_type", "Gender", "Joining Date", "Expiration Date", "payment_Status"
            }
        ));
        homeTable.setSelectionBackground(new java.awt.Color(243, 207, 171));
        homeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(homeTable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 113, 1270, 470));

        SeachHomeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeachHomeTableActionPerformed(evt);
            }
        });
        jPanel1.add(SeachHomeTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 67, 330, 40));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 700, 150, 50));

        btn_update.setBackground(new java.awt.Color(204, 204, 204));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updateMouseClicked(evt);
            }
        });
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(1067, 620, 150, 50));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 175, 50));

        btn_SearchHomeTable.setBackground(new java.awt.Color(255, 204, 153));
        btn_SearchHomeTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_SearchHomeTable.setText("Search");
        btn_SearchHomeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchHomeTableActionPerformed(evt);
            }
        });
        jPanel1.add(btn_SearchHomeTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 66, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\newclub\\newClub\\test\\WhatsApp Image 2023-12-27 at 19.57.12_6f381f84.jpg")); // NOI18N
        jLabel2.setText(" ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SeachHomeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeachHomeTableActionPerformed
        
    }//GEN-LAST:event_SeachHomeTableActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         DefaultTableModel model = (DefaultTableModel) homeTable.getModel();
    int selectedRow = homeTable.getSelectedRow();

    if (selectedRow >= 0) {
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?", "Confirmation", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION) {
          
            String memberId = model.getValueAt(selectedRow, 1).toString();  

        
            try {
                String deleteQuery = "DELETE FROM members WHERE member_id = ?";
                PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
                deleteStmt.setString(1, memberId);
                deleteStmt.executeUpdate();

                 
                model.removeRow(selectedRow);
                 

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error occurred: " + ex.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please, Select a Row First");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     details b1 =new details() ;
      this.hide();
        b1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed

        update m = new update();
            this.hide();
            m.setVisible(true);   
             int selectedRow = homeTable.getSelectedRow();
        if (selectedRow >= 0) {
           
            String memberId = homeTable.getValueAt(selectedRow, 1).toString();
            String memberName = homeTable.getValueAt(selectedRow, 0).toString();
            String email = homeTable.getValueAt(selectedRow, 5).toString();
            String address = homeTable.getValueAt(selectedRow, 6).toString();
            String phone = homeTable.getValueAt(selectedRow, 2).toString();
            String dateOfBirth = homeTable.getValueAt(selectedRow, 5).toString();
            String sportType = homeTable.getValueAt(selectedRow, 9).toString();
            String gender = homeTable.getValueAt(selectedRow, 4).toString();
            String joiningDate = homeTable.getValueAt(selectedRow, 7).toString();
            String expirationDate = homeTable.getValueAt(selectedRow, 8).toString();
            String paymentStatus = homeTable.getValueAt(selectedRow, 10).toString();

      
            update updateFrame = new update();
            updateFrame.setValues(memberId, memberName, email, address, phone, dateOfBirth,sportType, gender, joiningDate, expirationDate, paymentStatus);
            updateFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Please, Select a Row First");
        }
    }//GEN-LAST:event_btn_updateActionPerformed
 private void fillHomeTable() {
    try {
        String query = "SELECT " +
                "members.name, " +
                "members.member_id, " +
                "members.phone_no, " +
                "YEAR(CURDATE()) - YEAR(members.date_of_birth) - (RIGHT(CURDATE(), 5) < RIGHT(members.date_of_birth, 5)) AS age, " +
                "members.gender, " +
                "members.email, " +
                "members.address, " +
                "members.joining_date, " +
                "members.expiration_date, " +
                "sports.sport_name, " +
                "members.payment_status " +
                "FROM members " +
                "JOIN sports ON members.sport_id = sports.sport_id";

        PreparedStatement stmt = con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

      
        String[] columnNames = {"Name", "Member_ID", "Phone", "Age", "Gender", "Email", "Address", "Joining Date", "Expiration Date", "Sport Name", "Payment Status"};
        DefaultTableModel tblModel = new DefaultTableModel(columnNames, 0);

        while (rs.next()) {
            String name = rs.getString("name");
            String memberId = rs.getString("member_id");
            String phoneNo = rs.getString("phone_no");
            String age = rs.getString("age"); 
            String gender = rs.getString("gender");
            String email = rs.getString("email");
            String address = rs.getString("address");
            String joiningDate = rs.getString("joining_date");
            String expirationDate = rs.getString("expiration_date");
            String sportName = rs.getString("sport_name");
            String paymentStatus = rs.getString("payment_status");

            String[] toData = {name, memberId, phoneNo, age, gender, email, address, joiningDate, expirationDate, sportName, paymentStatus};
            tblModel.addRow(toData);
        }

        homeTable.setModel(tblModel);

    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    private void btn_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseClicked
       
        
    }//GEN-LAST:event_btn_updateMouseClicked

    private void homeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTableMouseClicked
   
        
    }//GEN-LAST:event_homeTableMouseClicked

    private void btn_SearchHomeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchHomeTableActionPerformed
         String searchTerm =SeachHomeTable.getText();
    
    if (searchTerm != null) {
        searchByName(searchTerm);
    }
    }//GEN-LAST:event_btn_SearchHomeTableActionPerformed
 
private void searchByName(String searchTerm ) {
    DefaultTableModel model = (DefaultTableModel) homeTable.getModel();
    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
    homeTable.setRowSorter(sorter);

    RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + searchTerm);  

    sorter.setRowFilter(rowFilter);
}
  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SeachHomeTable;
    private javax.swing.JButton btn_SearchHomeTable;
    private javax.swing.JButton btn_update;
    private javax.swing.JTable homeTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
