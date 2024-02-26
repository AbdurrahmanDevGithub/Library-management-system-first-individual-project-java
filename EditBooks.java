/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lms;

import java.sql.*;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import com.toedter.calendar.JDateChooser;

/**
 *
 * @author aslam
 */
public class EditBooks extends javax.swing.JFrame {

    /**
     * Creates new form EditBooks
     */
    public EditBooks() {
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

        Book_Id = new javax.swing.JLabel();
        Book_Title = new javax.swing.JLabel();
        Author = new javax.swing.JLabel();
        Issued_Date = new javax.swing.JLabel();
        vBook_Id = new javax.swing.JTextField();
        vBook_Title = new javax.swing.JTextField();
        vAuthor = new javax.swing.JTextField();
        Price = new javax.swing.JLabel();
        vPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        vIssued_Date = new com.toedter.calendar.JDateChooser();
        vDelete = new javax.swing.JButton();
        vEdit = new javax.swing.JButton();
        vBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Book_Id.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Book_Id.setText("Book Id:");
        getContentPane().add(Book_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        Book_Title.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Book_Title.setText("Book Title:");
        getContentPane().add(Book_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        Author.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Author.setText("Author:");
        getContentPane().add(Author, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        Issued_Date.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Issued_Date.setText("Issued Date:");
        getContentPane().add(Issued_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        vBook_Id.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(vBook_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 200, -1));

        vBook_Title.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(vBook_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 200, -1));

        vAuthor.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(vAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 200, -1));

        Price.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        Price.setText("Price:");
        getContentPane().add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        vPrice.setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().add(vPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 200, -1));

        jLabel6.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("EDIT BOOK DETAILS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 264, 40));
        getContentPane().add(vIssued_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 200, -1));

        vDelete.setBackground(new java.awt.Color(0, 102, 102));
        vDelete.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vDelete.setForeground(new java.awt.Color(255, 255, 255));
        vDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/icons8-delete-32.png"))); // NOI18N
        vDelete.setText("Delete");
        vDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(vDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 120, 40));

        vEdit.setBackground(new java.awt.Color(0, 102, 102));
        vEdit.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vEdit.setForeground(new java.awt.Color(255, 255, 255));
        vEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/icons8-edit-property-32.png"))); // NOI18N
        vEdit.setText("Edit");
        vEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vEditActionPerformed(evt);
            }
        });
        getContentPane().add(vEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 120, 40));

        vBack.setBackground(new java.awt.Color(0, 102, 102));
        vBack.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        vBack.setForeground(new java.awt.Color(255, 255, 255));
        vBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/back (1).png"))); // NOI18N
        vBack.setText("Back");
        vBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vBackActionPerformed(evt);
            }
        });
        getContentPane().add(vBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/123456.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vEditActionPerformed
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        try{
        String Book_Id=vBook_Id.getText();
        String Book_Title=vBook_Title.getText();
        String Author=vAuthor.getText();
        String Issued_Date=dFormat.format(vIssued_Date.getDate());
        int Price=Integer.parseInt(vPrice.getText());
        
 
        ps2=con.prepareStatement("update BookDetails set Book_Title=?,Author=?,Issued_Date=?,Price=? where Book_Id=?");
        ps2.setString(1,Book_Title);
        ps2.setString(2,Author);
        ps2.setString(3, Issued_Date);
        ps2.setInt(4,Price);
        ps2.setString(5,Book_Id);
        
        int Status=ps2.executeUpdate();
        if(Status==1){
            JOptionPane.showMessageDialog(this, "Succusfully updated");
            vBook_Id.setText("");
            vBook_Title.setText("");
            vAuthor.setText("");
            vPrice.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "Can't update");
        }
        
        }catch(Exception Ex){
            Ex.printStackTrace();
            System.out.println("Error in book update code");
        }
    }//GEN-LAST:event_vEditActionPerformed

    private void vDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vDeleteActionPerformed
        try{
        String Book_Id=vBook_Id.getText();
        
        ps2=con.prepareStatement("DELETE FROM BookDetails WHERE Book_Id=?");
        ps2.setString(1, Book_Id);
        int Status = ps2.executeUpdate();
        
        if(Status == 1){
            JOptionPane.showMessageDialog(this, "Succesfully deleted");
             vBook_Id.setText("");
            vBook_Title.setText("");
            vAuthor.setText("");
            vPrice.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Can't delete");
        }
        
        }catch(Exception ex){
            System.out.println("Error in Book delete code");
        }
    }//GEN-LAST:event_vDeleteActionPerformed

    private void vBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vBackActionPerformed
        this.hide();
    }//GEN-LAST:event_vBackActionPerformed

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
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Author;
    private javax.swing.JLabel Book_Id;
    private javax.swing.JLabel Book_Title;
    private javax.swing.JLabel Issued_Date;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField vAuthor;
    private javax.swing.JButton vBack;
    private javax.swing.JTextField vBook_Id;
    private javax.swing.JTextField vBook_Title;
    private javax.swing.JButton vDelete;
    private javax.swing.JButton vEdit;
    private com.toedter.calendar.JDateChooser vIssued_Date;
    private javax.swing.JTextField vPrice;
    // End of variables declaration//GEN-END:variables
}
