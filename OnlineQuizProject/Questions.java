/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineQuizProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek
 */
public class Questions extends javax.swing.JFrame {

    Connection conn;

    public void createConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "abhishek@8+8=16");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Creates new form Questions
     */
    public Questions() {
        initComponents();
        setTitle("Admin Question");
        setResizable(false);
        setLocationRelativeTo(this);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtextarea_question = new javax.swing.JTextArea();
        jRadioButton1_option1 = new javax.swing.JRadioButton();
        jRadioButton2_option2 = new javax.swing.JRadioButton();
        jRadioButton3_option3 = new javax.swing.JRadioButton();
        jRadioButton4_option4 = new javax.swing.JRadioButton();
        jTextField1_questionNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_option4 = new javax.swing.JTextField();
        jTextField_option1 = new javax.swing.JTextField();
        jTextField_option2 = new javax.swing.JTextField();
        jTextField_option3 = new javax.swing.JTextField();
        jButton1_save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1_correctoption = new javax.swing.JTextField();
        jButton1_search = new javax.swing.JButton();
        jButton1_delete = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 60, 38));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("C QUESTIONS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 190, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 700, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Q");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 40, 30));

        Jtextarea_question.setColumns(20);
        Jtextarea_question.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        Jtextarea_question.setRows(5);
        jScrollPane1.setViewportView(Jtextarea_question);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 570, 190));

        buttonGroup1.add(jRadioButton1_option1);
        jRadioButton1_option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_option1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1_option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        buttonGroup1.add(jRadioButton2_option2);
        jPanel1.add(jRadioButton2_option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        buttonGroup1.add(jRadioButton3_option3);
        jPanel1.add(jRadioButton3_option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        buttonGroup1.add(jRadioButton4_option4);
        jPanel1.add(jRadioButton4_option4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jTextField1_questionNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1_questionNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_questionNumberActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_questionNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 30, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("D");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 50, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("A");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 50, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("B");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 50, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("C");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 50, 20));

        jTextField_option4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField_option4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 370, 30));

        jTextField_option1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField_option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 370, 30));

        jTextField_option2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField_option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 370, 30));

        jTextField_option3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField_option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 370, 30));

        jButton1_save.setBackground(new java.awt.Color(63, 70, 71));
        jButton1_save.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1_save.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_save.setText("SAVE");
        jButton1_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_saveActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 120, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CORRECT ANSWER");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, 30));

        jTextField1_correctoption.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(jTextField1_correctoption, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 210, 30));

        jButton1_search.setBackground(new java.awt.Color(63, 70, 71));
        jButton1_search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1_search.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_search.setText("SEARCH");
        jButton1_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_searchActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 120, 40));

        jButton1_delete.setBackground(new java.awt.Color(63, 70, 71));
        jButton1_delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1_delete.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_delete.setText("DELETE");
        jButton1_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 120, 40));

        btn_logout.setBackground(new java.awt.Color(63, 70, 71));
        btn_logout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("LOGOUT");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 10, -1, 40));

        btn_back.setBackground(new java.awt.Color(63, 70, 71));
        btn_back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_questionNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_questionNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_questionNumberActionPerformed

    private void jButton1_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_saveActionPerformed
        String number, question, option1, option2, option3, option4, correctoption;
        question = Jtextarea_question.getText();
        option1 = jTextField_option1.getText();
        option2 = jTextField_option2.getText();
        option3 = jTextField_option3.getText();
        option4 = jTextField_option4.getText();
        correctoption = jTextField1_correctoption.getText();
        if (question.length() == 0 || option1.length() == 0 || option2.length() == 0 || option3.length() == 0 || option4.length() == 0 || correctoption.length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Enter All Values", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                createConn();
                PreparedStatement preStmt
                        = conn.prepareStatement("insert into adminquestion values(?,?,?,?,?,?,?)");
                preStmt.setInt(1, 0);
                preStmt.setString(2, question);
                preStmt.setString(3, option1);
                preStmt.setString(4, option2);
                preStmt.setString(5, option3);
                preStmt.setString(6, option4);
                preStmt.setString(7, correctoption);
                int num = preStmt.executeUpdate();
                if (num > 0) {
                    JOptionPane.showMessageDialog(rootPane, "Record Inserted");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Record Not Inserted");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            jTextField1_questionNumber.setText(null);
            Jtextarea_question.setText(null);
            jTextField1_correctoption.setText(null);
            jTextField_option1.setText(null);
            jTextField_option2.setText(null);
            jTextField_option3.setText(null);
            jTextField_option4.setText(null);

        }


    }//GEN-LAST:event_jButton1_saveActionPerformed

    private void jButton1_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_searchActionPerformed

        String number = jTextField1_questionNumber.getText();
        int flag = 0;
        try {
            createConn();
            PreparedStatement prestmt2 = conn.prepareStatement("select * from adminquestion where number = ?");
            prestmt2.setString(1, number);
            ResultSet res = prestmt2.executeQuery();
            while (res.next()) {
                flag = 1;
                String Question = res.getString(2);
                String option1 = res.getString(3);
                String option2 = res.getString(4);
                String option3 = res.getString(5);
                String option4 = res.getString(6);
                String correctoption = res.getString(7);
                Jtextarea_question.setText(Question);
                jTextField_option1.setText(option1);
                jTextField_option2.setText(option2);
                jTextField_option3.setText(option3);
                jTextField_option4.setText(option4);
                jTextField1_correctoption.setText(correctoption);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (flag == 0) {
            JOptionPane.showMessageDialog(rootPane, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1_searchActionPerformed

    private void jButton1_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_deleteActionPerformed
        String number = jTextField1_questionNumber.getText();
        int flag = 0;
        try {
            createConn();
            PreparedStatement prestmt3 = conn.prepareStatement("delete from adminquestion where number = ? ");
            prestmt3.setString(1, number);
            flag = prestmt3.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        if (flag != 0) {
            jTextField1_questionNumber.setText(null);
            Jtextarea_question.setText(null);
            jTextField_option1.setText(null);
            jTextField_option2.setText(null);
            jTextField_option3.setText(null);
            jTextField_option4.setText(null);
            jTextField1_correctoption.setText(null);
        }
        if (flag == 0) {
            JOptionPane.showMessageDialog(rootPane, "Record Not Deleted", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1_deleteActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        UniqueLogin1 uq1 = new UniqueLogin1();
        uq1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        AdminSection ac = new AdminSection();
        ac.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

    private void jRadioButton1_option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_option1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1_option1ActionPerformed

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
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Jtextarea_question;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_logout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1_delete;
    private javax.swing.JButton jButton1_save;
    private javax.swing.JButton jButton1_search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1_option1;
    private javax.swing.JRadioButton jRadioButton2_option2;
    private javax.swing.JRadioButton jRadioButton3_option3;
    private javax.swing.JRadioButton jRadioButton4_option4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1_correctoption;
    private javax.swing.JTextField jTextField1_questionNumber;
    private javax.swing.JTextField jTextField_option1;
    private javax.swing.JTextField jTextField_option2;
    private javax.swing.JTextField jTextField_option3;
    private javax.swing.JTextField jTextField_option4;
    // End of variables declaration//GEN-END:variables
}
