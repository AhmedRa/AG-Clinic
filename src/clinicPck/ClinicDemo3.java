/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clinicPck;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author AhmedRagab
 */
public class ClinicDemo3 extends javax.swing.JFrame {

   Statement st;
    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    SimpleDateFormat format1 = new SimpleDateFormat("MMM-d-yyyy");
    java.sql.Date date;
    
    public ClinicDemo3() {
        initComponents();
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        
        String unicode = "?useUnicode=yes&characterEncoding=UTF-8";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Clinic" + unicode, "root", "root");
            con.setAutoCommit(true);
            st = con.createStatement();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Untitled-10.png"))); // NOI18N
        jPanel1.add(jButton1);
        jButton1.setBounds(770, 70, 40, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("بحث عن مريض");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(559, 70, 200, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "رقم_التسجيل", "اسم_المريض", "السن", "العنوان", "رقم_التليفون", "تاريخ_الحجز", "وقت_الحجز"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 440, 900, 160);

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 50, 90, 40);

        jLabel2.setText("رقم التسجيل :-");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(810, 130, 80, 14);

        jLabel3.setText("اسم المريض :-");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(810, 170, 80, 14);

        jLabel4.setText("السن :-");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(840, 210, 50, 14);

        jLabel5.setText("العنوان :-");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(830, 250, 50, 14);

        jLabel6.setText("رقم التليفون :-");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(810, 290, 70, 14);

        jTextField2.setEditable(false);
        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(730, 120, 40, 30);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(600, 160, 170, 30);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(600, 240, 170, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(730, 200, 40, 30);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(599, 280, 170, 30);

        jButton3.setBackground(new java.awt.Color(102, 0, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(570, 393, 90, 30);

        jButton4.setBackground(new java.awt.Color(102, 0, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(390, 390, 90, 30);

        jButton5.setBackground(new java.awt.Color(102, 0, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Show Info");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(740, 393, 110, 30);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(464, 164, 120, 20);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(624, 204, 90, 20);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(474, 244, 110, 20);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(470, 284, 110, 20);

        jButton6.setBackground(new java.awt.Color(102, 0, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("P-Info");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(20, 393, 90, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DCMH Patient Room (2) 900x600.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ClinicDemo c1 = new ClinicDemo();
        this.setVisible(false);
        c1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        try {

            rs = st.executeQuery("select patient_Id as رقم_التسجيل,patient_Name as اسم_المريض,patient_Age as السن,patient_Address as العنوان,patient_Telephone as رقم_التليفون,reserve_Date as تاريخ_الحجز,reserve_Time as وقت_الحجز from patient_reservation WHERE patient_Name LIKE " + "'"  + jTextField1.getText() + "%" + "'" + "");

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jTextField6.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(!(jTextField2.isVisible())){
            JOptionPane.showMessageDialog(rootPane, "click show");
        }else if (jTextField2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "اختر من الجدول اولا");
        } else if (jTextField3.getText().equals("")) {
            jLabel7.setText("ادخل اسم المريض");

        } else if (jTextField4.getText().equals("")) {
            jLabel8.setText("ادخل السن");

        } else if (jTextField5.getText().equals("")) {
            jLabel9.setText("ادخل العنوان");
        } else if (jTextField6.getText().equals("")) {
            jLabel10.setText("ادخل رقم التليفون");
        } else {

            DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();

            model1.setValueAt(jTextField2.getText(), jTable1.getSelectedRow(), 0);
            model1.setValueAt(jTextField3.getText(), jTable1.getSelectedRow(), 1);
            model1.setValueAt(jTextField4.getText(), jTable1.getSelectedRow(), 2);
            model1.setValueAt(jTextField5.getText(), jTable1.getSelectedRow(), 3);
            model1.setValueAt(jTextField6.getText(), jTable1.getSelectedRow(), 4);

            try {

                st.executeUpdate("UPDATE patient_reservation SET patient_Id " + "=" + jTextField2.getText() + "," + "patient_Name" + "=" + "'" + jTextField3.getText() + "'" + "," + "patient_Age" + "=" + jTextField4.getText() + "," + "patient_Address" + "=" + "'" + jTextField5.getText() + "'" + "," + "patient_Telephone" + "=" + "'" + jTextField6.getText() + "'" + " WHERE patient_Id " + "=" + jTextField2.getText() + "");

                JOptionPane.showMessageDialog(null, "تم التعديل");

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            jTextField2.setText(null);
            jTextField3.setText(null);
            jTextField4.setText(null);
            jTextField5.setText(null);
            jTextField6.setText(null);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try {
            int row = jTable1.getSelectedRow();
            String Table_click = (jTable1.getModel().getValueAt(row, 0).toString());
            String sql = "select patient_Id,patient_Name,patient_Age,patient_Address,patient_Telephone from patient_reservation WHERE patient_Id ='" + Table_click + "' ";
            //rs = st.executeQuery("select patient_Id,patient_Name,patient_Age,patient_Address,patient_Telephone from patient_reservation WHERE patient_Name LIKE " + "'" + "%" + jTextField5.getText() + "%" + "'" + "");
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                String add1 = rs.getString("patient_Id");
                jTextField2.setText(add1);
                String add2 = rs.getString("patient_Name");
                jTextField3.setText(add2);
                String add3 = rs.getString("patient_Age");
                jTextField4.setText(add3);
                String add4 = rs.getString("patient_Address");
                jTextField5.setText(add4);
                String add5 = rs.getString("patient_Telephone");
                jTextField6.setText(add5);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (jTextField2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "اختر من الجدول اولا");
        } else {

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(jTable1.getSelectedRow());
            try {
                //"select `المتأخرات`, `تاريخ الانتهاء`, `تاريخ البدء`, `نوع الاشتراك`, `السن`, `الوزن`,`موبايل`,`العنوان`,`الاسم`"
                st.executeUpdate(" DELETE FROM patient_reservation WHERE patient_Id" + "=" + jTextField2.getText() + "");

                JOptionPane.showMessageDialog(null, "تم المسح");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());

            }
            jTextField2.setText(null);
            jTextField3.setText(null);
            jTextField4.setText(null);
            jTextField5.setText(null);
            jTextField6.setText(null);

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         if (jTextField2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "اختر من الجدول اولا");
        } else {
        try {

            rs = st.executeQuery("select treat_Date as تاريخ_الكشف,revisit_Date as تاريخ_اعادة_الكشف,treatment as العلاج,note as ملاحظات from patient_info WHERE patient_Info_Fk" + "=" + jTextField2.getText() + "");

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
         }
        
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(ClinicDemo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClinicDemo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClinicDemo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClinicDemo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClinicDemo3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
