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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class update extends javax.swing.JFrame {
  Connection  con;
          ArrayList<Integer>sport_id=new ArrayList<>();
    
    public update() {
        
        initComponents();
           try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clup", "root", "abdosaidmysql");
    } catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
           fillcombox();
    }
     public void setValues(String memberId,String memberName,String email, String address ,String phone,
                            String dateOfBirth, String sportType,
                           String gender, String joiningDate, String expirationDate, String paymentStatus) {
        btn_member_id.setText(memberId);
        btn_name.setText(memberName);
        this.btn_email.setText(email);
        this.btn_address.setText(address);
        this.btn_phone.setText(phone);
        String day = null;

        
        cbox_sports.setSelectedItem(sportType);
 
        if (gender.equals("Male")) {
            rb_male.setSelected(true);
        } else {
            jRadioButton2.setSelected(true);
        }

        this.btn_joining_date.setText(joiningDate);
        this.btn_expiration_date.setText(expirationDate);
        this.btn_pay.setText(paymentStatus);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        btn_member_id = new javax.swing.JTextField();
        btn_name = new javax.swing.JTextField();
        btn_address = new javax.swing.JTextField();
        btn_phone = new javax.swing.JTextField();
        btn_email = new javax.swing.JTextField();
        btn_joining_date = new javax.swing.JTextField();
        btn_expiration_date = new javax.swing.JTextField();
        btn_pay = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        update_ok = new javax.swing.JButton();
        cbox_sports = new javax.swing.JComboBox<>();
        rb_male = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        update_ok1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(243, 207, 171));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setText("Member_ID");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 37, -1, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setText("Name");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 85, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setText("Email");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 133, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setText("Adderss");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 181, -1, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.setText("phone_no");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 229, -1, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField7.setText("Sport_type");
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 278, -1, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.setText("Gender");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 320, -1, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.setText("Expiration Date");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 416, -1, -1));

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField10.setText("Joining Date");
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 364, -1, -1));

        btn_member_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_member_idActionPerformed(evt);
            }
        });
        getContentPane().add(btn_member_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 34, 235, 30));
        getContentPane().add(btn_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 82, 235, 30));
        getContentPane().add(btn_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 178, 235, 30));
        getContentPane().add(btn_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 226, 235, 30));
        getContentPane().add(btn_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 130, 235, 30));
        getContentPane().add(btn_joining_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 361, 235, 30));
        getContentPane().add(btn_expiration_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 409, 235, 30));
        getContentPane().add(btn_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 451, 235, 30));

        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField22.setText("Payment_Status");
        getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 454, -1, -1));

        update_ok.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        update_ok.setText("OK");
        update_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_okActionPerformed(evt);
            }
        });
        getContentPane().add(update_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 588, -1, -1));

        cbox_sports.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbox_sports.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbox_sports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_sportsActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_sports, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 274, 191, -1));

        buttonGroup1.add(rb_male);
        rb_male.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_male.setText("Male");
        getContentPane().add(rb_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 321, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 321, -1, -1));

        update_ok1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        update_ok1.setText("Cancel");
        update_ok1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_ok1ActionPerformed(evt);
            }
        });
        getContentPane().add(update_ok1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 588, 120, -1));

        jPanel1.setBackground(new java.awt.Color(243, 207, 171));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
      
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void update_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_okActionPerformed
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
            int selectedSportIndex = cbox_sports.getSelectedIndex();
            int sportId = 0;

            if (!sport_id.isEmpty()) {
                if (selectedSportIndex >= 0 && selectedSportIndex < sport_id.size()) {
                    sportId = sport_id.get(selectedSportIndex);
                } else {
                    JOptionPane.showMessageDialog(this, "Please select a valid sport");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "No sports available");
                return;
            }

            String gender = (rb_male.isSelected()) ? "Male" : "Female";

            int option = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to update?",
                    "Confirm Update",
                    JOptionPane.OK_CANCEL_OPTION
            );

            if (option == JOptionPane.OK_OPTION) {
                 
                PreparedStatement stmt = con.prepareStatement(
                        "UPDATE members SET name=?, email=?, address=?, phone_no=?, sport_id=?, gender=?, joining_date=?, expiration_date=?,payment_status=? WHERE member_id=?"
                );
                stmt.setString(1, member_name);
                stmt.setString(2, member_email);
                stmt.setString(3, member_address);
                stmt.setString(4, member_phone);
                stmt.setInt(5, sportId);
                stmt.setString(6, gender);
                stmt.setString(7, btn_joining_date.getText());
                stmt.setString(8, btn_expiration_date.getText());
               stmt.setString(9, btn_pay.getText());

                stmt.setString(10, member_id);

                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(
                            this,
                            "Updated successfully",
                            "OK",
                            JOptionPane.INFORMATION_MESSAGE
                  
                            
                    );
                        Home m = new Home();
                          this.hide();
                          m.setVisible(true);   
                } else {
                    JOptionPane.showMessageDialog(
                            this,
                            "Member ID not found",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
            
        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(
                    this,
                    "Error occurred: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    }//GEN-LAST:event_update_okActionPerformed

    private void btn_member_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_member_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_member_idActionPerformed

    private void update_ok1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_ok1ActionPerformed
        Home m = new Home();
         this.hide();
      m.setVisible(true);  
    }//GEN-LAST:event_update_ok1ActionPerformed

    private void cbox_sportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_sportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_sportsActionPerformed

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btn_address;
    private javax.swing.JTextField btn_email;
    private javax.swing.JTextField btn_expiration_date;
    private javax.swing.JTextField btn_joining_date;
    private javax.swing.JTextField btn_member_id;
    private javax.swing.JTextField btn_name;
    private javax.swing.JTextField btn_pay;
    private javax.swing.JTextField btn_phone;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbox_sports;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JRadioButton rb_male;
    private javax.swing.JButton update_ok;
    private javax.swing.JButton update_ok1;
    // End of variables declaration//GEN-END:variables
}
