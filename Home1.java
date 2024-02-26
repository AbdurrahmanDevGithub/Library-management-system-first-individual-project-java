/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lms;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author aslam
 */
public class Home1 extends javax.swing.JFrame {

    /**
     * Creates new form Home1
     */
    public Home1() {
        initComponents();
        setLocationRelativeTo(null);
        Connect();
    }

    Connection con;
    PreparedStatement ps1;
    PreparedStatement ps2;
    
    public void Connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Students1","root","1234");
        
    }catch(Exception ex){
            System.out.println("Error in connection");
    }
        
}
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vNewStudent = new javax.swing.JButton();
        vAddBook = new javax.swing.JButton();
        vStatics = new javax.swing.JButton();
        vEdit_Students = new javax.swing.JButton();
        vLogout = new javax.swing.JButton();
        vIssued_Books = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vNewStudent.setBackground(new java.awt.Color(0, 102, 102));
        vNewStudent.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vNewStudent.setForeground(new java.awt.Color(255, 255, 255));
        vNewStudent.setIcon(new javax.swing.ImageIcon("D:\\xxx\\icons8-add-user-group-man-man-skin-type-7-32.png")); // NOI18N
        vNewStudent.setText("ADD STUDENTS");
        vNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vNewStudentActionPerformed(evt);
            }
        });
        getContentPane().add(vNewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 50));

        vAddBook.setBackground(new java.awt.Color(0, 102, 102));
        vAddBook.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vAddBook.setForeground(new java.awt.Color(255, 255, 255));
        vAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/icons8-add-book-32.png"))); // NOI18N
        vAddBook.setText("ADD BOOKS");
        vAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vAddBookActionPerformed(evt);
            }
        });
        getContentPane().add(vAddBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 180, 50));

        vStatics.setBackground(new java.awt.Color(0, 102, 102));
        vStatics.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vStatics.setForeground(new java.awt.Color(255, 255, 255));
        vStatics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/Statics.png"))); // NOI18N
        vStatics.setText("STATICS");
        vStatics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vStaticsActionPerformed(evt);
            }
        });
        getContentPane().add(vStatics, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 190, 50));

        vEdit_Students.setBackground(new java.awt.Color(0, 102, 102));
        vEdit_Students.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vEdit_Students.setForeground(new java.awt.Color(255, 255, 255));
        vEdit_Students.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/icons8-edit-profile-32.png"))); // NOI18N
        vEdit_Students.setText("EDIT STUDENTS");
        vEdit_Students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vEdit_StudentsActionPerformed(evt);
            }
        });
        getContentPane().add(vEdit_Students, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 190, 50));

        vLogout.setBackground(new java.awt.Color(0, 102, 102));
        vLogout.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vLogout.setForeground(new java.awt.Color(255, 255, 255));
        vLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/logout.png"))); // NOI18N
        vLogout.setText("LOGOUT");
        vLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(vLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 650, 190, 50));

        vIssued_Books.setBackground(new java.awt.Color(0, 102, 102));
        vIssued_Books.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vIssued_Books.setForeground(new java.awt.Color(255, 255, 255));
        vIssued_Books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/icons8-borrow-book-32.png"))); // NOI18N
        vIssued_Books.setText("ISSUE BOOKS");
        vIssued_Books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vIssued_BooksActionPerformed(evt);
            }
        });
        getContentPane().add(vIssued_Books, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 180, 50));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/icons8-return-book-32.png"))); // NOI18N
        jButton1.setText("RETURN BOOKS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, 50));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/icons8-edit-property-32.png"))); // NOI18N
        jButton2.setText("EDIT BOOKS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 170, 50));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/x-button.png"))); // NOI18N
        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 710, 190, 50));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/feb-23-plants-cal-1366x768.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vNewStudentActionPerformed
        //setVisible(false);
        new Student1().setVisible(true);
    }//GEN-LAST:event_vNewStudentActionPerformed

    private void vAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vAddBookActionPerformed
        //setVisible(false);
        new AddBooks().setVisible(true);
    }//GEN-LAST:event_vAddBookActionPerformed

    private void vEdit_StudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vEdit_StudentsActionPerformed
        //setVisible(false);
        new EditStudents().setVisible(true);
    }//GEN-LAST:event_vEdit_StudentsActionPerformed

    private void vIssued_BooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vIssued_BooksActionPerformed
       new IssuedBooks().setVisible(true);
    }//GEN-LAST:event_vIssued_BooksActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ReturnBooks().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void vLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vLogoutActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Do you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
        // Perform logout action here
        // For example, you can close the current frame and open a new one
        new LoginPage1().setVisible(true);
        this.dispose(); // Close the current frame
        }
    }//GEN-LAST:event_vLogoutActionPerformed

    private void vStaticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vStaticsActionPerformed
        new Statics().setVisible(true);
    }//GEN-LAST:event_vStaticsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new EditBooks().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
            System.exit(0);
    }
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
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton vAddBook;
    private javax.swing.JButton vEdit_Students;
    private javax.swing.JButton vIssued_Books;
    private javax.swing.JButton vLogout;
    private javax.swing.JButton vNewStudent;
    private javax.swing.JButton vStatics;
    // End of variables declaration//GEN-END:variables
}
