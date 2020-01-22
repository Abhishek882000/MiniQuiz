/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineQuizProject;

import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Abhishek
 */
public class JavaProgramming extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement preStmt;
    ResultSet rs;
    String correctAns = "";
    public static int counterMarks = 0;
       
    public void createConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "abhishek@8+8=16");
            preStmt = conn.prepareStatement("select * from adminquestion");
            rs = preStmt.executeQuery();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public JavaProgramming() {
        initComponents();
        createConn();
        nextQuestion();
         setResizable(false);
        setLocationRelativeTo(this);
    }

    public void nextQuestion() {
        try {

            if (rs.next()) {
                jLabel2_no.setText(rs.getString(1));
                jTextArea1.setText(rs.getString(2));
                jLabel10_option1.setText(rs.getString(3));
                jLabel11_option2.setText(rs.getString(4));
                jLabel12_option3.setText(rs.getString(5));
                jLabel9_option4.setText(rs.getString(6));
                correctAns = rs.getString(7);
            } else {
                System.out.println("Data Not Found");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void previousQuestion() {
        try {

            if (rs.previous()) {
                jLabel2_no.setText(rs.getString(1));
                jTextArea1.setText(rs.getString(2));
                jLabel10_option1.setText(rs.getString(3));
                jLabel11_option2.setText(rs.getString(4));
                jLabel12_option3.setText(rs.getString(5));
                jLabel9_option4.setText(rs.getString(6));
                correctAns = rs.getString(7);
            } else {
                System.out.println("Data Not Found");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1_option4 = new javax.swing.JRadioButton();
        jRadioButton_option1 = new javax.swing.JRadioButton();
        jRadioButton3_option2 = new javax.swing.JRadioButton();
        jRadioButton4_option3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9_option4 = new javax.swing.JLabel();
        jLabel10_option1 = new javax.swing.JLabel();
        jLabel11_option2 = new javax.swing.JLabel();
        jLabel12_option3 = new javax.swing.JLabel();
        btn_next = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2_no = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_submit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_previous = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C Questions");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 60, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("C TEST");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 110, 20));

        buttonGroup1.add(jRadioButton1_option4);
        jRadioButton1_option4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_option4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1_option4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        buttonGroup1.add(jRadioButton_option1);
        jRadioButton_option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_option1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton_option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        buttonGroup1.add(jRadioButton3_option2);
        jRadioButton3_option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3_option2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3_option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        buttonGroup1.add(jRadioButton4_option3);
        jRadioButton4_option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4_option3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4_option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("D");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 20, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("A");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 20, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("B");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 20, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("C");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 20, 20));

        jLabel9_option4.setBackground(new java.awt.Color(245, 60, 38));
        jLabel9_option4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9_option4.setForeground(new java.awt.Color(204, 204, 0));
        jPanel1.add(jLabel9_option4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 320, 20));

        jLabel10_option1.setBackground(new java.awt.Color(245, 60, 38));
        jLabel10_option1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10_option1.setForeground(new java.awt.Color(204, 204, 0));
        jPanel1.add(jLabel10_option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 330, 20));

        jLabel11_option2.setBackground(new java.awt.Color(245, 60, 38));
        jLabel11_option2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11_option2.setForeground(new java.awt.Color(204, 204, 0));
        jPanel1.add(jLabel11_option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 330, 20));

        jLabel12_option3.setBackground(new java.awt.Color(245, 60, 38));
        jLabel12_option3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12_option3.setForeground(new java.awt.Color(204, 204, 0));
        jPanel1.add(jLabel12_option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 340, 20));

        btn_next.setBackground(new java.awt.Color(63, 70, 71));
        btn_next.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setText("NEXT");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        jPanel1.add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Q");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 40, 30));

        jLabel2_no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2_no.setText("1");
        jPanel1.add(jLabel2_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 20, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 710, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 710, 10));

        btn_submit.setBackground(new java.awt.Color(63, 70, 71));
        btn_submit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(255, 255, 255));
        btn_submit.setText("SUBMIT");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 150, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 610, 190));

        btn_previous.setBackground(new java.awt.Color(63, 70, 71));
        btn_previous.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_previous.setForeground(new java.awt.Color(255, 255, 255));
        btn_previous.setText("PREVIOUS");
        btn_previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previousActionPerformed(evt);
            }
        });
        jPanel1.add(btn_previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1_option4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_option4ActionPerformed

        System.out.println(correctAns.equals(jLabel9_option4.getText()));

        if (correctAns.equals(jLabel9_option4.getText())) {
            counterMarks++;
        }


    }//GEN-LAST:event_jRadioButton1_option4ActionPerformed

    private void jRadioButton_option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_option1ActionPerformed

        
        System.out.println(correctAns.equals(jLabel10_option1.getText()));

            if (correctAns.equals(jLabel10_option1.getText())) {
            counterMarks++;

        }

    }//GEN-LAST:event_jRadioButton_option1ActionPerformed

    private void jRadioButton3_option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3_option2ActionPerformed

        System.out.println(correctAns.equals(jLabel11_option2.getText()));
        if (correctAns.equals(jLabel11_option2.getText())) {
            counterMarks++;
        }

    }//GEN-LAST:event_jRadioButton3_option2ActionPerformed

    private void jRadioButton4_option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4_option3ActionPerformed
     
        System.out.println(correctAns.equals(jLabel12_option3.getText()));
        if (correctAns.equals(jLabel12_option3.getText())) {
            counterMarks++;
        }

    }//GEN-LAST:event_jRadioButton4_option3ActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed

        try {
            nextQuestion();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        Result r = new Result();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_previousActionPerformed

        try {
            previousQuestion();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_previousActionPerformed

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
            java.util.logging.Logger.getLogger(JavaProgramming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaProgramming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaProgramming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaProgramming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaProgramming().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_previous;
    private javax.swing.JButton btn_submit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10_option1;
    private javax.swing.JLabel jLabel11_option2;
    private javax.swing.JLabel jLabel12_option3;
    private javax.swing.JLabel jLabel2_no;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9_option4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1_option4;
    private javax.swing.JRadioButton jRadioButton3_option2;
    private javax.swing.JRadioButton jRadioButton4_option3;
    private javax.swing.JRadioButton jRadioButton_option1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
