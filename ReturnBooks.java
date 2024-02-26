/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lms;
//import java.text.SimpleDateFormat;
import java.sql.*;
//import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import java.text.SimpleDateFormat;
//import com.toedter.calendar.JDateChooser;

/**
 *
 * @author aslam
 */
public class ReturnBooks extends javax.swing.JFrame {

    /**
     * Creates new form ReturnBooks
     */
    public ReturnBooks() {
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

        Student_Id = new javax.swing.JLabel();
        Book_Id = new javax.swing.JLabel();
        Issue_Date = new javax.swing.JLabel();
        Due_Date = new javax.swing.JLabel();
        vStudent_Id = new javax.swing.JTextField();
        vBook_Id = new javax.swing.JTextField();
        vSerch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        vIssue_Date = new javax.swing.JTextField();
        vDue_Date = new javax.swing.JTextField();
        vReturn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Student_Id.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        Student_Id.setText("Student Id:");
        getContentPane().add(Student_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        Book_Id.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        Book_Id.setText("Book Id:");
        getContentPane().add(Book_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 65, 20));

        Issue_Date.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        Issue_Date.setText("Issue Date:");
        getContentPane().add(Issue_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 80, -1));

        Due_Date.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        Due_Date.setText("Due Date:");
        getContentPane().add(Due_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 80, -1));

        vStudent_Id.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(vStudent_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 170, -1));

        vBook_Id.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(vBook_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 170, -1));

        vSerch.setBackground(new java.awt.Color(0, 102, 102));
        vSerch.setFont(new java.awt.Font("Nimbus Roman", 1, 15)); // NOI18N
        vSerch.setForeground(new java.awt.Color(255, 255, 255));
        vSerch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/search.png"))); // NOI18N
        vSerch.setText("Serch");
        vSerch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vSerchActionPerformed(evt);
            }
        });
        getContentPane().add(vSerch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 110, 40));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Nimbus Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/back (1).png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 130, 40));

        vIssue_Date.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(vIssue_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 170, -1));

        vDue_Date.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(vDue_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 170, -1));

        vReturn.setBackground(new java.awt.Color(0, 102, 102));
        vReturn.setFont(new java.awt.Font("Nimbus Roman", 1, 14)); // NOI18N
        vReturn.setForeground(new java.awt.Color(255, 255, 255));
        vReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/return (2).png"))); // NOI18N
        vReturn.setText("Return");
        vReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vReturnActionPerformed(evt);
            }
        });
        getContentPane().add(vReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 120, 40));

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("RETURN BOOK DETAILS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 300, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/123456.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vSerchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vSerchActionPerformed
        int Book_Id=Integer.parseInt(vBook_Id.getText());
        int Student_Id=Integer.parseInt(vStudent_Id.getText());
        try{
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM IssuedBooks where Book_id='"+Book_Id+"' and Student_Id='"+Student_Id+"'");
            if(rs.next()){
                vIssue_Date.setText(rs.getString(3));
                vDue_Date.setText(rs.getString(4));
                vBook_Id.setEditable(false);
                vStudent_Id.setEditable(false);
                
            }else{
                JOptionPane.showMessageDialog(null, "Book is not issued to this student");
                setVisible(false);
                new ReturnBooks().setVisible(false);
            }       
            
        }catch(Exception ex){
            System.out.println("Error in return book code");
        }
    }//GEN-LAST:event_vSerchActionPerformed

    private void vReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vReturnActionPerformed
        int Book_Id=Integer.parseInt(vBook_Id.getText());
        int Student_Id=Integer.parseInt(vStudent_Id.getText());
        try{
            Statement st=con.createStatement();
            st.executeUpdate("UPDATE IssuedBooks SET Return_book='yes' where Student_Id='"+Student_Id+"' and Book_id='"+Book_Id+"'");
            JOptionPane.showMessageDialog(null, "Book succesfully returned");
            setVisible(false);
            new ReturnBooks().setVisible(false);
      
            
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Error in return book code");
        }
    }//GEN-LAST:event_vReturnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
//        Home1 hm=new Home1();
//        hm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Book_Id;
    private javax.swing.JLabel Due_Date;
    private javax.swing.JLabel Issue_Date;
    private javax.swing.JLabel Student_Id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField vBook_Id;
    private javax.swing.JTextField vDue_Date;
    private javax.swing.JTextField vIssue_Date;
    private javax.swing.JButton vReturn;
    private javax.swing.JButton vSerch;
    private javax.swing.JTextField vStudent_Id;
    // End of variables declaration//GEN-END:variables
}
